package repaso7Academia;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Academia {
	private String Ciudad;
	private Integer tlfn;
	private List<Curso> listaCursos;

	public Academia() {
		super();
		this.listaCursos = new ArrayList<>();
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public Integer getTlfn() {
		return tlfn;
	}

	public void setTlfn(Integer tlfn) {
		this.tlfn = tlfn;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public List<Curso> getCursosDisponibles() {
		List<Curso> nuevaLista = new ArrayList<>();
		LocalDate fecha1 = LocalDate.now();
		for (Curso curso : this.listaCursos) {
			if (curso.isPlazasLibre() && curso.getFechaFin().isAfter(fecha1)) {
				nuevaLista.add(curso);
			}
		}
		return nuevaLista;
	}

	public BigDecimal getPrecioMedio() {
		BigDecimal suma = BigDecimal.ZERO;
		for (Curso curso : listaCursos) {
			suma = suma.add(curso.getPrecio());
		}
		return suma.divide(new BigDecimal(listaCursos.size()), 2, RoundingMode.HALF_DOWN);
	}

	public void borrarCurosPasados() {
		LocalDate fecha1 = LocalDate.now();
		listaCursos.removeIf(s -> s.getFechaFin().isBefore(fecha1));

	}

	public Curso getCursoMasBarato() {
		if (this.listaCursos==null || this.listaCursos.isEmpty()) {
			return null;
		}
		 
		LocalDate fecha1 = LocalDate.now();
		List<Curso> listaNueva = new ArrayList<>();

		for (Curso curso : listaCursos) {
			if (curso.getFechainicio().isAfter(fecha1)) {
				listaNueva.add(curso);
			}
		}
		Curso cursoBarato = listaNueva.getFirst();
		for (Curso curso : listaNueva) {
			if (curso.getPrecio().compareTo(cursoBarato.getPrecio()) < 0) {
				cursoBarato = curso;
			}
		}

		return cursoBarato;
	}

	public Integer getTotalPlazasLibres() {
		Integer suma = null;
		for (Curso curso : listaCursos) {
			if (curso.isPlazasLibre()) {
				suma = suma + curso.getPlazasTotales() - curso.getPlazasOcupadas();
			}
		}
		return suma;
	}

	@Override
	public String toString() {
		return "Academia [Ciudad=" + Ciudad + ", tlfn=" + tlfn + ", listaCursos=" + listaCursos + "]";
	}

}
