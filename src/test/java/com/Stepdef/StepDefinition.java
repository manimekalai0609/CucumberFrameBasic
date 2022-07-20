package com.Stepdef;

import org.junit.Assert;

import com.lib.LibGlobal;
import com.pom.PageObjectModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal {
	
	@Given("when user launch the facebook application")
	public void when_user_launch_the_facebook_application() {
		
	 Hooks.beforeMethod();
	  
	}

	@When("user Enter the valid userName {string} and valid passWord {string}")
	public void user_enter_the_valid_user_name_and_valid_pass_word(String string, String string2) {
		PageObjectModel pom=new PageObjectModel();
		pom.UserNameAndPassWord(string, string2);
	
	}

	@When("then click on the submit button")
	public void then_click_on_the_submit_button() {
		PageObjectModel pom=new PageObjectModel();
		pom.click();
	  
	}

	@Then("verify the Title and home page URL")
	public void verify_the_home_page() {
		LibGlobal lg=new LibGlobal();
		
		String currentUrl = lg.getCurrentUrl();
		String title = lg.getTitle();
		
		//System.out.println(currentUrl+"\n"+title);
		Assert.assertEquals("Facebook",title);
		
		System.out.println("verified Home Page");
	
	}
	
}
