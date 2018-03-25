/**
 * 
 */
package gume_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author Sofija Dimitrijevic
 *
 */
public class AutoGumaTest {

	private AutoGuma a;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a = null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Aurora");
		assertEquals("Aurora", a.getMarkaModel());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelStringManjeDuzine() {
		a.setMarkaModel("A");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);
		assertEquals(15, a.getPrecnik());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjiOd13() {
		a.setPrecnik(10);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeciOd22() {
		a.setPrecnik(25);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(200, a.getSirina());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaOd135() {
		a.setSirina(130);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVecaOd355() {
		a.setSirina(360);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		a.setVisina(60);
		assertEquals(60, a.getVisina());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaOd25() {
		a.setVisina(10);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaOd95() {
		a.setVisina(100);
	}

	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		a.setMarkaModel("Aurora");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(80);
		String s =  "AutoGuma [markaModel=Aurora, precnik=20, sirina=200, visina=80]";
		
		assertEquals(s, a.toString());
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Aurora");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(80);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Aurora");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(80);
		
		assertTrue(a.equals(a2));
		
	}
	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Aurora");
		a.setPrecnik(21);
		a.setSirina(200);
		a.setVisina(80);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Aurora");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(80);
		
		assertFalse(a.equals(a2));
		
	}

}
