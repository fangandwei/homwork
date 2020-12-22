package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Classes;
import domain.FileQueryStudent;
import domain.FileQueryTeacher;
import domain.Homework;
import domain.School;
import domain.Stu;
import domain.StuHom;
import domain.Tea;

public class TeacherDao extends HibernateDaoSupport{
	//添加老师
	public void addTea(Tea tea ,String school,String  classes){
		Classes  classes1=new Classes();
	      School school2=new School();  
		 String sql3="SELECT schid FROM school WHERE school.`schname`=?";
         String sql2="SELECT clid FROM classes WHERE classes.`clbianhao`=?";	
         Query clid = this.getSession().createSQLQuery(sql2).setParameter(0, classes);
	      Query schid = this.getSession().createSQLQuery(sql3).setParameter(0, school);
	      List list3 = schid.list();
	      List list2 = clid.list();
	      Iterator iterator2 = list2.iterator();
	       Iterator iterator3 = list3.iterator();
	       while(iterator2.hasNext()){
		    	  Integer clid1 = (Integer) iterator2.next();
		    	  classes1.setClid(clid1);
	               tea.setClasses(classes1);
		      }
		      while(iterator3.hasNext()){
		    	  Integer scid2 = (Integer) iterator3.next();
		    	  school2.setSchid(scid2);
		    	  tea.setSchool(school2);
		    	  this.getHibernateTemplate().save(tea);
		      }
	}

	public List<Tea> findall() {
		// TODO Auto-generated method stub
		String sql ="from Tea";
		return this.getHibernateTemplate().find(sql);
	}
	
	

	public List<FileQueryTeacher> findbyname(String tename) {
		List<FileQueryTeacher> list1=new ArrayList<FileQueryTeacher>();

		String sql="SELECT  homework.hname ,stu.name ,homework.text "
                   +" FROM  stu, homework,stu_tea ,tea "
                   +" WHERE  stu_tea.sid =stu.id AND "
                   + " stu_tea.tid=tea.id "
                   + " AND homework.`tid`=tea.`id`"
	    + " AND tea.`id`=(SELECT tea.id FROM  tea WHERE tea.name=?)";
	/*	//数组定义方式
		Object [] obj=new Object [] {tename,sname};
		SQLQuery query = this.getSession()
				.createSQLQuery(sql);
		//给多个?设置值
		for (int i = 0; i < obj.length; i++) {
			query.setParameter(i, obj[i]);
		}*/
		SQLQuery query = (SQLQuery) this.getSession()
				.createSQLQuery(sql).setParameter(0,tename);
						
		List list = query.list();
		//查出来的数据是list，里面的一个个元素分别是obj []
        Iterator iterator = list.iterator(); 
        while(iterator.hasNext()){
        	
        	Object [] next = (Object[]) iterator.next();
        	//进行转换，分装到提前设置好的list中
        	String hname=(String) next[0];
        	String name=(String) next[1];
        	String text=(String) next[2];
         //用一个扩展类将数据分装   
         FileQueryTeacher filequery=new FileQueryTeacher(hname,name,text);
            list1.add(filequery);
        }
        System.out.println(list1);
		return list1;
	}
     //老师发布作业
	public void fabuzuoye(String text,String hname,String  name) {
		//把原来的作业查出来
		//添加新作业
		/*UPDATE homework
		SET homework.`text`='1，你觉得学习离散数学有什么用？' ,hname='离散数学'
		WHERE tid=(SELECT id
		FROM tea
		WHERE tea.`name`='zls');*/
       String sql="UPDATE homework" 
       +" SET homework.text=? ,hname=? "
       +" WHERE tid=(SELECT id "
       +" FROM tea WHERE tea.name=?);";
       SQLQuery query = this.getSession().createSQLQuery(sql);
      String [] para=new String []{text,hname,name};
        for (int i = 0; i < para.length; i++) {
			query.setParameter(i, para[i]);
		}
       query.executeUpdate();		
		
		
	}
	//老师发布作业
	public void  tfabuzuoye(String hname,String htext,String [] teachers,String []students){
		//查出来id
		Homework h=new Homework();
		h.setHname(hname);
		h.setText(htext);
		
		String sql ="SELECT id FROM tea WHERE tea.name=? ";
		SQLQuery query = this.getSession().createSQLQuery(sql);
		System.out.println(teachers[0]);
		Query q = query.setParameter(0, teachers[0]);
		List list = q.list();
		Iterator iterator = list.iterator();
		Tea tea=new Tea(); 
		while(iterator.hasNext()){
			Integer id = (Integer) iterator.next();
			System.out.println(id);
			tea.setId(id);
			h.setTea(tea);
			this.getHibernateTemplate().save(h);
		}
		
		String sql2 ="SELECT id FROM stu WHERE stu.name=? ";
		SQLQuery query2 = this.getSession().createSQLQuery(sql2);
		for(int i=0;i<students.length;i++){
		Query q2 = query2.setParameter(0, students[i]);
		
		List list2 = q2.list();
		Iterator iterator2 = list2.iterator();
		Stu stu=new Stu();
		StuHom stuhom=new StuHom();
		while(iterator2.hasNext()){
			Integer id = (Integer) iterator2.next();
			stu.setId(id);
			stuhom.setHomework(h);
			stuhom.setStu(stu);
			this.getHibernateTemplate().save(stuhom);
		}
		}
	}
//查具体学生的作业
	public List catdetail(String sname,String tname) {
		List<FileQueryTeacher> list1=new ArrayList<FileQueryTeacher>();
		// TODO Auto-generated method stub
		String sql =" SELECT stu_hom.`state`,stu_hom.`mytext`"
		+" FROM stu_hom,stu,tea,homework"
		+" WHERE stu_hom.`sid`=stu.`id`"
		+" AND stu_hom.`hid`=homework.`id`"
		+" AND homework.`tid`=tea.`id`"
		+" AND stu.id=(select stu.id from stu where stu.name=?)"
		+" AND tea.id=(select tea.id from tea where tea.name=?)";
		
		 SQLQuery query = this.getSession().createSQLQuery(sql);
		String [] para=new String []{sname,tname};
	        for (int i = 0; i < para.length; i++) {
				query.setParameter(i, para[i]);
			}
		List list = query.list();
		Iterator iterator = list.iterator();
		 while(iterator.hasNext()){
	        	
	        	Object [] next = (Object[]) iterator.next();
	        	//进行转换，分装到提前设置好的list中
	        	Integer state1=(Integer) next[0];
	        	String state = state1.toString();
	        	String mytext=(String) next[1];
	         //用一个扩展类将数据分装   
	         FileQueryTeacher filequery=new FileQueryTeacher(state,mytext);
	            list1.add(filequery);
	        }
	        System.out.println(list1);
			return list1;
		
	}

	//查看自己的个人信息；
		public List<FileQueryTeacher> tcatinfo(String name) {
			List list1=new ArrayList();
			// TODO Auto-generated method stub
String sql="SELECT school.`schname`,classes.`clbianhao`,tea.`name` "
+" FROM school,classes,tea "
+" WHERE tea.`classesid`=classes.`clid` "
+ " AND tea.`schoolid`=school.`schid`"
   +"   AND tea.`name`=? ";
			SQLQuery query = this.getSession().createSQLQuery(sql);
			query.setParameter(0, name);
			List list = query.list();
			    Iterator iterator = list.iterator();
			    while(iterator.hasNext()){
			    	Object [] next = (Object[]) iterator.next();
			    	String xname= (String) next[0];
			    	String  clacode = (String)next[1];
			    	 String name1 = (String)next[2];
			    	 
			          FileQueryTeacher fis=new FileQueryTeacher();
			          fis.setClassid(clacode);
			          fis.setName(name1);
			          fis.setSchoolname(xname);
			          list1.add(fis);
			    }
			System.out.println(list1);
			return list1;
//			System.out.println("-----");
		}
}
