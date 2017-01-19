/*
 * 
 */
package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


import db_items.Flights;
import utils.HibernateUtils;

/**
 * The Class FlightsDAO.
 */
public class FlightsDAO extends HibernateUtils {
	
	/**
	 * List.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public List<Flights> list() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<Flights> flights = null;
		try {
			flights = (List<Flights>) session.createQuery("from Flights").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return flights;
	}
	
	/**
	 * Gets the plane name.
	 *
	 * @param id the id
	 * @return the plane name
	 */
	public String getPlaneName(int id) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = null;
		try {
			 query = session.createSQLQuery("select planeName(:plane_id)").setInteger("plane_id", id);
		}catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
		if (query != null){
			String name = String.valueOf(query.list());
			return deleteBrackets(name);
		}
		
		return "error";
	}

	/**
	 * Gets the gate name.
	 *
	 * @param id the id
	 * @return the gate name
	 */
	public String getGateName(int id) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = null;
		try {
			query = session.createSQLQuery("select gateName(:gate_id)").setInteger("gate_id", id);
		}catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
		if (query != null){
			String name = String.valueOf(query.list());
			return deleteBrackets(name);
		}
		return "error";
	}

	/**
	 * Gets the route name.
	 *
	 * @param id the id
	 * @return the route name
	 */
	public String getRouteName(int id) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = null;
		try {
			query = session.createSQLQuery("select routeName(:route_id)").setInteger("route_id", id);
		}catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		if (query != null){
			String name = String.valueOf(query.list());
			return deleteBrackets(name);
		}
		return "error";
	}
	
	/**
	 * Gets the airline name.
	 *
	 * @param id the id
	 * @return the airline name
	 */
	public String getAirlineName(int id) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = null;
		try {
			query = session.createSQLQuery("select airlineName(:plane_id)").setInteger("plane_id", id);
		}catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		if (query != null){
			String name = String.valueOf(query.list());
			return deleteBrackets(name);
		}
		return "error";
	}

	/**
	 * Delete brackets.
	 *
	 * @param str the str
	 * @return the string
	 */
	public String deleteBrackets(String str) {
		return str.substring(1, str.length() - 1);
	}
}
