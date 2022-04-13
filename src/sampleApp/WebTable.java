package sampleApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\de.singh2\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/de.singh2/Downloads/Assignment.html");

        WebElement mytable=driver.findElement(By.xpath("/html/body/table/tbody"));
        List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));

        int rows_count = rows_table.size();

        System.out.println(rows_count );

    }
}
