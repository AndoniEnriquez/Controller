package action;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import utils.HibernateUtils;


public class TestFlightsAction {

	private FlightsAction flightsAction;
	
	@Before
	public void initializeHibernate(){
		HibernateUtils.start();
	}
	
	@Before
	public void initFlightsAction(){
		flightsAction = new FlightsAction();
	}
	
	@Test
	public void testExecuteFunction() {	
		assertEquals("success", flightsAction.execute());
	}
	
	@Test
	public void testReturnListFromDao() {
		assertEquals("success", flightsAction.list());
	}
}
