package ru.job4j.profession;

import ru.job4j.profession.*;
/**
 * Class Doctor extends Profession.
 * @author ypak
 * @version $id$
 * @since 0.1
 */

public class Doctor extends Profession {
	/**
	* count - number of patients.
	*/
	public int count;
	/**
	* methor for Doctor description.
	* @param name - worker name.
	* @param speciality - worker speciality.
	* @param level - worker skill level.
	*/
	public Doctor(String name, String speciality, int level) {
		this.name = name;
		this.speciality = speciality;
		this.skillLevel = level;
	}
	/**
	* method for heal patient.
	* @param patient - information about patient.
	*/
	public Doctor heal(Patient patient) {

	}
	/**
	* method for diagnosis patient.
	* @param patient - information about patient.
	*/
	public Doctor diagnosis(Patient patient) {

	}
	/**
	* method for recomendations patient.
	* @param patient - information about patient.
	*/
	public Doctor makeRecomendations(Patient patient) {

	}
	/**
	* method do the madical record for patient.
	* @param patient - information about patient.
	*/
	public Doctor doMedeicalRecord(Patient patient) {

	}
	/**
	* method do surgery for patient.
	* @param patient - information about patient.
	*/
	public Doctor doSurgery(Patient patient) {

	}
	/**
	* method for patient tests.
	* @param patient - information about patient.
	*/
	public Doctor doTests(Patient patient) {

	}
}
