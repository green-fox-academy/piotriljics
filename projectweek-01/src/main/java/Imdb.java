import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Imdb {
    private static String password = System.getenv("password");

    public static void main(String[] args) {
        //f8 javascript freeze

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Péter\\Documents\\GeckoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions actions = new Actions(driver);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://www.imdb.com");
        logIn("piotriljics@gmail.com", password, driver);
        searchForMovie(driver, "werckmeister", wait);
        addToWatchlist(driver);
        searchForMovie(driver, "memento", wait);
        addToWatchlist(driver);
        deleteWatchlist(driver, wait, actions);
        searchForMovie(driver, "batman forever", wait);
        rateMovie(driver, wait, 1);
        logOut(wait);
    }

    public static void logIn(String email, String password, WebDriver driver) {
        driver.findElement(By.id("imdb-signin-link")).click();
        driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]")).click();
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
    }

    public static void searchForMovie(WebDriver driver, String titleOfMovie, WebDriverWait wait) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navbar-query")));
        driver.findElement(By.id("navbar-query")).click();
        driver.findElement(By.id("navbar-query")).sendKeys(titleOfMovie);
        driver.findElement(By.id("navbar-submit-button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();
    }

    public static void addToWatchlist(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/div/div[2]/div[1]/div[1]/div")).click();
    }

    public static void deleteWatchlist(WebDriver driver, WebDriverWait wait, Actions actions) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navWatchlistMenu")));
        driver.findElement(By.id("navWatchlistMenu")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[1]/div/span/div/div/div[1]/div/div[1]/a")).click();
        WebElement selectAll = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("totalCheck")));
        actions.moveToElement(selectAll).click().build().perform();
        selectAll = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("delete_items")));
        actions.moveToElement(selectAll).click().build().perform();
        driver.findElement(By.xpath("//*[@id=\"delete_items_form\"]/div/input")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[1]/button")).click();
    }

    public static void rateMovie(WebDriver driver, int number) {
        driver.findElement(By.xpath("//*[@id=\"star-rating-widget\"]/div/button/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"star-rating-widget\"]/div/div/span[1]/span/a[" + number + "]")).click();
    }

    public static void logOut(WebDriverWait wait) {
        WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("nblogout")));
        logout.click();
    }

    //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    //actions.moveToElement(driver.findElement(By.xpath
    //(“/html/body/div[2]/div/div[1]/div[2]/div[3]/ul/li/span”))).perform();


    //WebElement navbar = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("navbar-query")));
    //navbar.click();
    //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("navbar-query")));
    //driver.findElement(By.id("navbar-query")).click();
    //driver.findElement(By.id("navbar-query")).sendKeys("memento");
    //driver.findElement(By.id("navbar-submit-button")).click();
    //driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();

       /*driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/div/div[2]/div[1]/div[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/select/option[2]")).click();
        WebElement selectAll = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("totalCheck")));
        actions.moveToElement(selectAll).click().build().perform();
        //actions.moveToElement(driver.findElement(By.id("totalCheck"))).click(); <-not working with this way the two lines above are good;)
        //actions.moveToElement(driver.findElement(By.id("delete_items"))).click(); <- same here
        selectAll = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("delete_items")));
        actions.moveToElement(selectAll).click().build().perform();
        driver.findElement(By.xpath("//*[@id=\"delete_items_form\"]/div/input")).click();
        driver.navigate().refresh();
        WebElement waitMore = wait.until(ExpectedConditions.elementToBeClickable(By.id("navbar-query")));
        waitMore.click();
        //actions.moveToElement(waitMore).click().build().perform(); <-see above
        //driver.findElement(By.id("navbar-query")).click();
        driver.findElement(By.id("navbar-query")).sendKeys("batman forever");
        driver.findElement(By.id("navbar-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();
        driver.findElement(By.xpath(("/html/body/div[2]/div/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]/div/button")));
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]/div/div/span[1]/span/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"nblogout\"]")).click();
    }*/

}
