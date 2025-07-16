package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage 
{

	
	WebDriver driver;
	  
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement userName;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement password;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement loginButton;
    
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")
    WebElement firstMenu;
    
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
    WebElement logoutButton;
    
    
    public OrangeHRMPage(WebDriver driver) 
    {
	      this.driver=driver; 
	      PageFactory.initElements(driver,this);
	 
    }
	public void setValues(String name,String pwd) 
    {
	        userName.clear();
	        userName.sendKeys(name);
	        
	        password.clear();
	        password.sendKeys(pwd); 
	      
    }
    public void login()	
    {   
        loginButton.click();
        
    }
    public void logout() throws InterruptedException	
    {   
    	firstMenu.click();
    	Thread.sleep(2000);
        logoutButton.click();
        
    }
    
}
