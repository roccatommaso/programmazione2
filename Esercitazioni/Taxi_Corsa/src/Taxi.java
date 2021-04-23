/**
 * 
 */

/**
 * @author Francesco
 *
 */
public class Taxi {
	private int totaleCorseEffettuate;
	private Corsa [] corseEffettuate;
	private Corsa corsaInSvolgimento;
	
	public Taxi() {
		totaleCorseEffettuate = 0;
		corseEffettuate = new Corsa[5];
		corsaInSvolgimento = null;
	};
	
	public boolean nuovaCorsa(String destinazione) {
		if (!isLibero())
			return false;
		if (destinazione == null || destinazione.length() == 0)
			return false;
		if (totaleCorseEffettuate>4)
			return false;
		corsaInSvolgimento = new Corsa(destinazione);
		return true;
	};
	
	public void terminaCorsa(int kmPercorsi) {
		if (!isLibero()) {
			corsaInSvolgimento.aggiungiKm(kmPercorsi);
			corseEffettuate[totaleCorseEffettuate++] = corsaInSvolgimento;
			corsaInSvolgimento = null;
		};
	};
	
	public int getTotaleCorseEffettuate() {
		return totaleCorseEffettuate;
	};
	
	public boolean isLibero() {
		if (corsaInSvolgimento == null)
			return true;
		return false;
	};
	
	public Corsa trovaCorsaConCostoMaggiore(String destinazione) {
		Corsa max = null;
		for(int i=0; i<totaleCorseEffettuate; i++) {
			if (corseEffettuate[i] != null)
				if (corseEffettuate[i].getDestinazione().equals(destinazione))
					if (max == null || corseEffettuate[i].calcolaTariffa()>max.calcolaTariffa())
						max = corseEffettuate[i];
		};
		return max;
	};
}
