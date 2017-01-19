/*
 * 
 */
package suite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import action.OtherAction;
import action.TestFlightsAction;
import dao.TestFlightsDao;
import hibernate.*;
import items.TestFlights;
import login.TestLoginAction;

/**
 * The Class SuiteClass.
 * Run all the tests
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestLoginAction.class,
	TestConnectionHibernate.class,
	TestInitHibernate.class,
	TestFlights.class,
	TestFlightsAction.class,
	OtherAction.class,
	TestFlightsDao.class
})

public class SuiteClass {}
