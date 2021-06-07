
public class Cyclette extends Esercizio {
	private static final int MOLTIPLICATORE_INTENSA = 3;
	private static final int MOLTIPLICATORE_LEGGERA = 2;
	private int durata;
	public Cyclette(int y, int m, int d, int dd) throws DataException {
		super(y,m,d);
		durata = dd;
	};
	public int calorie() {
		if (durata>20)
			return Cyclette.MOLTIPLICATORE_INTENSA*this.durata;
		return Cyclette.MOLTIPLICATORE_LEGGERA*this.durata;
	};
}
