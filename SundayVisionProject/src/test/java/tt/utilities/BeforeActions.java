package tt.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	public void beforeActions(Scenario scen) throws Exception{
		
		System.out.println(">>>> intializing chrome driver >>>>>");
		
		setupDrivers.setupDriver();
		
		setupDrivers.driver.get("https://www.ebay.com/");
		
		System.out.println(scen.getName());
	}

}
