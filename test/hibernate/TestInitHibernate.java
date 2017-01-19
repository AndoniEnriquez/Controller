/*
 * 
 */
package hibernate;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import initialization.InitHibernate;
import utils.HibernateUtils;

/**
 * The Class TestInitHibernate.
 */
public class TestInitHibernate {

	/** The init hibernate. */
	InitHibernate initHibernate;
	
	/** The hibernate utils. */
	HibernateUtils hibernateUtils;

	/**
	 * Test context initialized.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testContextInitialized() {
		initHibernate = new InitHibernate();
		initHibernate.contextInitialized(null);
		assertNotNull("The sessionFactory was not initilized", hibernateUtils.getSessionFactory());
	}
	

	/**
	 * Test context destroyed.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testContextDestroyed() {	
		initHibernate = new InitHibernate();
		initHibernate.contextInitialized(null);
		initHibernate.contextDestroyed(null);
		assertTrue("The sessionFactory is closed", hibernateUtils.getSessionFactory().isClosed());
	}
}
