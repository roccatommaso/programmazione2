/**
 * 
 */

/**
 * @author Francesco
 *
 */
/**
 * @author Francesco
 *
 */
public class PoliziaMunicipale {
	private String comune;
	private Multa [] multe;
	
	/**
	 * @param comune
	 * @param multe
	 */
	public PoliziaMunicipale(String comune, int multeMax) {
		this.comune = comune;
		this.multe = new Multa[multeMax];
	}

	/**
	 * @param comune
	 * @summary multeMax inizializato a 1000
	 */
	public PoliziaMunicipale(String comune) {
		this(comune,1000);
	};
	
	/**
	 * @param numeroVerbale
	 * @param importo
	 * @return
	 */
	public boolean multaInserita(Multa multa) {
		if (multa == null)
			return false;
		for(Multa altra : multe) {
			if (altra != null)
				if (multa.equals(altra))
					return true;
		};
		return false;
	};
	
	/**
	 * @param multa
	 * @return
	 */
	public boolean aggiungiMulta(Multa multa) {
		if (multa == null)
			return false;
		if (multaInserita(multa))
			return false;
		for(int i=0; i<multe.length; i++) {
			if (multe[i] == null) {
				multe[i] = multa;
				return true;
			};
		};
		return false;
	};
	
	/**
	 * @param numeroVerbale
	 * @param importo
	 * @return
	 */
	public boolean aggiungiMulta(String numeroVerbale, int importo) {
		if (importo < 0)
			return false;
		if (numeroVerbale == null)
			return false;
		if (numeroVerbale.length() == 0)
			return false;
		return aggiungiMulta(new Multa(numeroVerbale,importo));
	};
	
	/**
	 * @param multa
	 * @return
	 */
	public Multa rimuoviMulta(Multa multa) {
		if (multa == null)
			return null;
		for(int i=0; i<multe.length; i++) {
			if (multe[i] != null)
				if (multe[i].equals(multa)) {
					multa = multe[i];
					multe[i] = null;
					return multa;
				};
		};
		return null;
	};
	
	/**
	 * @return fatturato
	 */
	public int fatturato() {
		int totale = 0;
		for(Multa multa : multe) {
			if (multa != null)
				if (multa.isPagata())
					totale += multa.getImporto();
		};
		return totale;
	};
}
