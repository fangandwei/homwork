package dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Classes;
import domain.FileQueryStudent;
import domain.School;
import domain.Stu;
import domain.StuTea;
import domain.Tea;
/*
 * 原生sql----------------
 * 继承HibernateDaoSupport类，执行方法：
SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.executeUpdate();
		或者List list = sqlQuery.list();
sql就是你自己拼的sql语句。

*/
public class StudentDao extends HibernateDaoSupport{
	//增加学生；；
	public void addStu(Stu stu,String[] teachers,String classes,String school){
		for (String  teacher : teachers) {
			 StuTea stutea=new StuTea();
		      stutea.setStu(stu);
		      Tea tea=new Tea();
		      
		      
		      Classes  classes1=new Classes();
		      School school2=new School();
		      String sql3="SELECT schid FROM school WHERE school.`schname`=?";
              String sql2="SELECT clid FROM classes WHERE classes.`clbianhao`=?";		      
		      String sql="select id from tea where tea.name=?";
		      Query id = this.getSession().createSQLQuery(sql).setParameter(0, teacher);
		     
		      Query clid = this.getSession().createSQLQuery(sql2).setParameter(0, classes);
		      Query schid = this.getSession().createSQLQuery(sql3).setParameter(0, school);
		      List list3 = schid.list();
		      List list2 = clid.list();
		      Iterator iterator2 = list2.iterator();
		      List list = id.list();
		      Iterator iterator = list.iterator();
		       Iterator iterator3 = list3.iterator();
		      while(iterator.hasNext()){
		    	  Integer  tid = (Integer) iterator.next();
		    	  tea.setId(tid);
		    	  stutea.setTea(tea);
		    	this.getHibernateTemplate().save(stutea);
		    	  }
		      while(iterator2.hasNext()){
		    	  Integer clid1 = (Integer) iterator2.next();
		    	  classes1.setClid(clid1);
	               stu.setClasses(classes1);
		    	  
		      }
		      while(iterator3.hasNext()){
		    	  
		    	  Integer scid2 = (Integer) iterator3.next();

		    	  school2.setSchid(scid2);
		    	  stu.setSchool(school2);
		    	  this.getHibernateTemplate().save(stu);
		      }
		      
		
		
		}
		
		
		      }
	
	
	public List<Stu>  findall(){
		String sql="from  Stu";
		
		return this.getHibernateTemplate().find(sql);
	
	
	}

	public List<Stu> findOne() {
//		 TODO Auto-generated method stub
		String Sql ="from Student where id=?";
		return this.getHibernateTemplate().find(Sql);
	}
//根据学生名字查作业
    public List<FileQueryStudent> findallHom(String yourname){
    	/*SELECT  homework.hname ,stu_hom.state,homework.text,stu_hom.text 
		FROM stu_hom ,stu,homework
		 WHERE stu_hom.hid=homework.id AND stu_hom.sid=stu.id AND stu.name='zs'*/
//数据库中的字段最好不要相同，否则会有意想不到的错误发生
//比如查出来的两个不同字段中的值却一样，很诡异
    	String sql="SELECT  homework.hname ,stu_hom.state,homework.text,stu_hom.mytext " 
+" FROM stu_hom ,stu,homework"
+" WHERE stu_hom.hid=homework.id AND stu_hom.sid=stu.id AND stu.name=?";
    	SQLQuery sqlQuery = (SQLQuery) getSession().createSQLQuery(sql).setParameter(0, yourname);
    	List list = sqlQuery.list();
    	//list里面放的是object [] ,将他一个个的取出来，转换成相应的数据
    	System.out.println(list);
        Iterator iterator = list.iterator();
        //将迭代出来的数据放在新定义出来的list1列表中
        List<FileQueryStudent> list1=null;
        list1=new ArrayList<FileQueryStudent>();
        FileQueryStudent fff;
        FileQueryStudent fff1;
        String string=null;
    	String name=null;
    	Integer state=null;
    	String text=null;
    	String mytext=null;
        while(iterator.hasNext()){
        	Object [] next = (Object[]) iterator.next();
        	if((Integer) next[1]!=null&&(String) next[3]!=null){
        	name=(String) next[0];
        	 state= (Integer) next[1];
        	 string = state.toString();
        	text=(String)next[2];
        	mytext = (String) next[3];
        	fff=new FileQueryStudent(name,string,text,mytext);
            list1.add(fff);
        	}else{
        	 name=(String) next[0];
        	 text=(String)next[2];
        	 fff1=new FileQueryStudent(name,text);
             list1.add(fff1);
        	}
      
         //将迭代出来的数据放在类FileQueryStudent中
     
        System.out.println(list1.toString());
        
    }
    	return list1;
    }

	public void updatezuoyestate(String name,String mytext,String hname) {
		// TODO Auto-generated method stub
		//查出来，根据用户名查		//修改

		String sql="UPDATE stu_hom "
				+ "SET stu_hom.state='1',stu_hom.mytext=?  "
				+ "WHERE stu_hom.sid= (SELECT stu.id FROM stu WHERE stu.name=?)"
				+" AND  stu_hom.hid=(SELECT homework.id FROM homework "
				+ " WHERE homework.hname=?)";
		Query query = this.getSession().createSQLQuery(sql);
		String [] para=new String []{mytext,name,hname};
	    for (int i = 0; i < para.length; i++) {
			query.setParameter(i,para[i] );
		}
		//		String mytext
           query.executeUpdate();
           
	}


	public List  chaid(String name1) {
		String Sql  ="SELECT homework.text"  
    +" FROM homework,tea" 
    +" WHERE homework.`tid`=tea.`id` AND tea.name=?";
       Query q = this.getSession().createSQLQuery(Sql);
       String  pa []=new String[]{name1};
      for(int i=0;i<pa.length;i++){
    	  q.setParameter(i,pa[i]);
      }
       List list = q.list();
       Iterator iterator = list.iterator();
       List list1=new ArrayList();
       while(iterator.hasNext()){
    	   String text  = (String) iterator.next();
    	   list1.add(text);
    	  
       }
       return list1;
	}

//查看自己的个人信息；
	public List<FileQueryStudent> catmyinfo(String name) {
/*		SELECT school.`schname`,classes.`clbianhao`,stu.`name` 
		FROM school,classes,stu
		WHERE stu.`classId`=classes.`clid` AND stu.`xuexiaoid`=school.`schid`
		      AND stu.`name`='zs'*/
		List list1=new ArrayList();
		// TODO Auto-generated method stub
		String sql="SELECT school.`schname`,classes.`clbianhao`,stu.`name` " 
		+" FROM school,classes,stu"
		+" WHERE stu.`classId`=classes.`clid` AND stu.`xuexiaoid`=school.`schid`"
		    +"  AND stu.`name`=?";
		SQLQuery query = this.getSession().createSQLQuery(sql);
		
		
		query.setParameter(0, name);
		
		List list = query.list();
		     
		    Iterator iterator = list.iterator();
		    while(iterator.hasNext()){
		    	Object [] next = (Object[]) iterator.next();
		    	String xname= (String) next[0];
		    	String  clacode = (String)next[1];
		    	 String name1 = (String)next[2];
		          FileQueryStudent fis=new FileQueryStudent(xname,name1,clacode);
		          list1.add(fis);
		    }
		System.out.println(list1);
		return list1;
//		System.out.println("-----");
	}
 
}
