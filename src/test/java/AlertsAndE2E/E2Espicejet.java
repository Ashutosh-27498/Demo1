package AlertsAndE2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class E2Espicejet {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver", "C:\\Users\\ashut\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.spicejet.com/");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]")).click();


        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//div[@class=\"css-76zvg2 r-1xedbs3 r-ubezar\"][contains(text(),'BOM')]")).click();

        driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq\"] //div[text()=\"International\"]")).click();

        driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-19yat4t r-1rt2jqs\"] //div[text()=\"DXB\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[2]/div[6]/div")).click();


        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/div[3]/div/div[1]/div")).click();

        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div[3]/div/div[3]")).click();
    }
}
