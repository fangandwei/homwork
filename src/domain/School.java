package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * School entity. @author MyEclipse Persistence Tools
 */

public class School implements java.io.Serializable {

	// Fields

	private Integer schid;
	private String schname;
	private Set stus = new HashSet(0);
	private Set teas = new HashSet(0);

	// Constructors

	/** default constructor */
	public School() {
	}

	/** full constructor */
	public School(String schname, Set stus, Set teas) {
		this.schname = schname;
		this.stus = stus;
		this.teas = teas;
	}

	// Property accessors

	public Integer getSchid() {
		return this.schid;
	}

	public void setSchid(Integer schid) {
		this.schid = schid;
	}

	public String getSchname() {
		return this.schname;
	}

	public void setSchname(String schname) {
		this.schname = schname;
	}

	public Set getStus() {
		return this.stus;
	}

	public void setStus(Set stus) {
		this.stus = stus;
	}

	public Set getTeas() {
		return this.teas;
	}

	public void setTeas(Set teas) {
		this.teas = teas;
	}

}