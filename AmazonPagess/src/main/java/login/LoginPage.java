package login;

	import org.openqa.selenium.By;

	public class LoginPage extends Webdriverfactory {

		
		  public void login() {
		    	getDriver().findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
				getDriver().findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("kpr544");
				getDriver().findElement(By.id("ap_password")).sendKeys("123456");
				getDriver().findElement(By.id("signInSubmit")).click();
		    }	    

	}



