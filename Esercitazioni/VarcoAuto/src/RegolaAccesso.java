
public abstract class RegolaAccesso {
	private String descrizione;
	public RegolaAccesso(String descrizione) {
		this.descrizione = descrizione;
	};
	
	public String getDescrizione() {
		return descrizione;
	};
	
	public abstract boolean multa(Veicolo v2);
}
