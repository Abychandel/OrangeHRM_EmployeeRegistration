package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInvalidData
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("abc", "xyz");
		boolean res = lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("System displaying appropriate error message for invalid inputs, test pass");
		}else
		{
			System.out.println("System not displaying appropriate error message for invalid inputs, test fail");
		}
		AppUtils.closeApp();
	}

}
