package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class test {

    public static void main(String[] args){

        String url = "htttps://www.facebook.com/";

        //here add the path where you save your file
        System.setProperty("webdriver.chrome.driver", "D:\\Dam2final\\Practicas\\pSel1\\src\\main\\resources\\drivers\\chromedriver.exe");

        //initialize the webdriver,here we are instantiating it
        WebDriver driver = new ChromeDriver();

        // open to a website
        driver.get("https://facebook.com");

        // maximize the webbrowser
        driver.manage().window().maximize();

        //add credentials and the variables have been set
        // the lists of the boxes are input, for example the name box of facebook
        String correo = " ";
        String contraseña = " ";

        //here we are referencing all the values within a website
        //tag is to find all the names that have a tag
        WebElement usernameInput = driver.findElement(By.id("correo"));
        WebElement passwordInput = driver.findElement(By.id("contraseña"));
        WebElement loginBtn = driver.findElement(By.id("entrar-button"));

        //login
        //here we are searching with a locator trying to enter the web
        usernameInput.sendKeys(correo);
        passwordInput.sendKeys(contraseña);
        //loginBtn.click();

        //locator by CLASS NAME
        //WebElement loginBtn = driver.findElement(By.className(""));

        //locator by name
        // make a locator by name
        WebElement loginBtn = driver.findElement(By.name("login-button"));

        //locator by Xpath
        WebElement loginBtn

        //input we are verifying that it returns the elements
        System.out.println("Vamos a verificar cuantos elementos hemos encontrado" + inputs.site());

        //create a "for" to iterate each of the elements
        for(int i =0; i < inputs.size(); i++) {
            if (i = 0) {
                inputs.get(i).sendKeys(username);
                //two iterate
            } else if (i == 1) {
                inputs.get(i).sendKeys(password);
            } else {
                inputs.get(i).click();
            }

        }
        // This close is created so that every time an instance is created, the web page closes
        driver.close();

        // trying to do the test with assert
        @test
        fun `does not store invalid location`(){
            val bogusLocationString = "bogus location"
            val user= User(locationId = locationRepository.findString(bogusLocationString)?.id)
            val request: HttpEntity<String> = HttpEnt
        }
    }
}
