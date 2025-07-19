package com.app.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation_One {
	
	@Test
	public void test1() {
		String s = "Aiite";
		// Assert - C
		//Hard Assert and SoftAssert
		// method - assertTrue, assertFalse, asserEquals
		// Hard Assert- Assert C
		Assert.assertEquals("Aiit", s);
		System.out.println("testing the hard assert");
	}
	
	
	@Test
	public void test2() {
		String s = "Aiite";
		// Assert - C
		//Hard Assert and SoftAssert
		// method - assertTrue, assertFalse, asserEquals
		// Hard Assert- Assert C
		Assert.assertTrue(s.contains("A"));
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		String s = "Aiite";
		// Assert - C
		//Hard Assert and SoftAssert
		// method - assertTrue, assertFalse, asserEquals
		// Hard Assert- Assert C
		Assert.assertFalse(s.contains("z"));
		System.out.println("test3");
	}
	
	@Test
	public void test4() {
		String s = "Aiite";
		//SoftAssert
		// method - assertTrue, assertFalse, asserEquals
		SoftAssert s1 = new SoftAssert();
		s1.assertAll();
		s1.assertEquals("Aii", s);
		System.out.println("test3");
	}

}
