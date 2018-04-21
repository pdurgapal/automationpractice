package com.automationpractice.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderpractice {
	
	@DataProvider(name="login")
	public Object[][] login()
	{
		Object[][] result=new Object[3][2];
		result[0][0]="admin1";
		result[0][1]="manager1";
		result[1][0]="admin2";
		result[1][1]="manager2";
		result[2][0]="admin3";
		result[2][1]="manager3";
		
	return result;
		
	}
	@Test(dataProvider="login")
	
		public void testlogin(String username,String password)
		{
			System.out.println("name is"+username);
			System.out.println("password is"+password);
		}
}

