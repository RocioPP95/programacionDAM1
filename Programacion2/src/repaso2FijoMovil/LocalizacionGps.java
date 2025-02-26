package repaso2FijoMovil;

public class LocalizacionGps {

	private Integer cHorizontal;
	private Integer cVertical;
	
	
	public LocalizacionGps(Integer cHorizontal, Integer cVertical) {
		super();
		this.cHorizontal = cHorizontal;
		this.cVertical = cVertical;
	}
	public Integer getcHorizontal() {
		return cHorizontal;
	}
	public void setcHorizontal(Integer cHorizontal) {
		this.cHorizontal = cHorizontal;
	}
	public Integer getcVertical() {
		return cVertical;
	}
	public void setcVertical(Integer cVertical) {
		this.cVertical = cVertical;
	}

	
}
