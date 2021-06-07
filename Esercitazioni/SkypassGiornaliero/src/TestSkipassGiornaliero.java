import junit.framework.TestCase;

public class TestSkipassGiornaliero extends TestCase {
	public void testControllaValidita() {	
		DatiAttivazione rossi = new DatiAttivazione(23, "Paolo Rossi");
		SkipassGiornaliero skiRossi = new SkipassGiornaliero(rossi);
		
		DatiAttivazione bianchi = new DatiAttivazione(38, "Rolando Bianchi");
		SkipassGiornaliero skiBianchi = new SkipassGiornaliero(bianchi);
		
		boolean validitaRossi = skiRossi.controllaValidita(38);
		boolean validitaBianchi = skiBianchi.controllaValidita(38);
		
		assertFalse(validitaRossi);
		assertTrue(validitaBianchi);
	}
	
	public void testToString() {
		DatiAttivazione verdi = new DatiAttivazione(201, "Giuseppe Verdi");
		SkipassGiornaliero skiVerdi = new SkipassGiornaliero(verdi);
		
		DatiAttivazione neri = new DatiAttivazione(121, "Franco Neri");
		SkipassGiornaliero skiNeri = new SkipassGiornaliero(neri);
		
		String s = skiVerdi.toString();
		assertEquals("Skipass di Giuseppe Verdi, valido per il giorno 201", s);
		s = skiNeri.toString();
		assertEquals("Skipass di Franco Neri, valido per il giorno 121", s);
	}
}