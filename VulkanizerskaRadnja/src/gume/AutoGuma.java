package gume;

/**
 * Klasa predstavlja auto gumu sa osnovnim osobinama.
 * 
 * @author Sofija Dimitrijevic
 *
 */

public class AutoGuma {
	/**
	 * Naziv marke i modela gume.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume izrazena u cm.
	 */
	private int precnik = 0;
	/**
	 * Sirina gume izrazena u cm.
	 */
	private int sirina = 0;
	/**
	 * Visina gume izrazena u cm.
	 */
	private int visina = 0;

	/**
	 * Vraca naziv marke i modela auto gume
	 * @return naziv marke i modela auto gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda postavlja vrednost atributa markaModel ukoliko uneti parametar:
	 * <ol type="1">
	 * <li>nije null</li>
	 * <li>duzna >=3</li>
	 * </ol>
	 * 
	 * @param markaModel
	 *            naziv marke i modela auto gume
	 * @throws RuntimeException
	 *             ukoliko je parametar null ili duzine manje od 3
	 */

	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost precnika auto gume
	 * @return precnik auto gume
	 */

	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja vrednost atributa precnik ukoliko je vrednost unetog parametra <b>
	 * >=13 </b> i <b> <=22 </b>
	 * 
	 *
	 * @param precnik
	 *            precnik auto gume u cm
	 * @throws RuntimeException
	 *             ukoliko je vrednost unetog parametra <13 ili >22
	 */

	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost sirine auto gume
	 * @return sirina auto gume
	 */

	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja vrednost atributa sirina ukoliko je vrednost unetog parametra <b>
	 * >=135 </b> i <b> <=355 </b>
	 * 
	 * @param sirina
	 *            sirina auto gume u cm
	 * @throws RuntimeException
	 *             ukoliko je vrednost unetog parametra <135 ili >355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost visine auto gume
	 * @return visina auto gume
	 */

	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja vrednost atributa visina ukliko je vrednost unetog parametra
	 * <b>>=25</b> i <b><=95</b>
	 * 
	 * @param visina
	 *            visina auto gume u cm
	 * @throws RuntimeException
	 *             ukoliko je vrednost unetog parametra <25 ili >95
	 */

	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca String koji pokazuje vrednosti svih atributa AutoGume
	 * @return String koji pokazuje vrednosti svih atributa AutoGume
	 */

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Poredi uneti objekat sa AutoGumom.
	 * 
	 * @return
	 *         <ol>
	 *         <li><b> true </b> uneti objekat pripada klasi AutoGuma i svi atributi
	 *         su jednaki</li>
	 *         <li><b> false </b>
	 *         <ul>
	 *         <li>uneti objekat nije klase AutoGuma</li>
	 *         <li>postoji odstupanje u vrednosti kod bilo kog atributa</li></li>
	 *         </ol>
	 * 
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;

	}

}
