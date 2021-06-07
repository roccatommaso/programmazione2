import java.util.HashSet;

public class Grafico {
	private HashSet<Punto> punti = new HashSet<>();
	
	public Grafico(Punto primoPunto) {
		if (primoPunto!=null)
			punti.add(primoPunto);
	};
	
	public void aggiungiPunto(Punto punto) throws GraficoException {
		if (punto!=null)
			if (punti.contains(punto))
				throw new GraficoException("il punto esiste già");
			else
				punti.add(punto);
	};
	
	public void trasforma(TrasformazioneGeometrica trasformazione) {
		if (trasformazione!=null) {
			this.punti = (HashSet<Punto>) trasformazione.trasforma(punti);
		};
	};
	
	public void visualizza() {
		for(Punto p : this.punti) {
			if (p!=null)
				System.out.println(p.toString());
		};
	};
	
	public int getNumeroPunti() {
		int res=0;
		res = punti.size();
		return res;
	};
}
