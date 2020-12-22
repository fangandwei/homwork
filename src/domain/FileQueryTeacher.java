package domain;

import org.hibernate.annotations.Proxy;

@Proxy(lazy = false)
public class FileQueryTeacher {

	String  schoolname;
	String classid;
	
	
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	String hname;
	String name;
	String text;
	String state;
	String mytext;
    
    
    
	public FileQueryTeacher(String state, String mytext) {
		super();
		this.state = state;
		this.mytext = mytext;
	}
	@Override
	public String toString() {
		return "FileQueryTeacher [schoolname=" + schoolname + ", classid="
				+ classid + ", hname=" + hname + ", name=" + name + ", text="
				+ text + ", state=" + state + ", mytext=" + mytext + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMytext() {
		return mytext;
	}
	public void setMytext(String mytext) {
		this.mytext = mytext;
	}
	public FileQueryTeacher() {
		super();
	}
	public FileQueryTeacher(String hname, String name, String text) {
		super();
		this.hname = hname;
		this.name = name;
		this.text = text;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}