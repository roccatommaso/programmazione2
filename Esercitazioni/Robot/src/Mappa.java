
public class Mappa implements ISupervisore {
	private int minX,minY,maxX,maxY;
	private PuntoXY obiettivo;
	public Mappa(int minX, int maxX, int minY, int maxY, PuntoXY obiettivo) throws RobotException {
		if (minX>=maxX || minY>=maxY || obiettivo==null)
			throw new RobotException("dati mappa invalidi");
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
		if (!(this.posizioneValida(obiettivo)))
			throw new RobotException("posizione obiettivo non valida");
		this.obiettivo = obiettivo;
	}

	@Override
	public boolean posizioneValida(PuntoXY posizione) {
		return (
				posizione.getX()>=this.minX &&
				posizione.getY()>=this.minY &&
				posizione.getX()<=this.maxX &&
				posizione.getY()<=this.maxY
				);
	}

	@Override
	public boolean obiettivoRaggiunto(PuntoXY posizione) {
		return posizione.equals(obiettivo);
	}

}
