
public class Veicolo implements Comparable {
	private String targa;
	private String carburante;
	public Veicolo(String targa, String carburante) throws VeicoloException {
		if (targa==null || targa.length()==0)
			throw new VeicoloException("Targa non valida");
		if (Carburante.carburanteValido(carburante)) {
			this.targa = targa;
			this.carburante = carburante;
		} else {
			throw new VeicoloException("Carburante non valido");
		};
	};

	public String getTarga() {
		return targa;
	};

	public String getCarburante() {
		return carburante;
	};
	
	public int compareTo(Object v2) {
		if (v2==null)
			return 1;
		if (!(v2 instanceof Veicolo)) {
			return 1;
		};
		Veicolo v1 = (Veicolo)v2;
		return -v1.getTarga().compareTo(this.getTarga());
	};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((targa == null) ? 0 : targa.hashCode());
		return result;
	};

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Veicolo other = (Veicolo) obj;
		if (targa == null) {
			if (other.targa != null) {
				return false;
			}
		} else if (!targa.equals(other.targa)) {
			return false;
		}
		return true;
	};

}
