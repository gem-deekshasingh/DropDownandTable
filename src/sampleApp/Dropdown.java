package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\de.singh2\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/de.singh2/Downloads/Dropdown.html");
        WebElement day=driver.findElement(By.id("dob-day"));
        Select selectDay=new Select(day);
        selectDay.selectByValue("05");

        WebElement month=driver.findElement(By.id("dob-month"));
        Select selectMonth=new Select(month);
        selectMonth.selectByValue("05");

        WebElement year=driver.findElement(By.id("dob-year"));
        Select selectYear=new Select(year);
        selectYear.selectByValue("2005");


    }
}
