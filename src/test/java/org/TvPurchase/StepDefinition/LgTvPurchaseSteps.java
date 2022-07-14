package org.TvPurchase.StepDefinition;

import java.io.IOException;

import org.amezon.resources.Commenactions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LgTvPurchaseSteps extends Commenactions {
	Commenactions c = new Commenactions();
	
	@Given("User launch the Amezon Site")
	public void user_launch_the_Amezon_Site() {
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lg tv",Keys.ENTER);;
		
	}

	@When("User search the TV brand")
	public void user_search_the_TV_brand() {
     WebElement select = driver.findElement(By.xpath("(//span[contains(text(),'32LM563BPTC')])[1]"));
     select.click();
	}

	@When("User Select the Product")
	public void user_Select_the_Product() throws InterruptedException {
	   c.WindowHandle();
	}

	@Then("User add the product to add to cart")
	public void user_add_the_product_to_add_to_cart() throws IOException {
	    c.screenshot();
	}


}
