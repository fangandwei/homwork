package service;

import java.util.List;

import dao.TeacherDao;
import domain.FileQueryTeacher;
import domain.Tea;

public class TeacherService {
	private TeacherDao teacherDao;
	

	
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	public void  addtea(Tea tea,String schoolname,String  classid){
		this.teacherDao.addTea(tea ,schoolname,classid);
		
		
	}
	public List<Tea> findall() {
		// TODO Auto-generated method stub
		
		return teacherDao.findall();
	}

	public List<FileQueryTeacher> findbyname(String tname) {
		// TODO Auto-generated method stub
		return teacherDao.findbyname(tname);
	}
	public void fabuzuoye(String text,String hname,String name) {
		// TODO Auto-generated method stub
		teacherDao.fabuzuoye(text,hname,name);
	}
	public void tfabuzuoye(String hname,String htext,String [] teachers,String [] students) {
		// TODO Auto-generated method stub
		
		teacherDao.tfabuzuoye(hname,htext,teachers,students);
		
	}
	public List catdetail(String sname,String tname) {
		// TODO Auto-generated method stub
		
    	return	teacherDao.catdetail(sname,tname);
		
	}
	public List<FileQueryTeacher>   tcatinfo(String string) {
		// TODO Auto-generated method stub
		return teacherDao.tcatinfo(string);
	}
	
	

}
