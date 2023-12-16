import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumWebDriverTest {
    private WebDriver driver;
@Test
    public void start() throws InterruptedException {
        // locate where the chromedriver is
        System.setProperty("WebDriver.chrome.driver", "resources/chromedriver");
        //1. Open your chrome browser
        driver = new ChromeDriver();
        //2. Input your selenium Demo page URL (https://selenium-blog.herokuapp.com)
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(10000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. click on Signup button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        //5. Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("Gina11a");
        //6 input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("Gina11a@gmail.com");
        //7 Locate the password field and input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("admin");
        //8 click on the signup button
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/div")).click();

        //Quit browser.
    driver.quit();

}
    @AfterTest
    public void closeBrowser(){
        driver.quit();

    }

}









