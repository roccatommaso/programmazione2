public class Passeggero {
	private String destinazione;
	private boolean inPossessoDiiBiglietto;
	
	public Passeggero(String destinazione, boolean inPossessoDiiBiglietto) {
		super();
		if(destinazione == null)
			destinazione = "CAPOLINEA";
		this.destinazione = destinazione;
		this.inPossessoDiiBiglietto = inPossessoDiiBiglietto;
	}
	
	public Passeggero(String destinazione) {
		this(destinazione, true);
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public boolean isInPosessoDiBiglietto() {
		return inPossessoDiiBiglietto;
	}

	@Override
	public String toString() {
		return "Passeggero [destinazione=" + destinazione + ", inPossessoDiiBiglietto=" + inPossessoDiiBiglietto + "]";
	}
}
