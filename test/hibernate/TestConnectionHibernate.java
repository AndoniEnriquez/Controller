/*
 * 
 */
package hibernate;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.HibernateUtils;

/**
 * The Class TestConnectionHibernate.
 */
public class TestConnectionHibernate {

	/** The hibernate utils. */
	private HibernateUtils hibernateUtils;

	/**
	 * Test start function.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testStartFunction() {
		hibernateUtils = new HibernateUtils();
		hibernateUtils.start();
		
		assertNotNull("The sessionFactory was not initilized", hibernateUtils.getSessionFactory());
	}
	

	/**
	 * Test stop function.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testStopFunction() {
		hibernateUtils = new HibernateUtils();
		hibernateUtils.start();
		hibernateUtils.stop();
						
		assertTrue("The sessionFactory is closed", hibernateUtils.getSessionFactory().isClosed());
	}
}

