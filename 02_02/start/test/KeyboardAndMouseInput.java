import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        // Set the driver location
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver_linux64/chromedriver");

        //Instantiate a new driver object
        WebDriver driver = new ChromeDriver();

        //Navigate the driver to desired website
        driver.get("https://formy-project.herokuapp.com/keypress");

        //Find the input element
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys( "Vince Masuka");

        WebElement button = driver.findElement(By.id("button"));

        driver.quit();
    }
}
