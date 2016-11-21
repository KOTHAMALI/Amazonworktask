package test;


import org.testng.annotations.Test;

import login.LoginPage;


	public class VerifyLogin {
		
		@Test
		public void Loginverification(){
			
			LoginPage login = new LoginPage();
			login.intializeWebDriver();
			login.login();
			login.tearDown();
		}

	}





