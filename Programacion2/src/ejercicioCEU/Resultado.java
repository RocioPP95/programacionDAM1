package ejercicioCEU;

import java.util.Objects;

public class Resultado {
	private Integer golesLocales;
	private Integer golesVisitantes;

	public Resultado() {
		super();
		this.golesLocales = 0;
		this.golesVisitantes = 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitantes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(golesLocales, other.golesLocales)
				&& Objects.equals(golesVisitantes, other.golesVisitantes);
	}

	@Override
	public String toString() {
		return golesLocales + "-" + golesVisitantes;
	}

	public Integer getGolesLocales() {
		return golesLocales;
	}

	public void setGolesLocales(Integer golesLocales) {
		this.golesLocales = golesLocales;
	}

	public Integer getGolesVisitantes() {
		return golesVisitantes;
	}

	public void setGolesVisitantes(Integer golesVisitantes) {
		this.golesVisitantes = golesVisitantes;
	}

	public Boolean isVictoriaLocal() {
		if (golesLocales > golesVisitantes) {
			return true;
		} else
			return false;

	}

	public Boolean isVictoriaVisitante() {
		if (golesLocales < golesVisitantes) {
			return true;
		} else
			return false;

	}

	public Boolean isEmpate() {
		if (golesLocales == golesVisitantes) {
			return true;
		} else
			return false;

	}

}
