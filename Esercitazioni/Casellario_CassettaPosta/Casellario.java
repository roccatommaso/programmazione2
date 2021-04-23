
public class Casellario {
	private CassettaPosta [] cassette;
	
	public Casellario(int numeroCassette) {
		cassette = new CassettaPosta[numeroCassette];
	};
	
	public boolean aggiungiCassettaPosta(CassettaPosta cassetta) {
		if (cassetta == null)
			return false;
		if (isPresente(cassetta))
			return false;
		for(int i=0; i<cassette.length; i++) {
			if (cassette[i] == null) {
				cassette[i] = cassetta;
				return true;
			};
		};
		return false;
	};
	
	public boolean aggiungiCassettaPosta(String nome, int numeroLettereMax) {
		return aggiungiCassettaPosta(new CassettaPosta(nome, numeroLettereMax));
	};
	
	private boolean isPresente(CassettaPosta cassetta) {
		for(CassettaPosta altra : cassette) {
			if (altra != null)
				if (altra.equals(cassetta))
					return true;
		};
		return false;
	};
	
	public boolean rimuovi(CassettaPosta cassetta) {
		if (isPresente(cassetta)) {
			for(int i=0; i<cassette.length; i++) {
				if (cassette[i] != null)
					if (cassette[i].equals(cassetta)) {
						cassette[i] = null;
						return true;
					};
			};
		};
		return false;
	};
}
