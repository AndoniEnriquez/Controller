/*
 * 
 */
package initialization;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import notification.Notification;

/**
 * The Class InitSocketIO.
 */
public class InitSocketIO implements ServletContextListener {

	
	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			Notification.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			Notification.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
