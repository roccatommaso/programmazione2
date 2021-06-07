
public class SimmetriaRispettoAOrigine extends TrasformazioneGeometrica {

	protected Punto trasforma(Punto originale) {
		Punto p = new Punto(originale.getEtichetta(),-originale.getX(),-originale.getY());
		return p;
	};

}
