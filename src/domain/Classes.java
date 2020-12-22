package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Classes entity. @author MyEclipse Persistence Tools
 */

public class Classes implements java.io.Serializable {

	// Fields

	private Integer clid;
	private String clbianhao;
	private Set stus = new HashSet(0);
	private Set teas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Classes() {
	}

	/** full constructor */
	public Classes(String clbianhao, Set stus, Set teas) {
		this.clbianhao = clbianhao;
		this.stus = stus;
		this.teas = teas;
	}

	// Property accessors

	public Integer getClid() {
		return this.clid;
	}

	public void setClid(Integer clid) {
		this.clid = clid;
	}

	public String getClbianhao() {
		return this.clbianhao;
	}

	public void setClbianhao(String clbianhao) {
		this.clbianhao = clbianhao;
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