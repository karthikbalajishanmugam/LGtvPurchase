package org.TvPurchase.StepDefinition;

import org.amezon.resources.Commenactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commenactions{
	
	Commenactions c = new Commenactions();
	
	@Before
	public void beforeScenario() {
		c.Browserlaunch();
		
		
	}
	
	@After
	
public void afterScenario() {
		driver.quit();
		
	}

}
