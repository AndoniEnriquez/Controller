/*
 * 
 */
package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ControllersDao;
import db_items.Controllers;

/**
 * The Class LoginAction.
 */
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	
	/** The controllersdao. */
	ControllersDao controllersdao;
	
	/** The controllers. */
	List<Controllers> controllers;

	/** The email. */
	private String email;
	
	/** The password. */
	private String password;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		controllersdao = new ControllersDao();
		controllers = controllersdao.list();
		
		for(int i=0; i < controllers.size() ; i++){
			if(controllers.get(i).getEmail().equals(email) && controllers.get(i).getPassword().equals(password)){
				Map session = ActionContext.getContext().getSession();
				session.put("logined","true");
				session.put("context", new Date());
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
	/**
	 * Logout.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	@SuppressWarnings("rawtypes")
	public String logout() throws Exception {
		Map session = ActionContext.getContext().getSession();
		session.remove("logined");
		session.remove("context");
		return SUCCESS;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param passwd the new password
	 */
	public void setPassword(String passwd) {
		this.password = passwd;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
