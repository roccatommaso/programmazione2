
public class MossaRettilineaOrizzontale extends Mossa {

	public MossaRettilineaOrizzontale(int passi) {
		super(passi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PuntoXY esegui(PuntoXY puntoDiPartenza) {
		return new PuntoXY(puntoDiPartenza.getX()+getPassi(),puntoDiPartenza.getY());
	}

}
