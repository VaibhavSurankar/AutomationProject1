package com.project_AutoMobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData 
{
	WebDriver driver;

	public EnterVehicleData(WebDriver driver)
	{
		this.driver = driver;
	}

   public void selectMake(String make)
    {
	   new Select(driver.findElement(By.xpath("//*[@id=\"make\"]"))).selectByVisibleText(make);  
    }
   
   public void enterEnginePerformance(String engperform)
   {
		driver.findElement(By.id("engineperformance")).sendKeys(engperform);
   }
   
   public void selectDom(String dom)
   {
	   driver.findElement(By.id("dateofmanufacture")).sendKeys(dom);
   }
   
   public void selectNumberOfSeats(String nos)
   {
	   new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(nos);
   }
   public void selectNumberOfSeats4(String nos)
   {
	   new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(nos);
   }
   
   public void selectFuelType(String fuel)
   {
	   new Select(driver.findElement(By.id("fuel"))).selectByVisibleText(fuel);
   }
   
   public void enterListPrice(String listprice)
   {
		driver.findElement(By.id("listprice")).sendKeys(listprice);
   }
   
   public void enterLicensePlateNumber(String license)
   {
	   driver.findElement(By.id("licenseplatenumber")).sendKeys(license);
   }
   public void enterAnnualMileage(String mileage)
   {
	   driver.findElement(By.id("annualmileage")).sendKeys(mileage);
   }
   
   public void clickNextInsurantData()
   {
		driver.findElement(By.id("nextenterinsurantdata")).click();
   }
   
 //New Code
   public void enterCylinderCapacity(String  enterCylinderCapacity ) {
   	driver.findElement(By.id("cylindercapacity")).sendKeys(enterCylinderCapacity);
   }

   public void selectModel(String selectModel) {
   	 new Select(driver.findElement(By.id("model"))).selectByVisibleText(selectModel);
   }

     public void clickonRightHand() {
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/p/label[1]")).click();
   } 

   public void enterPayload(String enterPayload) {
   		driver.findElement(By.id("payload")).sendKeys(enterPayload);
   	}

   public void enterTotalweight(String enterTotalweight) {
   		
   		driver.findElement(By.id("totalweight")).sendKeys(enterTotalweight);
   	}
   public void selectNumberOfSeats3(String nos)
   {
	   new Select(driver.findElement(By.id("numberofseatsmotorcycle"))).selectByVisibleText(nos);
   }

  
   

}
