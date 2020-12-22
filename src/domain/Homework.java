package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Homework entity. @author MyEclipse Persistence Tools
 */

public class Homework implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tea tea;
	private String hname;
	private String text;
	private Set stuHoms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Homework() {
	}

	/** full constructor */
	public Homework(Tea tea, String hname, String text, Set stuHoms) {
		this.tea = tea;
		this.hname = hname;
		this.text = text;
		this.stuHoms = stuHoms;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tea getTea() {
		return this.tea;
	}

	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Set getStuHoms() {
		return this.stuHoms;
	}

	public void setStuHoms(Set stuHoms) {
		this.stuHoms = stuHoms;
	}

}