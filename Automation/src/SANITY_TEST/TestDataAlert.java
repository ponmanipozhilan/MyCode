package SANITY_TEST;

import org.testng.annotations.DataProvider;

public class TestDataAlert {

		
			
		@DataProvider(name="logindataAlert")
		
		public static Object[][] Testdata(){
			Object[][] obj = new Object[1][11];
			
			
			obj[0][0]="https://atqa.testqa-lcbs.honeywell.com";
			obj[0][1]="JSmith1@atqa.lcbsconnect.com";
         	obj[0][2]="lcbs@123";
			obj[0][3]="Test";
			obj[0][4]="RTU61";
			obj[0][5]="Digital";	
			obj[0][6]="Create Alert";
			obj[0][7]="High";
			obj[0][8]="Dirty Filter";
			obj[0][9]="0-Normally Closed";
			obj[0][10]="Edit Alert";
			
			return obj;
				
	}
}