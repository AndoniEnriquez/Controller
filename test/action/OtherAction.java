package action;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import utils.HibernateUtils;


public class OtherAction {

	private FlowAction flowAction;
	private MapAction mapAction;
	private PieAction pieAction;
	
	@Before
	public void initializeHibernate(){
		HibernateUtils.start();
	}
	
	@Test
	public void testFlowAction() {
		flowAction = new FlowAction();
		assertEquals("success", flowAction.execute());
	}
	
	@Test
	public void testMapAction() {
		mapAction = new MapAction();
		assertEquals("success", mapAction.execute());
	}
	
	@Test
	public void testPieAction() {
		pieAction = new PieAction();
		assertEquals("success", pieAction.execute());
	}
}
