package testpckg;

import org.testng.annotations.Test;

import pagepckg.OrangeHRMPage;
import utilitiespckg.ExcelUtilsOrangeHRM;

public class OrangeHRMTest extends OrangeHRMBaseclass
{

	@Test
	public void verifyLogin() throws InterruptedException
	{
	
		OrangeHRMPage ob=new OrangeHRMPage(driver);
	
		String xl="C:\\Users\\Anjali\\OneDrive\\Desktop\\TestNG Excel\\OrangeHrmExcel.xlsx";
		String Sheet="Sheet1";
				
		int rowCount=ExcelUtilsOrangeHRM.getRowCount(xl, Sheet);
	
		for(int i=1;i<=rowCount;i++)
		{
			
			String UserName=ExcelUtilsOrangeHRM.getCellValues(xl, Sheet, i, 0);
			System.out.println("User name----------"+UserName);	
			
			String Pwd=ExcelUtilsOrangeHRM.getCellValues(xl, Sheet, i,1);
			System.out.println("Password----------"+Pwd);
		
			ob.setValues(UserName,Pwd);
			ob.login();	
			
			Thread.sleep(5000);
	
		}
		ob.logout();
	}	
	
}
