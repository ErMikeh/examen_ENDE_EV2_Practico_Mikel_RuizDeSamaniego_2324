package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos am1= new NumerosAmigos(1, 4);
		assertFalse(am1.amigo());
	}

	@Test
	public void testAmigoAmigoPerfecto() {
		NumerosAmigos am1= new NumerosAmigos(496,1);
		
	}

	@Test
	public void testEsCeroN1() {
		NumerosAmigos am1= new NumerosAmigos(0, 4);
		assertNull(am1.esN1IgualAN2());
	}
	
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos am1= new NumerosAmigos(4, 4);
		assertEquals(am1.esN1IgualAN2(), (Integer)1);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos am1= new NumerosAmigos(4, 2);
		assertNotEquals(am1.esN1IgualAN2(), (Integer)1);
	}

}
