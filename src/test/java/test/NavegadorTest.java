package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import entidad.conexion;


public class NavegadorTest {
	public static void main(String[] args) {
		
		String ruta = System.getProperty("user.dir") 
				+ "\\drivers\\ChromeDriver\\chromedriver.exe";
		conexion.log(ruta);
		
		System.setProperty("webdriver.chrome.driver", ruta);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youtube.com");
		
	}

}
