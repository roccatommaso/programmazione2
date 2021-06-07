
public class SkipassGiornaliero {
	private DatiAttivazione dati;
	public SkipassGiornaliero(DatiAttivazione dati) {
		this.dati = dati;
	}

	public boolean controllaValidita(int giorno) {
		if (giorno == this.dati.getGiorno())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		String template = "Skipass di "+this.dati.getNome()+", valido per il giorno "+this.dati.getGiorno();
		return template;
	};
}
