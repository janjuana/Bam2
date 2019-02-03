package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import testUtils.BaseClass;

public class Hooks {

	@Before
	public static void start() {
		BaseClass.setUp();
	}
	
	@After
	public static void teardown() {
		BaseClass.tearDown();
	}
}
