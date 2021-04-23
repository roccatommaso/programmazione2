
public class TrenoMetro {
	private Passeggero[] passeggeri;

	public TrenoMetro() {
		passeggeri = new Passeggero[0];
	}
	
	public boolean salitaPasseggero(String destinazione, boolean inPossessoDiiBiglietto) {
		if(passeggeri.length >= 50)
			return false;
		passeggeri = incrementaDimArray(passeggeri);
		passeggeri[passeggeri.length-1] = new Passeggero(destinazione, inPossessoDiiBiglietto);
		return true;
	}

	public boolean salitaPasseggero(String destinazione) {
		return salitaPasseggero(destinazione, true);
	}

	public Passeggero[] discesaPasseggeri(String destinazione) {
		int numpasseggeriDaMultare = 0;
		int numpasseggeriScesi = 0;
		
		for(int i = 0; i < passeggeri.length; i++) {
			if(passeggeri[i].getDestinazione().equals(destinazione)) {
				if(passeggeri[i].isInPosessoDiBiglietto() == false)
					numpasseggeriDaMultare++;
				numpasseggeriScesi++;
			}
		}
		
		if(numpasseggeriScesi == 0)
			return new Passeggero[0];
		if(numpasseggeriScesi == passeggeri.length)
			return passeggeri;
		
		Passeggero[] passeggeriDaMultare = new Passeggero[numpasseggeriDaMultare];
		
		for(int i = 0, j = 0; i < passeggeri.length; i++) {
			if(passeggeri[i].getDestinazione().equals(destinazione)) {
				if(passeggeri[i].isInPosessoDiBiglietto() == false) {
					passeggeriDaMultare[j]=passeggeri[i];
					j++;
				}
				passeggeri[i] = null;
			}
		}

		passeggeri = adattapasseggeri(passeggeri, numpasseggeriScesi);
		return passeggeriDaMultare;
	}
	
	private Passeggero[] adattapasseggeri(Passeggero[] passeggeri, int numPasseggeriScesi) {
		Passeggero[] tmp = new Passeggero[passeggeri.length-numPasseggeriScesi];
		for (int i = 0, j = 0; i < passeggeri.length; i++) {
			if(passeggeri[i] != null) {
				tmp[j] = passeggeri[i];
				j++;
			}
		}
		return tmp;
	}

	public int numeroPasseggeri() {
		return passeggeri.length;
	}
	
	public Passeggero[] incrementaDimArray(Passeggero[] passeggeri) {
		Passeggero[] tmp = new Passeggero[passeggeri.length+1];
		for (int i = 0; i < passeggeri.length; i++) {
			tmp[i] = passeggeri[i];
		}
		return tmp;
	}
	
	
}