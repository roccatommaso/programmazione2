
public class ParcoAuto {
	private Auto[] autoAziendali;
	
	public ParcoAuto(int maxAuto) {
		autoAziendali = new Auto[maxAuto];
	}
	
	public Auto trovaAuto (Auto auto) {
		if(auto == null)
			return null;
		for (Auto autoNelParco : autoAziendali) {
			if(auto.equals(autoNelParco))
				return autoNelParco;
		}
		return null;
	}
	
	public boolean inserisciNuovaAuto(String targa) {
		if(targa == null)
			return false;
		Auto autoNelParco = trovaAuto(new Auto(targa));
		if(autoNelParco != null)
			return false;
		for(int i = 0; i < autoAziendali.length; i++) {
			if(autoAziendali[i] == null) {
				autoAziendali[i] = new Auto(targa);
				return true;
			}
		}
		return false;
	}

	public boolean rientroAuto(Auto autoRientrata) {
		if(autoRientrata == null)
			return false;
		Auto autoNelParco = trovaAuto(autoRientrata);
		if(autoNelParco == null)
			return false;
		
		return autoNelParco.aggiornaKm(autoRientrata.getKmPercorsi()-autoNelParco.getKmPercorsi());
	}

	public boolean rientroAuto(String targa, int km) {
		return rientroAuto(new Auto(targa, km));
	}
	
	
}
