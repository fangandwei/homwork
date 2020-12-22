package service;

import java.util.List;

import dao.AdminDao;
import domain.Admin;
import domain.Homework;
import domain.Stu;
import domain.StuHom;
import domain.StuTea;
import domain.Tea;

public class AdminService {
	
	private AdminDao adminDao;
	
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
//	public List<Admin> findall(){
//		
//		return adminDao.findall();
//		}
	public Admin findOne() {
		// TODO Auto-generated method stub
		return adminDao.findOne();
	}
	public List<Homework> cxzy() {
		// TODO Auto-generated method stub
		
		return adminDao.cxzy();
		
	}
//	public void upthw(Homework homework,String id) {
//		
//		  adminDao.upthw(homework,id);
//		
//	}
	public void delhw(Homework homework) {
		// TODO Auto-generated method stub
		
		adminDao.delhw( homework);
	}
	public void delhw(StuHom stuhom) {
		// TODO Auto-generated method stub
		
		adminDao.delhw(stuhom);
	}
	public Homework  findById(Integer id) {
		// TODO Auto-generated method stub
		return adminDao.findById(id);
	}
	public Stu  findstuById(Integer id) {
		// TODO Auto-generated method stub
		return adminDao.findstuById(id);
	}
	public List<StuTea>  findById(Integer id,Integer in) {
		// TODO Auto-generated method stub
		return adminDao.findById(id,in);
		
	}
	
	public List<StuHom>  findById(Integer id,String in) {
		// TODO Auto-generated method stub
		return adminDao.findById(id,in);
		
	}
	
	
	public void upthw(Homework homework,Integer id) {
		adminDao.upthw(homework,id);
		
	}
	public List<Stu> cxxs() {
		// TODO Auto-generated method stub
		List<Stu> cxxs = this.adminDao.cxxs();
		return cxxs;
	}
	public void upsture(Stu stu, Integer id) {
		// TODO Auto-generated method stub
		adminDao.upsture(stu,id);
	}
	public void delstutea(StuTea stutea1) {
		// TODO Auto-generated method stub
		adminDao.delstutea(stutea1);
	}
	public void delstu(Stu stu) {
		// TODO Auto-generated method stub
		adminDao.delstu(stu);
	}
	public List<Tea> cxls() {
		// TODO Auto-generated method stub
		return adminDao.cxls();
	}
	public void upteare(Tea tea, Integer id) {
		// TODO Auto-generated method stub
		adminDao.upteare(tea,id);
	}
	public List<StuTea> findById(int id, Double in) {
		// TODO Auto-generated method stub
		return adminDao.findById(id,in);
	}
	public Tea findteaById(int id) {
		// TODO Auto-generated method stub
		return adminDao.findteaById(id);
	}
	public void deltea(Tea tea) {
		// TODO Auto-generated method stub
		adminDao.deltea(tea);
	}
	
		
		
	
	
	
	
	
	

}
