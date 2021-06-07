
public class Traslazione extends TrasformazioneGeometrica {
	private int deltaX,deltaY;
	public Traslazione(int deltaX, int deltaY) {
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}
	
	protected Punto trasforma(Punto originale) {
		Punto p = new Punto(originale.getEtichetta(),deltaX+originale.getX(),deltaY+originale.getY());
		return p;
	};

}
