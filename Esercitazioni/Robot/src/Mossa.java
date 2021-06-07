
public abstract class Mossa {
	private int passi;
	public Mossa(int passi) throws RobotException {
		if (passi==0)
			throw new RobotException("il numero di passi è 0");
		this.passi = passi;
	};
	public int getPassi() {
		return passi;
	};
	public abstract PuntoXY esegui(PuntoXY puntoDiPartenza);
}
