import junit.framework.TestCase;

import org.junit.Test;


public class TestFormattazionePacchetti extends TestCase {

	@Test
	public void testOperazioneSostituzione_errori() {
		Operazione op = new Sostituzione("$$", "prova");
		
		try {
			String[] pacchetto = null;
			String[] risultato = op.esegui(pacchetto);
			fail("Deve sollevare l'eccezione");
		} catch (OperazioneException e) {}
	}
	
	@Test
	public void testOperazioneSostituzione() throws OperazioneException {
		Operazione op = new Sostituzione("$$", "prova");

		String[] pacchetto = {"$$", "una frase", "$$", "una seconda frase", "$$"};
		String[] risultato = op.esegui(pacchetto);
		
		assertEquals(5, risultato.length);
		assertEquals("prova", risultato[0]);
		assertEquals("una frase", risultato[1]);
		assertEquals("prova", risultato[2]);
		assertEquals("una seconda frase", risultato[3]);
		assertEquals("prova", risultato[4]);
	}

	@Test
	public void testOperazioneAutenticazione_errori() {
		Operazione op = new Autenticazione(new DatabaseUtenti());
		
		try {
			String[] pacchetto = null;
			String[] risultato = op.esegui(pacchetto);
			fail("Deve sollevare l'eccezione");
		} catch (OperazioneException e) {}

		try {
			String[] pacchetto = {"tizio"};
			String[] risultato = op.esegui(pacchetto);
			fail("Deve sollevare l'eccezione");
		} catch (OperazioneException e) {}

		try {
			String[] pacchetto = {"null", "passwdtizio"};
			String[] risultato = op.esegui(pacchetto);
			fail("Deve sollevare l'eccezione");
		} catch (OperazioneException e) {}

		try {
			String[] pacchetto = {"tizio", null};
			String[] risultato = op.esegui(pacchetto);
			fail("Deve sollevare l'eccezione");
		} catch (OperazioneException e) {}
	}

	@Test
	public void testOperazioneAutenticazione_nonAutenticato() {
		Operazione op = new Autenticazione(new DatabaseUtenti());

		try {
			String[] pacchetto = {"tizio", "passwd", "alcune informazioni"};
			String[] risultato = op.esegui(pacchetto);
			fail("Deve sollevare l'eccezione: passwrod errata");
		} catch (OperazioneException e) {}

		try {
			String[] pacchetto = {"sconosciuto", "passwdtizio", "alcune informazioni"};
			String[] risultato = op.esegui(pacchetto);
			fail("Deve sollevare l'eccezione: utente sconosciuto");
		} catch (OperazioneException e) {}
	}

	@Test
	public void testOperazioneAutenticazione_riuscita() throws OperazioneException {
		Operazione op = new Autenticazione(new DatabaseUtenti());
		
		String[] pacchetto = {"tizio", "passwdtizio", "alcune informazioni"};
		String[] risultato = op.esegui(pacchetto);
		
		assertEquals(1, risultato.length);
		assertEquals("alcune informazioni", risultato[0]);
	}
	
	@Test
	public void testGestore_gestioneEccezioni() {
		Operazione op = new Autenticazione(new DatabaseUtenti());
		GestorePacchetti gestore = new GestorePacchetti(op);
		
		String[] pacchetto = {"tizio", null};
		String[] pacchettoFormattato = gestore.formattaPacchetto(pacchetto);

		assertNull(pacchettoFormattato);
	}

	@Test
	public void testGestore_conOperazioni() throws OperazioneException {
		Operazione op1 = new Autenticazione(new DatabaseUtenti());
		Operazione op2 = new Sostituzione("$$", "prova");
		
		GestorePacchetti gestore = new GestorePacchetti();
		gestore.aggiungiOperazione(op1);
		gestore.aggiungiOperazione(op2);
		
		String[] pacchetto = {"tizio", "passwdtizio", "$$", "una frase", "$$", "una seconda frase", "$$"};
		String[] pacchettoFormattato = gestore.formattaPacchetto(pacchetto);

		assertEquals(5, pacchettoFormattato.length);
		assertEquals("prova", pacchettoFormattato[0]);
		assertEquals("una frase", pacchettoFormattato[1]);
		assertEquals("prova", pacchettoFormattato[2]);
		assertEquals("una seconda frase", pacchettoFormattato[3]);
		assertEquals("prova", pacchettoFormattato[4]);
	}
}
