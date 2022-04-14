package sampleApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\de.singh2\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();


        String baseUrl = "//C:/Users/de.singh2/Downloads/Assignment.html";
        driver.get(baseUrl);

        List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
        rows.remove(0);

        LinkedHashSet<String> unique = new LinkedHashSet<>();

        for(int i=0;i< rows.size();i++) {
            unique.add(rows.get(i).getText());
        }

        System.out.println("Unique rows in table: ");
        for (String data:unique) {
            System.out.println(data);
        }




    }
}
