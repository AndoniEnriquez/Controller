package hibernate;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.HibernateUtils;

public class TestConnectionHibernate {

	private HibernateUtils hibernateUtils;

	@SuppressWarnings("static-access")
	@Test
	public void testStartFunction() {
		hibernateUtils = new HibernateUtils();
		hibernateUtils.start();
		
		assertNotNull("The sessionFactory was not initilized", hibernateUtils.getSessionFactory());
	}
	

	@SuppressWarnings("static-access")
	@Test
	public void testStopFunction() {
		hibernateUtils = new HibernateUtils();
		hibernateUtils.start();
		hibernateUtils.stop();
						
		assertTrue("The sessionFactory is closed", hibernateUtils.getSessionFactory().isClosed());
	}
}

