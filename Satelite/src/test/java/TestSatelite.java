import static org.junit.Assert.*;

import org.junit.Test;

public class TestSatelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	@Test
	public void testSatelite() {
		 meridiano =10;
		 paralelo=15;
		 distancia_tierra=25;
		Satelite satelitetest=new Satelite(
				meridiano,paralelo,distancia_tierra) ;
			
	assertEquals(satelitetest.meridiano, 10,0);
	assertEquals(satelitetest.paralelo, 15,0);
	assertEquals(satelitetest.distancia_tierra, 25,0);
	
	}
	@Test
	public void testconstructor2() {
		
		Satelite satelitetest=new Satelite() ;
			
	assertEquals(satelitetest.meridiano, 0,0);
	assertEquals(satelitetest.paralelo, 0,0);
	assertEquals(satelitetest.distancia_tierra, 0,0);
	
	} 
	@Test
public void testSetPosicion() {
		
		Satelite satelitetest=new Satelite() ;
		satelitetest.setPosicion(345, 14, 55);
		assertEquals(satelitetest.meridiano, 345,0);
	assertEquals(satelitetest.paralelo, 14,0);
	assertEquals(satelitetest.distancia_tierra, 55,0);
	
	} 
	 

}
