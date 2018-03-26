/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

/**
 * @author Sofija Dimitrijevic
 *
 */
public class VulkanizerskaRadnjaTest {
	private VulkanizerskaRadnja vr;
	private AutoGuma a;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vr = new VulkanizerskaRadnja();

		a = new AutoGuma();
		a.setMarkaModel("Aurora");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(80);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		vr = null;
		a = null;
	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test
	public void testDodajGumu() {
		vr.dodajGumu(a);
		assertEquals(1, vr.pronadjiGumu(a.getMarkaModel()).size());
		assertEquals(a, vr.pronadjiGumu(a.getMarkaModel()).get(0));
	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);

	}
	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuDuplikat() {
		vr.dodajGumu(a);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Aurora");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(80);
		vr.dodajGumu(a2);

	}
	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumu() {
		assertEquals(null,vr.pronadjiGumu(null));
	}
	
	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumuNePostoji() {
		vr.dodajGumu(a);
		LinkedList<AutoGuma> ag = new LinkedList<AutoGuma>();
		assertEquals(ag,vr.pronadjiGumu("Avon"));
	}
	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumuPostojiJedna() {
		vr.dodajGumu(a);
		LinkedList<AutoGuma> ag = new LinkedList<AutoGuma>();
		ag.add(a);
		assertEquals(ag,vr.pronadjiGumu(a.getMarkaModel()));
	}
	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumuPostojeDve() {
		vr.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Aurora");
		a2.setPrecnik(21);
		a2.setSirina(201);
		a2.setVisina(81);
		vr.dodajGumu(a2);
		
		LinkedList<AutoGuma> ag = new LinkedList<AutoGuma>();
		ag.add(a);
		ag.add(a2);
		
		assertEquals(ag, vr.pronadjiGumu(a.getMarkaModel()));
	}
	

}
