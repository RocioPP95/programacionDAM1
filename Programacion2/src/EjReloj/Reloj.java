package EjReloj;

import java.util.Objects;

public class Reloj {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24Horas;

	public Reloj() {
		super();

		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
		this.formato24Horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formato24Horas = true;
	}

	public String toString() {
		if (!check()) {
			return "Hora no es correcta";
		}

		if (this.formato24Horas) {
			if (horas < 10) {
				String horasCeros = "0" + horas.toString();
				return horasCeros + ":" + minutos + ":" + segundos;
			}
		

		}
		return null;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}

	public void setFormato24Horas(Boolean formato24Horas) {
		this.formato24Horas = formato24Horas;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;

	}

	public void ponerEnhora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Boolean check() {
		if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
			return true;

		} else

			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

	public String noCerosHoras() {
		if (horas < 10) {
			return "0" + horas.toString();

		}
		return null;
	}

	public String noCerosMinutos() {
		if (horas < 10) {
			return "0" + minutos.toString();

		}
		return null;
	}

	public String noCerosSegundos() {
		if (horas < 10) {
			return "0" + segundos.toString();

		}
		return null;
	}
}
