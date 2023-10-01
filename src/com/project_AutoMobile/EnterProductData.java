package com.project_AutoMobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EnterProductData {
	WebDriver driver;

	public EnterProductData(WebDriver driver) {
		this.driver = driver;
	}

	public void enterStartDate(String startdate) {
		driver.findElement(By.id("startdate")).sendKeys(startdate);
	}

	public void selectInsurance(String Insurance) {
		new Select(driver.findElement(By.id("insurancesum"))).selectByVisibleText(Insurance);
	}

	public void selectMeritRating(String Merit) {
		new Select(driver.findElement(By.id("meritrating"))).selectByVisibleText(Merit);
	}

	public void selectDamageInsurance(String damageIns) {
		new Select(driver.findElement(By.id("damageinsurance"))).selectByVisibleText(damageIns);
	}

	
	public void selectOptionalProducts(String optional) {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
	}
	public void selectOptionalProducts21(String optional1) {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
	}
	public void selectOptionalProducts3(String optional1) {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
	}

	public void selectOptionalProducts4(String optional1) {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
	}

	public void selectCourtesyCar(String courtesy) {
		new Select(driver.findElement(By.id("courtesycar"))).selectByVisibleText(courtesy);
	}

	public void clickNextBtn() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}
	public void selectOptionalProducts2(String optional) {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
	}
	
	public void selectDamageInsurance2(String damageIns) {
		new Select(driver.findElement(By.id("damageinsurance"))).selectByVisibleText(damageIns);
	}
}
