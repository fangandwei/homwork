package domain;

/**
 * StuHom entity. @author MyEclipse Persistence Tools
 */

public class StuHom implements java.io.Serializable {

	// Fields

	private Integer id;
	private Homework homework;
	private Stu stu;
	private Integer state;
	private String mytext;

	// Constructors

	/** default constructor */
	public StuHom() {
	}

	/** full constructor */
	public StuHom(Homework homework, Stu stu, Integer state, String mytext) {
		this.homework = homework;
		this.stu = stu;
		this.state = state;
		this.mytext = mytext;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Homework getHomework() {
		return this.homework;
	}

	public void setHomework(Homework homework) {
		this.homework = homework;
	}

	public Stu getStu() {
		return this.stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMytext() {
		return this.mytext;
	}

	public void setMytext(String mytext) {
		this.mytext = mytext;
	}

}