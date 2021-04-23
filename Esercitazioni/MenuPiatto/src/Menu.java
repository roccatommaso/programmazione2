public class Menu {
	private String nomeRistorante;
	private Piatto [] piatti;
	
	public Menu(String ristorante, int numeroPiatti) {
		if (numeroPiatti<1)
			numeroPiatti = 30;
		nomeRistorante = ristorante;
		piatti = new Piatto[numeroPiatti];
	};
	
	public Menu(String ristorante) {
		this(ristorante,30);
	};
	
	public boolean aggiungiPiatto(Piatto piatto) {
		if (piatto == null)
			return false;
		int spazioVuoto=-1;
		for(int i=0; i<piatti.length; i++) {
			if (piatti[i] == null) {
				if (spazioVuoto==-1)
					spazioVuoto = i;
			} else {
				if (piatti[i].equals(piatto))
					return false;
			};
		};
		if (spazioVuoto != -1) {
			piatti[spazioVuoto] = piatto;
			return true;
		};
		return false;
	};
	
	public Piatto eliminaPiatto(Piatto piatto) {
		if (piatto == null)
			return null;
		for(int i=0; i<piatti.length; i++) {
			if (piatti[i] != null)
				if (piatti[i].equals(piatto)) {
					Piatto tmp = piatti[i];
					piatti[i] = null;
					return tmp;
				};
		};
		return null;
	};
	
	public Piatto[] dammiTuttiIPiatti(String categoria) {
		int numeroPiatti=0;
		
		for(int i=0; i<piatti.length; i++)
			if (piatti[i] != null)
				if (piatti[i].getCategoria().equals(categoria))
					numeroPiatti++;
		
		if (numeroPiatti!=0) {
			Piatto [] array = new Piatto[numeroPiatti];
			int k=0;
			for(int i=0; i<piatti.length; i++)
				if (piatti[i] != null)
					if (piatti[i].getCategoria().equals(categoria))
						array[k++] = piatti[i];
			return array;
		};
		return null;
	};
	
	public Piatto[] dammiTuttiPrimi() {
		return dammiTuttiIPiatti(Piatto.PRIMO);
	}

	public String getNomeRistorante() {
		return nomeRistorante;
	}

	public void setNomeRistorante(String nomeRistorante) {
		this.nomeRistorante = nomeRistorante;
	};
}
