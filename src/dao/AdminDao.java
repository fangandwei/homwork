package dao;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Admin;
import domain.Homework;
import domain.Stu;
import domain.StuHom;
import domain.StuTea;
import domain.Tea;
public class AdminDao extends HibernateDaoSupport{

	public Admin findOne() {
		// TODO Auto-generated method stub
		List find = this.getHibernateTemplate().find("from Admin");
		Admin admin1=new Admin();
		for (Object admin : find) {
			 admin1=(Admin)admin;
			System.out.println(admin1);
			
		}
		return admin1;
	}

	public List<Homework> cxzy() {
		// TODO Auto-generated method stub
		 List find = this.getHibernateTemplate().find("from Homework");
		return  find;
	}

//	public void upthw(Homework homework,String id) {
//		
//		
//		this.getHibernateTemplate().saveOrUpdate(homework);
//		
//	}

	public void delhw(Homework hm) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(hm);
		
	}
	public void delhw(StuHom sm) {
		// TODO Auto-generated method stub
		if(sm!=null){
		this.getHibernateTemplate().delete(sm);
		}
	}

	public Homework findById(Integer id) {
		// TODO Auto-generated method stub
	   return	this.getHibernateTemplate().get(Homework.class, id);
		
	}
	
	public List<StuHom> findById(Integer id,String in) {
		// TODO Auto-generated method stub
	   return  this.getHibernateTemplate().find("from domain.StuHom sm where sm.homework.id=?",id);
		
	}

	public void upthw(Homework homework,Integer id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(homework);
	}
    //查询学生
	public List<Stu> cxxs() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Stu");
	}

	public void upsture(Stu stu, Integer id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(stu);
		
	}

	public List<StuTea> findById(Integer id, Integer in) {
		// TODO Auto-generated method stub
		return  this.getHibernateTemplate().find("from domain.StuTea st where st.stu.id=?",id);
	}
	public void delstutea(StuTea stutea1) {
		// TODO Auto-generated method stub
		if(stutea1!=null){
		this.getHibernateTemplate().delete(stutea1);
	}
		}

	public Stu findstuById(Integer id) {
		// TODO Auto-generated method stub
		 return	this.getHibernateTemplate().get(Stu.class, id);
	}

	public void delstu(Stu stu) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(stu);
	}

	public List<Tea> cxls() {
		// TODO Auto-generated method stub
	   return	this.getHibernateTemplate().find("from Tea");
	}

	public void upteare(Tea tea, Integer id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(tea);
	}

	public List<StuTea> findById(int id, Double in) {
		// TODO Auto-generated method stub
		return  this.getHibernateTemplate().find("from domain.StuTea st where st.tea.id=?",id);
	}

	public Tea findteaById(int id) {
		// TODO Auto-generated method stub
		return	this.getHibernateTemplate().get(Tea.class, id);
	}

	public void deltea(Tea tea) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(tea);
	}
	
	
	
	
}
