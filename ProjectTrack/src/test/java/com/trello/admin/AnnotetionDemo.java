package com.trello.admin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotetionDemo 
{
	@BeforeSuite
	public void beforeShuite()
	{
		System.out.println("Before Shuite");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
	public void test() {
		System.out.println("I Am a test Script ");
		
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Before Test");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	@AfterSuite
	public void afterShuite()
	{
		System.out.println("after Shuite");
	}

}
