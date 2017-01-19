/*
 * 
 */
package action;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import utils.HibernateUtils;

/**
 * The Class TestFlightsAction.
 */
public class TestFlightsAction {

	/** The flights action. */
	private FlightsAction flightsAction;
	
	/**
	 * Initialize hibernate.
	 */
	@Before
	public void initializeHibernate(){
		HibernateUtils.start();
	}
	
	/**
	 * Inits the flights action.
	 */
	@Before
	public void initFlightsAction(){
		flightsAction = new FlightsAction();
	}
	
	/**
	 * Test execute function.
	 */
	@Test
	public void testExecuteFunction() {	
		assertEquals("success", flightsAction.execute());
	}
	
	/**
	 * Test return list from dao.
	 */
	@Test
	public void testReturnListFromDao() {
		assertEquals("success", flightsAction.list());
	}
}
