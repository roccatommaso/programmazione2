import static org.junit.Assert.*;

import org.junit.Test;

public class DistributoreAutomaticoTest {

	//Test su aggiungiMoneta
	//normale: aggiungo 3 e verifico che siano 3 le monete nel distributore
	@Test
	public void testAggiungiMoneteNormale() {
		DistributoreAutomatico d = new DistributoreAutomatico();
		d.aggungiMonete(3);
		int monete = d.checkNumeroMonete();
		
		assertEquals(3, monete); //oracolo e' 3	
	}
	
	//anomalo: aggiungo -3 e verifico che siano 0 le monete nel distributore
	@Test
	public void testAggiungiMoneteAnomalo() {
		DistributoreAutomatico d = new DistributoreAutomatico();
		d.aggungiMonete(-3);
		int monete = d.checkNumeroMonete();
		
		assertEquals(0, monete); //oracolo e' 0
	}
	
	//frontiera : aggiungo 1 e verifico che siano 1 le monete nel distributore
	@Test
	public void testAggiungiMoneteFrontiera() {
		DistributoreAutomatico d = new DistributoreAutomatico();
		d.aggungiMonete(1);
		int monete = d.checkNumeroMonete();
		
		assertEquals(1, monete); //oracolo e' 1
	}
	
	//Test su vendi
	//frontiera su vendi: mi aspetto che con 2 monete il metodo funzioni
	@Test
	public void testVendiFrontiera() {
		DistributoreAutomatico d = new DistributoreAutomatico();
		d.aggungiMonete(2);
		
		boolean esito = d.vendi();					//true
		int numeroMonete = d.checkNumeroMonete();	//0
		
		assertTrue(esito);
		assertEquals(0, numeroMonete);
	}
}
