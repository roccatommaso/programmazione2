
public class Task {
	private String titolo;
	private int data=0;
	private boolean eseguito;
	private int durata;
	
	public Task(String titolo, int data, int durata) {
		setTitolo(titolo);
		setData(data);
		setDurata(durata);
		eseguito = false;
	}
	
	public Task(String titolo, int durata) {
		this(titolo,DataUtil.getDataDiOggi(),durata);
	}

	public String getTitolo() {
		return titolo;
	}

	public int getData() {
		return data;
	}

	public boolean isEseguito() {
		return eseguito;
	}

	public int getDurata() {
		return durata;
	}

	public void setTitolo(String titolo) {
		// stringa vuota o nulla
		if (titolo == null || titolo.length()==0) {
			titolo = "Da specificare";
		};
		this.titolo = titolo;
	}

	public void setData(int data) {
		if (data<DataUtil.getDataDiOggi())
			data = DataUtil.getDataDiOggi();
		this.data = data;
	}

	public void eseguito() {
		this.eseguito = true;
	}

	public void setDurata(int durata) {
		if (durata<1 || durata>8)
			durata = 1;
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Task [titolo=" + titolo + ", data=" + data + ", eseguito=" + eseguito + ", durata=" + durata + "]";
	}
	
	public boolean equals(Task altra) {
		if (altra == this)
			return true;
		if (altra == null)
			return false;
		if (altra.getTitolo().equalsIgnoreCase(this.titolo))
			if (altra.getDurata() == this.durata)
				if (altra.getData() == this.data)
					return true;
		return false;
	};
}
