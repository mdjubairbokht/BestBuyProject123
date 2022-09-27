package bb.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	public void beforeActions(Scenario scen){
		System.out.print("---Initializing Driver---");
		SetupDrivers.SetupDrive();
		System.out.print("Test Scenario Name : " + scen.getName());
		
	}

}
