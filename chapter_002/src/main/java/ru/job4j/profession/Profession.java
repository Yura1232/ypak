package ru.job4j.profession;

/**
 * Class Profession.
 * @author ypak
 * @version $id$
 * @since 0.1
 */

public class Profession {
	/**
	* name - workers name.
	*/
	public String name;
	/**
	* number - workers number.
	*/
	public int number;
	/**
	* experience - workers experience.
	*/
	public int experience;
	/**
	* speciality - workers speciality.
	*/
	public String speciality;
	/**
	* skillLevel - workers qualifiers level.
	*/
	public String skillLevel;
	/**
	* hours - hours that person work.
	*/
	public int hours;
	/**
	* @param name - workers name.
	* @param speciality - worker speciality.
	* @param number - phone number.
	*/
	public Profession(Stiring name, Stiring speciality, int number) {
		this.name = name;
		this.speciality = speciality;
		this.number = number;
	}
	/**
	* @return name.
	*/
	public String getName() {
		return this.name;
	}
	/**
	* @return hours - how many hours person work.
	*/
	public int getHours() {
		return this.hours;
	}
	/**
	* @return experience.
	*/
	public int getExperience {
		return this.experience;
	}
}
