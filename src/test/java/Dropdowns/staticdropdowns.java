package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class staticdropdowns {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver","C:\\Users\\ashut\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options=new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver=new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown= driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));

        Select s1=new Select(staticDropdown);
        s1.selectByIndex(1);

        //get the selected option by getFirstSelectedOption();
        WebElement selectedele=s1.getFirstSelectedOption();
        System.out.println(selectedele.getText());

        //DropDown without select tag

        driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).getText());



        for(int i=1;i<9;i++) {
            driver.findElement(By.xpath("//div[@id=\"divpaxOptions\"]/div[1]/child::div[2]/span[@id=\"hrefIncAdt\"]")).click();

//            String passenger=driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).getText();
//            String[] num=passenger.split(" ");
//            int a=Integer.parseInt(num[0]);
//
//            if(a==4){
//                break;
//            }

        }

        driver.findElement(By.xpath("//*[@id=\"btnclosepaxoption\"]")).click();
       System.out.println(driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).getText());


       driver.close();
       driver.quit();
    }
}
