package dao;

import static org.junit.Assert.assertEquals;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;


import utils.HibernateUtils;

public class TestFlightsDao {

	private FlightsDAO flightsDao;

	@Before
	public void initializeHibernate(){
		HibernateUtils.start();
	}
	
	@Before
	public void initFlightsDao(){
		flightsDao = new FlightsDAO();
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
	}
	
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
