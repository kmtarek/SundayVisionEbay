package tt.utilities;

import cucumber.api.java.After;

public class AfterActions {
	
	
	@After
	public void afterAction() {
		
		setupDrivers.tearDownDriver();
		
		System.out.println(">>>>> test completed>>>>>>");
	}

}
