package entidad;

public class usuario {
	private String rut;
	private String username;
	private String password;
	
	public usuario() {
		
	}
	public usuario(String rut, String username, String password) {
		this.rut = rut;
		this.username = username;
		this.password = password;
	}
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
