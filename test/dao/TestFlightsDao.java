/*
 * 
 */
package dao;

import static org.junit.Assert.assertEquals;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;


import utils.HibernateUtils;

/**
 * The Class TestFlightsDao.
 */
public class TestFlightsDao {

	/** The flights dao. */
	private FlightsDAO flightsDao;

	/**
	 * Initialize hibernate.
	 */
	@Before
	public void initializeHibernate(){
		HibernateUtils.start();
	}
	
	/**
	 * Inits the flights dao.
	 */
	@Before
	public void initFlightsDao(){
		flightsDao = new FlightsDAO();
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
	}
	
	/**
	 * Test get gate name.
	 */
	@Test
	public void testGetGateName() {
		String name_1 = flightsDao.getGateName(1);
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createSQLQuery("select gateName(:gate_id)").setInteger("gate_id", 1);
		String name_2 = String.valueOf(query.list());	
		String fin = flightsDao.deleteBrackets(name_2);
		assertEquals(name_1, fin);
	}
	
	/**
	 * Test get plane name.
	 */
	@Test
	public void testGetPlaneName() {
		String name_1 = flightsDao.getPlaneName(1);
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createSQLQuery("select planeName(:plane_id)").setInteger("plane_id", 1);
		String name_2 = String.valueOf(query.list());	
		String fin = flightsDao.deleteBrackets(name_2);
		assertEquals(name_1, fin);
	}
	
	/**
	 * Test get route name.
	 */
	@Test
	public void testGetRouteName() {
		String name_1 = flightsDao.getRouteName(1);
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createSQLQuery("select routeName(:route_id)").setInteger("route_id", 1);
		String name_2 = String.valueOf(query.list());	
		String fin = flightsDao.deleteBrackets(name_2);
		assertEquals(name_1, fin);
	}
	
	/**
	 * Test get airline name.
	 */
	@Test
	public void testGetAirlineName() {
		String name_1 = flightsDao.getAirlineName(1);
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createSQLQuery("select airlineName(:plane_id)").setInteger("plane_id", 1);
		String name_2 = String.valueOf(query.list());	
		String fin = flightsDao.deleteBrackets(name_2);
		assertEquals(name_1, fin);
	}
	
}
