package domain;

/**
 * StuTea entity. @author MyEclipse Persistence Tools
 */

public class StuTea implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tea tea;
	private Stu stu;

	// Constructors

	/** default constructor */
	public StuTea() {
	}

	/** full constructor */
	public StuTea(Tea tea, Stu stu) {
		this.tea = tea;
		this.stu = stu;
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

	public Stu getStu() {
		return this.stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

}