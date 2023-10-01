package com.project_AutoMobile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class AllTests {
	WebDriver driver;
	EnterVehicleData evd;
	EnterInsurantData eid;
	EnterProductData epd;
	EnterPriceList pldata;
	EnterSendQuote sdata;

	@Test(priority = 1,dataProvider = "getAutomobileData")
	public void AutomobileTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover,
			String Type) {
		System.out.println("Testing Automobile");

		driver.findElement(By.linkText("Automobile")).click();

		// Vehicle Data
		evd.selectMake("Ford");
		evd.enterEnginePerformance("1500");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectNumberOfSeats("5");
		evd.selectFuelType("Diesel");
		evd.enterListPrice("95000");
		evd.enterLicensePlateNumber("MH34AE8045");
		evd.enterAnnualMileage("250");
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Vaibhav");
		eid.enterLastName("Surankar");
		eid.selectDob("09/14/2000");
		eid.selectGender("male");
		eid.enterAddress("Indora chowk Nagpur");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.enterCity("Nagpur");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.enterWebsite("www.unknown.com");
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectMeritRating("Super Bonus");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOptionalProducts("Euro Protection");
		epd.selectCourtesyCar("Yes");
		epd.clickNextBtn();

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("vsurankar416@gmail.com");
		sdata.EnterPhone("9511202729");
		sdata.EnteruserName("Mady87");
		sdata.EnterPassword("Megatron17");
		sdata.EnterConfirmPassword("Megatron17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

		
	}

	@DataProvider
	public Object[][] getAutomobileData() {
		return (new Object[][] { new Object[] { "234.00", "No", "No", "No", "Silver" },
			new Object[] { "690.00", "Submit", "2", "Limited", "Gold" },
			new Object[] { "1,355.00", "Submit", "5", "Limited", "Platinum" },
			new Object[] { "2,582.00", "Submit", "10", "Unlimited", "Ultimate" }, });


	}
	// New Truck
	
	@Test(priority = 2,dataProvider = "getAutomobileData")
	public void TruckTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover,
			String Type) throws Exception {
		System.out.println("Testing Truck");

		driver.findElement(By.linkText("Truck")).click();

		// Vehicle Data
		evd.selectMake("Ford");
		evd.enterEnginePerformance("1500");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectNumberOfSeats("5");
		evd.selectFuelType("Diesel");
		evd.enterPayload("242");
		evd.enterTotalweight("424");
		evd.enterListPrice("95000");
		evd.enterLicensePlateNumber("MH34AE8045");
		evd.enterAnnualMileage("250");
		Thread.sleep(2000);
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Vaibhav");
		eid.enterLastName("Surankar");
		eid.selectDob("09/14/2000");
		eid.selectGender("male");
		eid.enterAddress("Indora chowk Nagpur");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.enterCity("Nagpur");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.enterWebsite("www.unknown.com");
		Thread.sleep(2000);
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOptionalProducts21("Legal Defense Insurance");
		epd.clickNextBtn();

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("vsurankar416@gmail.com");
		sdata.EnterPhone("9511202729");
		sdata.EnteruserName("Mady87");
		sdata.EnterPassword("Megatron17");
		sdata.EnterConfirmPassword("Megatron17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

	}

	@DataProvider
	public Object[][] getAutomobileData2() {
		return (new Object[][] { new Object[] { "234.00", "No", "No", "No", "Silver" },
			new Object[] { "690.00", "Submit", "2", "Limited", "Gold" },
			new Object[] { "1,355.00", "Submit", "5", "Limited", "Platinum" },
			new Object[] { "2,582.00", "Submit", "10", "Unlimited", "Ultimate" }, });


	}
	
	@Test(priority = 3,dataProvider = "getAutomobileData")
	public void MotorcycleTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover,
			String Type) throws Exception {
		System.out.println("Testing Camper");

		driver.findElement(By.linkText("Motorcycle")).click();

		// Vehicle Data
		evd.selectMake("Ford");
		evd.selectModel("Motorcycle");
		evd.enterCylinderCapacity("242");
		evd.enterEnginePerformance("1500");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectNumberOfSeats3("2");
		evd.enterListPrice("95000");
		evd.enterAnnualMileage("250");
		Thread.sleep(2000);
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Vaibhav");
		eid.enterLastName("Surankar");
		eid.selectDob("09/14/2000");
		eid.selectGender("male");
		eid.enterAddress("Indora chowk Nagpur");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.enterCity("Nagpur");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.enterWebsite("www.unknown.com");
		Thread.sleep(2000);
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOptionalProducts3("Legal Defense Insurance");
		epd.clickNextBtn();

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("vsurankar416@gmail.com");
		sdata.EnterPhone("9511202729");
		sdata.EnteruserName("Mady87");
		sdata.EnterPassword("Megatron17");
		sdata.EnterConfirmPassword("Megatron17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

	}

	@DataProvider
	public Object[][] getAutomobileData3() {
		return (new Object[][] { new Object[] { "234.00", "No", "No", "No", "Silver" },
			new Object[] { "690.00", "Submit", "2", "Limited", "Gold" },
			new Object[] { "1,355.00", "Submit", "5", "Limited", "Platinum" },
			new Object[] { "2,582.00", "Submit", "10", "Unlimited", "Ultimate" }, });


	}
	
	@Test(priority =4 ,dataProvider = "getAutomobileData")
	public void CamperTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover,
			String Type) throws Exception {
		System.out.println("Testing Truck");

		driver.findElement(By.linkText("Camper")).click();

		// Vehicle Data
		evd.selectMake("Ford");
		evd.enterEnginePerformance("1500");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectNumberOfSeats("5");
		evd.clickonRightHand();
		evd.selectFuelType("Diesel");
		evd.enterPayload("242");
		evd.enterTotalweight("424");
		evd.enterListPrice("95000");
		evd.enterLicensePlateNumber("MH34AE8045");
		evd.enterAnnualMileage("250");
		Thread.sleep(2000);
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Vaibhav");
		eid.enterLastName("Surankar");
		eid.selectDob("09/14/2000");
		eid.selectGender("male");
		eid.enterAddress("Indora chowk Nagpur");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.enterCity("Nagpur");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.enterWebsite("www.unknown.com");
		Thread.sleep(2000);
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOptionalProducts4("Legal Defense Insurance");
		epd.clickNextBtn();

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("vsurankar416@gmail.com");
		sdata.EnterPhone("9511202729");
		sdata.EnteruserName("Mady87");
		sdata.EnterPassword("Megatron17");
		sdata.EnterConfirmPassword("Megatron17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

	}

	@DataProvider
	public Object[][] getAutomobileData4() {
		return (new Object[][] { new Object[] { "234.00", "No", "No", "No", "Silver" },
			new Object[] { "690.00", "Submit", "2", "Limited", "Gold" },
			new Object[] { "1,355.00", "Submit", "5", "Limited", "Platinum" },
			new Object[] { "2,582.00", "Submit", "10", "Unlimited", "Ultimate" }, });


	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/index.php#");

		evd = new EnterVehicleData(driver);
		eid = new EnterInsurantData(driver);
		epd = new EnterProductData(driver);
		pldata = new EnterPriceList(driver);
		sdata = new EnterSendQuote(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
