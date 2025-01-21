package AlumnoEj;

public class Curso {
	private Integer identificador;
	private String descripcion;
	private Alumno[] alumnos;
	private Integer numeroAlumnos;

	public Curso(Integer numeroAlumnos) {
		super();
		alumnos = new Alumno[numeroAlumnos];
	}

	public void addAlumno(Alumno x) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = x;
				break;
			}
		}

	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
