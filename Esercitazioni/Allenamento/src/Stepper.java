
public class Stepper extends Esercizio {
	private static final int KCAL_PASSO = 2;
	private int numeroPassi;
	public Stepper(int y, int m, int d, int dd) throws DataException {
		super(y,m,d);
		numeroPassi = dd;
	};
	public int calorie() {
		return numeroPassi*Stepper.KCAL_PASSO;
	};
}
