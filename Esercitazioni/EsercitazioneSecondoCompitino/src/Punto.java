
public class Punto {
	private String etichetta;
	private int x;
	private int y;
	
	public Punto(String etichetta, int x, int y) {
		if (etichetta == null || etichetta == "")
			etichetta = "UNDEF";
		this.etichetta = etichetta;
		this.x = x;
		this.y = y;
	}

	public String getEtichetta() {
		return etichetta;
	}

	public void setEtichetta(String etichetta) {
		this.etichetta = etichetta;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + etichetta + ": " + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((etichetta == null) ? 0 : etichetta.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		};
		if (!(obj instanceof Punto)) {
			return false;
		};
		Punto other = (Punto) obj;
		if (x != other.x) {
			return false;
		};
		if (y != other.y) {
			return false;
		};
		return true;
	};
	
	
};
