
public class RegolaAccessoVietatoMotoriDiesel extends RegolaAccesso {

	public RegolaAccessoVietatoMotoriDiesel(String descrizione) {
		super(descrizione);
	};

	public boolean multa(Veicolo v1) {
		if (v1.getCarburante().equals(Carburante.DIESEL))
			return true;
		return false;
	};

}
