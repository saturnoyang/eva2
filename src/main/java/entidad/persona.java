package entidad;


import java.util.Date;

public class persona {
	private String Rut;
	private String Nombre;
	private String Apellido;
	private String Telefono;
	private Date FechaIngreso;

	
	public persona() {
		
	}
	
	public persona(	 String Rut,String Nombre,  String Apellido, String Telefono, Date FechaIngreso) {
		this.Rut = Rut;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Telefono = Telefono;
		this.FechaIngreso = FechaIngreso;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	
}
