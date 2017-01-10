package SANITY_TEST;

import org.testng.annotations.Test;

public class TestNG {
	
		
		@Test(groups = { "smokeTest", "alerts","webapp","sanity" }, enabled =false, dataProviderClass = TestDataAlert.class, dataProvider = "logindataAlert")
		public void CreateNewAlert(String url, String username, String password, String BuildingName, String RTUname, String AlertType, String CreateAlert, String Priority, String PointName, String limit, String editalert) throws InterruptedException
				 {
	
					String[] a = new String[11];
					a[0] = url;
					a[1] = username;
					a[2] = password;
					a[3] = BuildingName;
					a[4] = RTUname;
					a[5] = AlertType;
					a[6] = CreateAlert;
					a[7] = Priority;
					a[8] = PointName;
					a[9] = limit;
					a[10] = editalert;
										
		            CreatingNewAlert.CreateNewAlert(a);        
			
			}
		
		@Test(groups = { "smokeTest", "alerts","webapp","sanity" }, enabled =false, dataProviderClass = TestDataAlert.class, dataProvider = "logindataAlert")
		public void FindAlert(String url, String username, String password, String BuildingName, String RTUname, String AlertType, String CreateAlert, String Priority, String PointName, String limit, String editalert) throws InterruptedException
				 {
	
					String[] a = new String[11];
					a[0] = url;
					a[1] = username;
					a[2] = password;
					a[3] = BuildingName;
					a[4] = RTUname;
					a[5] = AlertType;
					a[6] = CreateAlert;
					a[7] = Priority;
					a[8] = PointName;
					a[9] = limit;
					a[10] = editalert;
										
		            FindingAlert.FindAlert(a);
			}

		@Test(groups = { "smokeTest", "alerts","webapp","sanity" }, enabled =true, dataProviderClass = TestDataAlert.class, dataProvider = "logindataAlert")
		public void AlertCount(String url, String username, String password, String BuildingName, String RTUname, String AlertType, String CreateAlert, String Priority, String PointName, String limit, String editalert) throws InterruptedException
				 {
	
					String[] a = new String[11];
					a[0] = url;
					a[1] = username;
					a[2] = password;
					a[3] = BuildingName;
					a[4] = RTUname;
					a[5] = AlertType;
					a[6] = CreateAlert;
					a[7] = Priority;
					a[8] = PointName;
					a[9] = limit;
					a[10] = editalert;
										
		            Alertcount.AlertCount(a);
			}
		
		@Test(groups = { "smokeTest", "alerts","webapp","sanity" }, enabled =false, dataProviderClass = TestDataAlert.class, dataProvider = "logindataAlert")
		public void AlertDetails(String url, String username, String password, String BuildingName, String RTUname, String AlertType, String CreateAlert, String Priority, String PointName, String limit, String editalert) throws InterruptedException
				 {
	
					String[] a = new String[11];
					a[0] = url;
					a[1] = username;
					a[2] = password;
					a[3] = BuildingName;
					a[4] = RTUname;
					a[5] = AlertType;
					a[6] = CreateAlert;
					a[7] = Priority;
					a[8] = PointName;
					a[9] = limit;
					a[10] = editalert;
										
		            TestNG6.AlertDetails(a);
			}
		
		@Test(groups = { "smokeTest", "alerts","webapp","sanity" }, enabled =false, dataProviderClass = TestDataAlert.class, dataProvider = "logindataAlert")
		public void Enable_Disable_Alert(String url, String username, String password, String BuildingName, String RTUname, String AlertType, String CreateAlert, String Priority, String PointName, String limit, String editalert) throws InterruptedException
				 {
	
					String[] a = new String[11];
					a[0] = url;
					a[1] = username;
					a[2] = password;
					a[3] = BuildingName;
					a[4] = RTUname;
					a[5] = AlertType;
					a[6] = CreateAlert;
					a[7] = Priority;
					a[8] = PointName;
					a[9] = limit;
					a[10] = editalert;
										
		            TestNG3.enable_disable_alert(a);
			
			}

		@Test(groups = { "smokeTest", "alerts","webapp","sanity" }, enabled =false, dataProviderClass = TestDataAlert.class, dataProvider = "logindataAlert")
		public void EditAlert(String url, String username, String password, String BuildingName, String RTUname, String AlertType, String CreateAlert, String Priority, String PointName, String limit, String editalert) throws InterruptedException
				 {
	
					String[] a = new String[11];
					a[0] = url;
					a[1] = username;
					a[2] = password;
					a[3] = BuildingName;
					a[4] = RTUname;
					a[5] = AlertType;
					a[6] = CreateAlert;
					a[7] = Priority;
					a[8] = PointName;
					a[9] = limit;
					a[10] = editalert;
										
		            EditingAlert.EditAlert(a);
			
			}
		
		
		
		
	

	}


