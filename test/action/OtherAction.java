/*
 * 
 */
package action;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import utils.HibernateUtils;

/**
 * The Class OtherAction.
 */
public class OtherAction {

	/** The flow action. */
	private FlowAction flowAction;
	
	/** The map action. */
	private MapAction mapAction;
	
	/** The pie action. */
	private PieAction pieAction;
	
	/**
	 * Initialize hibernate.
	 */
	@Before
	public void initializeHibernate(){
		HibernateUtils.start();
	}
	
	/**
	 * Test flow action.
	 */
	@Test
	public void testFlowAction() {
		flowAction = new FlowAction();
		assertEquals("success", flowAction.execute());
	}
	
	/**
	 * Test map action.
	 */
	@Test
	public void testMapAction() {
		mapAction = new MapAction();
		assertEquals("success", mapAction.execute());
	}
	
	/**
	 * Test pie action.
	 */
	@Test
	public void testPieAction() {
		pieAction = new PieAction();
		assertEquals("success", pieAction.execute());
	}
}
