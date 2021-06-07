import java.util.ArrayList;

public class RobotProgrammabile {
	private ISupervisore supervisore;
	private ArrayList<Mossa> programma = new ArrayList<>();
	private PuntoXY posizione = new PuntoXY(0,0);
	public RobotProgrammabile(ISupervisore supervisore) throws RobotException {
		if (supervisore==null)
			throw new RobotException("supervisore è null");
		this.supervisore = supervisore;
		if (!(this.supervisore.posizioneValida(posizione)))
			throw new RobotException("posizione non valida");
	}
	public PuntoXY getPosizione() {
		return posizione;
	};
	public int numeroMosse() {
		return this.programma.size();
	};
	public void aggiungiMossa(Mossa mossa) {
		if (mossa!=null)
			this.programma.add(mossa);
	};
	public void aggiungiMossa(Mossa[]mosse) {
		if (mosse!=null)
			for(Mossa mossa : mosse) {
				this.aggiungiMossa(mossa);
			};
	};
	public boolean eseguiProgramma() throws RobotException {
		for(Mossa mossa : this.programma) {
			this.posizione = mossa.esegui(posizione);
			if (!(this.supervisore.posizioneValida(posizione)))
				throw new RobotException("posizione non valida");
		};
		return this.supervisore.obiettivoRaggiunto(this.posizione);
	};
}
