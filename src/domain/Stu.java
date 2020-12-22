package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Stu entity. @author MyEclipse Persistence Tools
 */

public class Stu implements java.io.Serializable {

	// Fields

	private Integer id;
	private Classes classes;
	private School school;
	private String password;
	private String name;
	private String studentId;
	private Set stuTeas = new HashSet(0);
	private Set stuHoms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stu() {
	}

	/** minimal constructor */
	public Stu(String password, String name, String studentId) {
		this.password = password;
		this.name = name;
		this.studentId = studentId;
	}

	/** full constructor */
	public Stu(Classes classes, School school, String password, String name,
			String studentId, Set stuTeas, Set stuHoms) {
		this.classes = classes;
		this.school = school;
		this.password = password;
		this.name = name;
		this.studentId = studentId;
		this.stuTeas = stuTeas;
		this.stuHoms = stuHoms;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Set getStuTeas() {
		return this.stuTeas;
	}

	public void setStuTeas(Set stuTeas) {
		this.stuTeas = stuTeas;
	}

	public Set getStuHoms() {
		return this.stuHoms;
	}

	public void setStuHoms(Set stuHoms) {
		this.stuHoms = stuHoms;
	}

	
     
}