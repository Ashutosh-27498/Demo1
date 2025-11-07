package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class enable_disable {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.edge.driver", "C:\\Users\\ashut\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.spicejet.com/");

        Thread.sleep(2000);

       // driver.findElement(By.id("c")).click();
       driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]")).click();

        if(driver.findElement(By.xpath("//div[@data-testid=\"return-date-dropdown-label-test-id\"]/div")).getDomAttribute("style").contains("1")){

            System.out.println("Is enabled");
        }
    }
}
