package ejercicioCEU;

public abstract class Trabajadores {
	private String nombre;
	private Integer aņoNacimiento;
	private String nacionalidad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAņoNacimiento() {
		return aņoNacimiento;
	}
	public void setAņoNacimiento(Integer aņoNacimiento) {
		this.aņoNacimiento = aņoNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
