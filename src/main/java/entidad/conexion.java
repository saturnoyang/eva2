package entidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	
	static Connection Conn = null;

 
	public static void main(String[] argv) {
 
		try {
			log("--------  JDBC connection to MySQL DB locally ------------");
			Conectarse();

			Conn.close(); // cerrar conexion
 
		} catch (SQLException e) {
 
			e.printStackTrace();
		}
	}
 
	public static String Conectarse() {
 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			log("Informacion: se detecta el MySQL JDBC Driver");
		} catch (ClassNotFoundException e) {
			log("Error, no se encuentra el JDBC driver. agregar la dependencia JDBC en Maven");
			e.printStackTrace();
			return "error";
		}
 
		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
			Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/platinum", "root", "");
			if (Conn != null) {
				log("Conectado a la BBDD, ahora se pueden realizar consultas.");
				return "ok";
			} else {
				log("Error al realizar la conexión!");
				return "error";
			}
		} catch (SQLException e) {
			log("MySQL Connection Failed!");
			e.printStackTrace();
			return "error";
		}
 
	}
 
	// Simple log utility
	public static void log(String string) {
		System.out.println(string);
 
	}
	
	
	
}
