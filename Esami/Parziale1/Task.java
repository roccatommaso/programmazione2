
public class Task {
	private String titolo;
	private int data;
	private boolean eseguito;
	private int durata;
	
	
	
	public Task(String titolo, int data, int durata) {
		setTitolo(titolo);
		setData(data);
		setDurata(durata);
		this.eseguito = false;
	}
	
	
	
	public Task(String titolo, int durata) {
		this(titolo, DataUtil.getDataDiOggi(), durata);
	}


	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		if(titolo == "" || titolo == null)
			this.titolo = "Da specificare";
		else
			this.titolo = titolo;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		if(data >= DataUtil.getDataDiOggi())
			this.data = data;
		else
			this.data = DataUtil.getDataDiOggi();
	}
	
	public boolean isEseguito() {
		return eseguito;
	}
	
	public void setEseguito(boolean eseguito) {
		this.eseguito = eseguito;
	}
	
	public int getDurata() {
		return durata;
	}
	
	public void setDurata(int durata) {
		if(durata >=1 && durata <= 8)
			this.durata = durata;
		else 
			this.durata = 1;
	}

	public void eseguito() {
		setEseguito(true);
	}
	
	public boolean equals(Task task) {
		if (task == null)
			return false;
		if(titolo.equalsIgnoreCase(task.getTitolo()) && data == task.getData() && durata == task.getDurata())
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Task: titolo=" + titolo + ", data=" + data +  ", durata=" + durata + ", eseguito=" + eseguito;
	}

	
}
