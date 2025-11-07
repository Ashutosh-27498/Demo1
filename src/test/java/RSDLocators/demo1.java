package RSDLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class demo1 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver","C:\\Users\\ashut\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options=new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver=new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String Password=demo1.getpassword(driver);
        System.out.println(Password);

        Thread.sleep(1000);

        //driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[contains(text(),'Go to')]")).click();



        driver.findElement(By.xpath("//div[@class=\"form-container sign-in-container\"]/form/input[@id=\"inputUsername\"]")).sendKeys("Ashutosh");

        driver.findElement(By.xpath("//div[@class=\"form-container sign-in-container\"]/form/input[@placeholder=\"Password\"]")).sendKeys(Password);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();

       String logindetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText();
        System.out.println(logindetails);

        Assert.assertEquals(logindetails,"Hello Ashutosh,");



    }

    public static String getpassword(WebDriver driver){


        driver.get("https://rahulshettyacademy.com/locatorspractice/");


        driver.findElement(By.xpath("//div[@class=\"forgot-pwd-container\"]/a[contains(text(),'Forgot your pass')]")).click();

        WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div[1]/form/h2")));

        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();


        String Pass=driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/p")).getText();

        //Please use temporary password 'rahulshettyacademy' to Login.

        String[] password=Pass.split("'");
        String[] Password1=password[1].split("'");
        String Password=Password1[0];


        return Password;




    }
}
