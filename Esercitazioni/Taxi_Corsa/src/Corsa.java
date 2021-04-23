/**
 * 
 */

/**
 * @author Francesco
 *
 */
public class Corsa {
	private String destinazione;
	private double costoKm;
	private int kmPercorsi = 0;
	
	/**
	 * @return the kmPercorsi
	 */
	public int getKmPercorsi() {
		return kmPercorsi;
	}
	
	/**
	 * @param kmPercorsi the kmPercorsi to set
	 */
	public void aggiungiKm(int kmPercorsi) {
		if (kmPercorsi>0)
			this.kmPercorsi += kmPercorsi;
	}
	
	/**
	 * @return the destinazione
	 */
	public String getDestinazione() {
		return destinazione;
	}
	
	/**
	 * @return the costoKm
	 */
	public double getCostoKm() {
		return costoKm;
	}
	
	public Corsa(String destinazione, double costoKm) {
		this.destinazione = destinazione;
		this.costoKm = costoKm;
	};
	
	public Corsa(String destinazione) {
		this(destinazione,0.5);
	};
	
	public double calcolaTariffa() {
		return kmPercorsi*costoKm;
	};
	
	public double calcolaTariffa(double supplemento) {
		return calcolaTariffa()+supplemento;
	};
}
