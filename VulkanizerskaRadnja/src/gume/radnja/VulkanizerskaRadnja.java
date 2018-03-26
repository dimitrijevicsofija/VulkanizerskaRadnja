package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa predstavlja vulkanizersku radnju sa osnovnim funkcionalnostima.
 * 
 * @author Sofija Dimitrijevic
 *
 */

public class VulkanizerskaRadnja {
	/**
	 * Lista guma koje su u ponudi u vulkanizerskoj radnji.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje novu auto gumu u ponudu guma.
	 * 
	 * @param a
	 *            auto guma
	 * @throws NullPointerException
	 *             ako je uneta auto guma null
	 * @throws RuntimeException
	 *             ako se uneta auto guma vec nalazi u ponudi guma
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.add(a);
	}

	/**
	 * Pronalazi i vraca listu guma ciji naziv odgovara unetom parametru.
	 * 
	 * @param markaModel
	 *            naziv marke i modela auto gume
	 * @return null ako je uneti parametar null
	 * @return novaLista listu guma koje ispunjavaju uslov
	 */

	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
