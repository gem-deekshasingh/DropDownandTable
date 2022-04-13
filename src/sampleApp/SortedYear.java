package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedYear {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\de.singh2\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/de.singh2/Downloads/Dropdown.html");
        WebElement ele =driver.findElement(By.id("dob-year"));
        Select select=new Select(ele);

        List original = new ArrayList();
        List temp=new ArrayList();
        List<WebElement>options=select.getOptions();
        for(WebElement e:options){
           original.add(e.getText());
           temp.add(e.getText());
        }
        System.out.println("original list"+original);


        Collections.sort(temp);
        System.out.println("sorted list"+temp);

        if (original==temp){
            System.out.println("year dropdown is sorted");
        }
        else {
            System.out.println("year dropdown is not sorted");
        }


      driver.close();

    }
}
