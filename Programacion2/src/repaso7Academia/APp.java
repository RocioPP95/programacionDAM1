package repaso7Academia;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class APp {

	public static void main(String[] args) {
		Curso curso1 = new Curso("DAM", (new BigDecimal(8000)), 30);
		Curso curso2 = new Curso("DAW", (new BigDecimal(8000)), 30);

		Academia aca = new Academia();

		curso1.setFechaFin(LocalDate.of(2027, 2, 14));
		curso1.setFechainicio(LocalDate.of(2025, 2, 14));

		curso2.setFechaFin(LocalDate.of(2026, 2, 14));
		curso2.setFechainicio(LocalDate.of(2024, 2, 14));

		aca.getListaCursos().add(curso1);
		aca.getListaCursos().add(curso2);

		System.out.println(curso1.getDuracionCurso());
		System.out.println(curso2.getDuracionCurso());

		System.out.println(curso1.isPlazasLibre());
		System.out.println(curso2.isPlazasLibre());

		System.out.println(curso1.getPrecioMes());
		System.out.println(curso2.getPrecioMes());

		System.out.println(aca.getCursosDisponibles());

		System.out.println(aca.getPrecioMedio());

		aca.borrarCurosPasados();
		System.out.println(aca.getCursoMasBarato());

		System.out.println(aca.getTotalPlazasLibres());

	}
}
