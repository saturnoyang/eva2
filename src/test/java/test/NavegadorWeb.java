package test;


import entidad.conexion;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavegadorWeb {
	
	public static void main(String[] args) {
		
	}
	
	private WebDriver driver;
	
  @Test
  public void f() {
	  WebElement cuadroBusqueda = driver.findElement(By.name("userName"));
	  //cuadroBusqueda.sendKeys("");
	  cuadroBusqueda.click();
	  cuadroBusqueda.submit();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  assertEquals("Error",driver.getTitle());
	  conexion.log(driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  
		String ruta = System.getProperty("user.dir") + "\\drivers\\ChromeDriver\\chromedriver.exe";
		conexion.log(ruta);
		
		System.setProperty("webdriver.chrome.driver", ruta);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:9090/eva2-webapp/index.jsp");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
