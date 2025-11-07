package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DynamicDropdowns {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver","C:\\Users\\ashut\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options=new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver=new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");



//        driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value=\"BLR\"]")).click();


        Actions ac=new Actions(driver);

        ac.moveToElement(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"))).click().build().perform();
        Thread.sleep(1000);
        ac.moveToElement(driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value=\"BLR\"]"))).click().build().perform();
        ac.moveToElement(driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"DED\"]"))).click().build().perform();
      //  driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"DED\"]")).click();


        driver.close();



    }
}
