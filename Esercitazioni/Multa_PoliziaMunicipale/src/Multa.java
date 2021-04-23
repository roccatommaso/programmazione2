/**
 * 
 */

/**
 * @author Francesco
 *
 */
public class Multa {
	private String numeroVerbale;
	private int importo;
	private boolean pagata;
	
	/**
	 * @param numeroVerbale
	 * @param importo
	 */
	public Multa(String numeroVerbale, int importo) {
		this.numeroVerbale = numeroVerbale;
		this.importo = importo;
		this.pagata = false;
	}

	/**
	 * @return the numeroVerbale
	 */
	public String getNumeroVerbale() {
		return numeroVerbale;
	}

	/**
	 * @return the importo
	 */
	public int getImporto() {
		return importo;
	}

	/**
	 * @return the pagata
	 */
	public boolean isPagata() {
		return pagata;
	}
	
	/**
	 * @summary paga la multa
	 */
	public void paga() {
		pagata = true;
	};
	
	/**
	 * @param altro oggetto multa
	 * @return controllo di identità
	 */
	public boolean equals(Multa altra) {
		if (altra == null)
			return false;
		if (numeroVerbale.equalsIgnoreCase(altra.getNumeroVerbale()))
			return true;
		return false;
	}

	/**
	 * @summary override di java.lang.Object.toString();
	 * */
	public String toString() {
		return "Multa [numeroVerbale=" + numeroVerbale + ", importo=" + importo + ", pagata=" + pagata + "]";
	};
	
}
