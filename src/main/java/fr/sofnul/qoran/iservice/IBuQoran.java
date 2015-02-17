package fr.sofnul.qoran.iservice;

import java.util.List;

import fr.sofnul.qoran.entity.Aya;
import fr.sofnul.qoran.entity.Sourate;

public interface IBuQoran {
	/**
	 * @param {@link Sourate} avec id
	 * @return
	 * 	- si OK: {@link Sourate} avec infos si Ok
	 *  - si POK: null
	 */
	public Sourate getSourate(Sourate sourat);
	/**
	 * @return la List<{@link Sourate}>
	 */
	public List<Sourate> getSouratesListe();
	/**
	 * @param {@link Aya}
	 * @return
	 * 	- si OK: {@link Aya} avec ces infos
	 *  - si POK: null
	 */
	public Aya getAya(Aya aya);
	/**
	 * @param {@link Sourate}
	 * @return
	 * 	- si OK: List<{@link Aya}> de la sourate
	 *  - si POK: null
	 */
	public List<Aya> getAyasDeSourate(Sourate sourate);
	/**
	 * @param l'{@link Aya} du début
	 * @param l'{@link Aya} de fin
	 * @return
	 * 	- si OK: List<{@link Aya}> entre l'{@link Aya} du début et l'{@link Aya} de fin
	 * 	- si POK: null
	 */
	public List<Aya> getAyasListe(Integer startAya, Integer endAya);
}
