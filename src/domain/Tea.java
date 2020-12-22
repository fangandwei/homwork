package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Tea entity. @author MyEclipse Persistence Tools
 */

public class Tea implements java.io.Serializable {

	// Fields

	private Integer id;
	private Classes classes;
	private School school;
	private String name;
	private String password;
	private Set stuTeas = new HashSet(0);
	private Set homeworks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tea() {
	}

	/** full constructor */
	public Tea(Classes classes, School school, String name, String password,
			Set stuTeas, Set homeworks) {
		this.classes = classes;
		this.school = school;
		this.name = name;
		this.password = password;
		this.stuTeas = stuTeas;
		this.homeworks = homeworks;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getStuTeas() {
		return this.stuTeas;
	}

	public void setStuTeas(Set stuTeas) {
		this.stuTeas = stuTeas;
	}

	public Set getHomeworks() {
		return this.homeworks;
	}

	public void setHomeworks(Set homeworks) {
		this.homeworks = homeworks;
	}

}