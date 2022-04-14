package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\de.singh2\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        String baseUrl="https://www.facebook.com/";
        driver.get(baseUrl);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//input[@name=\"email\"]"))).
                click().keyDown(Keys.SHIFT).sendKeys("DEEKSHA SINGH").perform();
        action.moveToElement(driver.findElement(By.xpath("//input[@name=\"email\"]"))).keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c").perform();
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"))).click().perform();
        Thread.sleep(4000);
        WebElement k=driver.findElement(By.name("lastname"));
        k.sendKeys("v");
        driver.findElement(By.xpath("//*[@id=\"u_6_g_UD\"]")).sendKeys("6396577892");
        WebElement s=driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
        action.contextClick(s).sendKeys(Keys.DOWN).perform();

    }

}
