package AutomationPackage;

import org.testng.annotations.DataProvider;

public class TestData {

		
			
		@DataProvider(name="logindata")
		
		public static Object[][] Testdata(){
			Object[][] obj = new Object[1][8];
			
			obj[0][0]="https://datdev.test-lcbs.honeywell.com";
			obj[0][1]="dcontractor37@datdev.lcbsconnect.com";
			obj[0][2]="lcbs@1234";
			obj[0][3]="Brinkers Jewelers 7300";
			obj[0][4]="dat28@yopmail.com";
			obj[0][5]="9535519066";	
			obj[0][6]="datOccupant";
			obj[0][7]="28";
			
			return obj;
				
	}
//		@DataProvider(name="mailinatorData")
//		public static Object[][] Testdata1(){
//			Object[][] obj = new Object[1][4];
//			
//			obj[0][0]="dat16@mailinator.com";
//			obj[0][1]="9535519066";
//			obj[0][2]="datOccupant";
//			obj[0][3]="16";
//			
//				
//			
//			return obj;
//				
//	}
//		@DataProvider(name="YOPdata")
//		public static Object[][] Testdata2(){
//			Object[][] obj = new Object[1][4];
//			
//			obj[0][0]="dat16@mailinator.com";
//			obj[0][1]="9535519066";
//			obj[0][2]="datOccupant";
//			obj[0][3]="16";
//			
//				
//			
//			return obj;
//				
//	}

}
