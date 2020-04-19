package StepDefinition;

import entidad.conexion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	
	WebDriver driver;
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		conexion.log("en este paso se abre el navegador google chrome");
		
		String ruta = System.getProperty("user.dir") + "\\drivers\\ChromeDriver\\chromedriver.exe";
		conexion.log(ruta);
		
		System.setProperty("webdriver.chrome.driver", ruta);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:9090/eva2-webapp/index.jsp");		
	}
	
	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
		conexion.log("en este paso ingresa las credenciales de usuario");
		conexion.log("en este paso ingresa el nombre de usuario y contraseña en la pagina de login");
		
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);		
	}
	
	@Then("inicia sesion")
	public void inicia_sesion() {
		conexion.log("en este paso iniciamos sesion con los datos ingresados");
		driver.findElement(By.id("loginbtn")).click();
	}

}
