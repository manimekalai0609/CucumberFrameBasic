package com.Stepdef;

import org.junit.BeforeClass;

import com.lib.LibGlobal;


public class Hooks extends LibGlobal {
	
	@BeforeClass
	
	public static void beforeMethod() {
		LibGlobal l=new LibGlobal();
		l.browserLauch();
	
	}
	
	
	
	
	
	
	
	
	
	

}
