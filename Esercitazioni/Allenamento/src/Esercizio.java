
public abstract class Esercizio {
	private int giorno;
	private int mese;
	private int anno;
	
	public Esercizio(int y, int m, int d) throws DataException {
		if (y<2000 || y>2021)
			throw new DataException("Anno non valido");
		if (m<1 || m>12)
			throw new DataException("Mese non valido");
		if (d<1 || d>31)
			throw new DataException("Giorno non valido");
		giorno = d;
		mese = m;
		anno = y;
	};
	public abstract int calorie();
	public int getGiorno() {
		return giorno;
	};
	public int getMese() {
		return mese;
	};
	public int getAnno() {
		return anno;
	};
	public boolean equals(Object e) {
		if (e==null)
			return false;
		if (e==this)
			return true;
		if (e instanceof Esercizio) {
			Esercizio n = (Esercizio) e;
			if (n.getClass() == this.getClass())
				if (n.calorie() == this.calorie())
					return true;
							
		};
		return false;
	};
}
