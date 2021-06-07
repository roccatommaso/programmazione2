
public abstract class Monografia {
	private String autore,titolo;
	
	public Monografia(String titolo, String autore) throws MonografiaInvalidaException {
		if (autore==null || titolo==null || autore.length()==0 || titolo.length()==0)
			throw new MonografiaInvalidaException();
		this.autore = autore;
		this.titolo = titolo;
	};
	
	public abstract int numPagine();

	public String getAutore() {
		return autore;
	}

	public String getTitolo() {
		return titolo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autore == null) ? 0 : autore.hashCode());
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Monografia)) {
			return false;
		}
		Monografia other = (Monografia) obj;
		if (autore == null) {
			if (other.autore != null) {
				return false;
			}
		} else if (!autore.equals(other.autore)) {
			return false;
		}
		if (titolo == null) {
			if (other.titolo != null) {
				return false;
			}
		} else if (!titolo.equals(other.titolo)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Monografia [autore=" + autore + ", titolo=" + titolo + ", numPagine=" + numPagine() + "]";
	}
	
}
