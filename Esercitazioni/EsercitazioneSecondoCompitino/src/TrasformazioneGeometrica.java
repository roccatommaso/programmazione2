import java.util.HashSet;
import java.util.Set;

public abstract class TrasformazioneGeometrica {
	protected abstract Punto trasforma(Punto originale);
	
	public Set<Punto> trasforma(Set<Punto> originali) {
		if (originali instanceof HashSet) {
			Set<Punto> nuovo = new HashSet<>();
			for(Punto p : originali) {
				nuovo.add(trasforma(p));
			};
			return nuovo;
		};
		return null;
	};
}
