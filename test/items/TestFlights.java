/*
 * 
 */
package items;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;

import db_items.Flights;
import utils.HibernateUtils;

/**
 * The Class TestFlights.
 */
public class TestFlights {

	/** The flights. */
	private Flights flights;

	/**
	 * Initialize hibernate.
	 */
	@Before
	public void initializeHibernate(){
		HibernateUtils.start();
	}
	
	/**
	 * Initialize empty F lights.
	 */
	@Before
	public void initializeEmptyFLights(){
		flights = new Flights();
	}
	
	/**
	 * Test flight id.
	 */
	@Test
	public void testFlightId() {
		int id = 0;
		flights.setId(id);
		assertEquals(id, flights.getId());

	}
	
	/**
	 * Test baggage id.
	 */
	@Test
	public void testBaggageId() {
		int baggage = 0;
		flights.setBaggage_id(baggage);
		assertEquals(baggage, flights.getBaggage_id());
	}
	
	/**
	 * Test gate id.
	 */
	@Test
	public void testGateId() {
		int gate = 0;
		flights.setGate_id(gate);
		assertEquals(gate, flights.getGate_id());

	}
	
	/**
	 * Test plane id.
	 */
	@Test
	public void testPlaneId() {
		int planeId = 0;
		flights.setPlane_id(planeId);
		assertEquals(planeId, flights.getPlane_id());

	}
	
	/**
	 * Test route id.
	 */
	@Test
	public void testRouteId() {
		int route = 0;
		flights.setRoute_id(route);
		assertEquals(route, flights.getRoute_id());
	}
	
	/**
	 * Test duration.
	 */
	@Test
	public void testDuration() {
		String duration = "00:30";
		flights.setDuration(duration);
		assertEquals(duration, flights.getDuration());
	}
	
	/**
	 * Test delay.
	 */
	@Test
	public void testDelay() {
		String delay = "00:30";
		flights.setDelay(delay);
		assertEquals(delay, flights.getDelay());
	}
	
	
	/**
	 * Test date departure.
	 */
	@Test
	public void testDateDeparture() {
		Timestamp timestamp = new Timestamp(0);
		flights.setDateDeparture(timestamp);
		assertEquals(timestamp, flights.getDateDeparture());
	}
	
	/**
	 * Test flights initializer full.
	 */
	@Test
	public void testFlightsInitializerFull(){
		flights = new Flights(0, 0, 0, 0, 0, null, null, null);
		assertEquals(0, flights.getId());
	}
	
	/**
	 * Test flights initializer medium.
	 */
	@Test
	public void testFlightsInitializerMedium(){
		flights = new Flights(0, 0, 0, 0, 0);
		assertEquals(0, flights.getGate_id());
	}
	
}
