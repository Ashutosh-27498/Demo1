package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.List;

public class AutosuggestiveDD {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver","C:\\Users\\ashut\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options=new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver=new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(2000);



        List<WebElement> list=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));

        for(WebElement li:list){
            Thread.sleep(2000);


            if(li.getText().equalsIgnoreCase("India")){

                li.click();
                break;
            }
        }

        Thread.sleep(1000);
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("Selenium");
        List<WebElement> suggetions=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));

        System.out.println(suggetions);
        for(WebElement suggetion:suggetions){


            if(suggetion.getText().equalsIgnoreCase("selenium interview questions")){

                suggetion.click();
                break;
            }
        }
      //  Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
    }
}
