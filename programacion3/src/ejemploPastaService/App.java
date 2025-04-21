package ejemploPastaService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Divisa divisa = new Divisa();
		divisa.setCodigo("EUR");
		divisa.setDescripcion("Euro");
		divisa.setPais("Europa");
		divisa.setConversion(BigDecimal.ONE);

		PastaService service = new PastaService();
//
//		try {
//			service.crearDivisa(divisa);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		/*
		 * try { service.actualizarConversionDivisa("EUR", BigDecimal.TWO); } catch
		 * (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 */

//		try {
//			Integer cant = service.borrarDivisa("BLAS");
//			System.out.println("TOdo ok " + cant);
//		} catch (DivisaException e) {
//
//			e.printStackTrace();
//		} catch (DivisaNotFoundException e) {
//
//			System.out.println(e.getMessage());
//		}

		try {
			System.out.println(service.buscarDivisas("Eu"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DivisaNotFoundException e) {

			e.printStackTrace();
		}

		try {
			System.out.println(service.consultarDivisa("EUR"));
		} catch (DivisaException e) {
			e.printStackTrace();
		} catch (DivisaNotFoundException e) {
			e.printStackTrace();

		}
	}

}
