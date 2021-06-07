
public class MossaRettilineaVerticale extends Mossa {

	public MossaRettilineaVerticale(int passi) {
		super(passi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PuntoXY esegui(PuntoXY puntoDiPartenza) {
		return new PuntoXY(puntoDiPartenza.getX(),puntoDiPartenza.getY()+getPassi());
	}

}
