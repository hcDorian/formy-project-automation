import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Vince Masuka");

        WebElement date = driver.findElement(By.xpath("//*[@id=\"date\"]"));
        date.sendKeys("28/01/1997");

        driver.quit();
    }
}
