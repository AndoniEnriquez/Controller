package suite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import action.OtherAction;
import action.TestFlightsAction;
import dao.TestFlightsDao;
import hibernate.*;
import items.TestFlights;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestConnectionHibernate.class,
	TestInitHibernate.class,
	TestFlights.class,
	TestFlightsAction.class,
	OtherAction.class,
	TestFlightsDao.class
})

public class SuiteClass {}
