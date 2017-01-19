/*
 * 
 */
package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * The Class HibernateUtils.
 */
public class HibernateUtils {

	/** The session factory. */
	private static SessionFactory sessionFactory;
	
	/**
	 * Start.
	 */
	public static void start() {
		sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	}
	
	/**
	 * Stop.
	 */
	public static void stop() {
		sessionFactory.close();
	}

	/**
	 * Gets the session factory.
	 *
	 * @return the session factory
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}