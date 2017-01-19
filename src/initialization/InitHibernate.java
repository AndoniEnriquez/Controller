/*
 * 
 */
package initialization;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import utils.HibernateUtils;

/**
 * The Class InitHibernate.
 */
public class InitHibernate implements ServletContextListener {

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		HibernateUtils.stop();
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		HibernateUtils.start();
	}
}

