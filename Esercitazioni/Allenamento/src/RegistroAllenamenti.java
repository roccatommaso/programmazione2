import java.util.ArrayList;

public class RegistroAllenamenti {
	private ArrayList<Esercizio> esercizi = new ArrayList<>();
	
	public RegistroAllenamenti() {
		
	};
	
	public int calorieComplessive() {
		int total=0;
		for(Esercizio e : this.esercizi) {
			if (e!=null)
				total+=e.calorie();
		};
		return total;
	};
	
	public int contaEserciziUguali(Esercizio e) {
		int total=0;
		for(Esercizio n : this.esercizi) {
			if (n!=null)
				if (n.equals(e))
					total++;
		};
		return total;
	};
	
	public boolean aggiungiEsercizio(Esercizio e) {
		if (e==null)
			return false;
		return  esercizi.add(e);
	};
	
	public int aggiungiEsercizio(Esercizio [] e) {
		int total=0;
		for(Esercizio n : e) {
			if (this.aggiungiEsercizio(n))
				total++;
		};
		return total;
	};
}
