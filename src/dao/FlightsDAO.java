package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import db_items.Flights;
import utils.HibernateUtils;

public class FlightsDAO extends HibernateUtils {

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

	public String deleteBrackets(String str) {
		return str.substring(1, str.length() - 1);
	}
}
