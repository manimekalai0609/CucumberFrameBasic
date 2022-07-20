package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class PageObjectModel extends LibGlobal {
	
	public PageObjectModel(){
		
		PageFactory.initElements(driver, this);	
	
	}

	@FindBy(id="email")
	WebElement d1;
	@FindBy(id="pass")
	WebElement d2;
	@FindBy(xpath="//button[@value='1']")
	WebElement d3;
	public WebElement getD1() {
		return d1;
	}
	public WebElement getD2() {
		return d2;
	}
	public WebElement getD3() {
		return d3;
	}	
	
public void UserNameAndPassWord(String userName, String passWord) {
	
	LibGlobal l=new LibGlobal();
    l.sendKeys(getD1(), userName);
    l.sendKeys(getD2(), passWord);
  
}
	public void click() {
		
		LibGlobal l=new LibGlobal();
		l.Click(getD3());

	}
}
