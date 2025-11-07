import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class checkboxes {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver", "C:\\Users\\ashut\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://www.spicejet.com/");
//
//        Actions ac = new Actions(driver);
//
//        WebElement addons = driver.findElement(By.xpath("//div[contains(@class,'i-pad-header-')]/descendant::div[contains(text(),'Add-ons')]"));
//
//        Thread.sleep(1000);
//        WebElement studentDiscount = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[6]/div/a[1]/div/div"));
//
//        ac.moveToElement(addons).moveToElement(studentDiscount).click().build().perform();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();

        boolean status=driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected();

        Assert.assertTrue(status);

        driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();

        boolean status1=driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected();


        Assert.assertFalse(status1);

        List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        System.out.println(checkboxs.size());


        driver.navigate().refresh();

        System.out.println("Comment 1");
        System.out.println("Comment 1");

        System.out.println("Comment 1");

        System.out.println("Comment 1");



    }}