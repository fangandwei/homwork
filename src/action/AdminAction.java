package action;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Admin;
import domain.Homework;
import domain.Stu;
import domain.StuHom;
import domain.StuTea;
import domain.Tea;
import service.AdminService;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	/**
	 * 
	 */
	
	private String hname;
	private String text;
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	private String password;
	private String  studentId;
	
	
	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	private static final long serialVersionUID = 1L;
	private Admin admin=new Admin();
	public Admin getModel() {
		// TODO Auto-generated method stub
		return  admin;
	}
	
	//实现超级管理员的登陆操作
	public  String  superlogin(){
		Admin admin1 = adminService.findOne();
		if(admin1.getName().equals(admin.getName())&&admin1.getPassword().equals(admin.getPassword())){
			
			return SUCCESS;
		}
		else{
			
			return ERROR;
		}
	   
	}	
	//实现查询作业操作
	public String cxzy(){
	 List<Homework> hwlist = adminService.cxzy();
	 System.out.println(hwlist);
	 ActionContext.getContext().getSession().put("hwlist", hwlist);
		
		return SUCCESS;
	}
	
	
//	upthw
	
	public String upthw(){
		String id1 = ServletActionContext.getRequest().getParameter("id");
		 int id = Integer.parseInt(id1);
		 ActionContext.getContext().getSession().put("upid", id);
		return SUCCESS;
	}
	
	public String updatehw(){

       Integer id = (Integer) ActionContext.getContext().getSession().get("upid");		
       Homework  homework=new Homework();
		homework.setId(id);
		homework.setHname(hname);
		homework.setText(text);
	    this.adminService.upthw(homework,id);		
		
		
		
		 
		return SUCCESS;
	}
	
	
	
//	delhw
	public String delhw(){
		   String id1 = ServletActionContext.getRequest().getParameter("id");
           System.out.println(id1);
		   int id = Integer.parseInt(id1);
		   String in="in";
		   List<StuHom> sms = adminService.findById(id, in);
		   for (StuHom stuHom2 : sms) {
			this.adminService.delhw(stuHom2);
		   }
		   Homework homework = adminService.findById(id);
		   adminService.delhw(homework);
		return SUCCESS;
	}
	
	
	public String cxxs(){
		List<Stu> students = this.adminService.cxxs();
		System.out.println(students);
		 ActionContext.getContext().getSession().put("students", students);
		return SUCCESS;
	}
	public String upstu(){
	String id1 = ServletActionContext.getRequest().getParameter("id");
	 int id = Integer.parseInt(id1);
	 ActionContext.getContext().getSession().put("upstuid", id);
	return SUCCESS;
	}
	
	public String upsture(){

	       Integer id = (Integer) ActionContext.getContext().getSession().get("upstuid");		
	       
	       String name = ServletActionContext.getRequest().getParameter("name");
	       String password = ServletActionContext.getRequest().getParameter("password");
	       Stu  stu=new Stu();
			stu.setId(id);
			stu.setName(name);
			stu.setPassword(password);
			stu.setStudentId(this.studentId);
		    this.adminService.upsture(stu,id);		
			return SUCCESS;
		}
//	delstu
	
	public String delstu(){
		
		  String id1 = ServletActionContext.getRequest().getParameter("id");
          System.out.println(id1);
		   int id = Integer.parseInt(id1);
		   Integer in=5;
		   List<StuTea> stutea = adminService.findById(id, 5);
		   for (StuTea stutea1 : stutea) {
			this.adminService.delstutea(stutea1);
		   }
		   Stu stu = adminService.findstuById(id);
		   adminService.delstu(stu);
		
		return SUCCESS;
	}
	
	
//	cxls
	public String cxls(){
		
		List<Tea> teachers = this.adminService.cxls();
		System.out.println(teachers);
		 ActionContext.getContext().getSession().put("teachers", teachers);
		return SUCCESS;
	}
	
	
	
	/*<action name="uptea" class="adminAction" method="uptea">
    <result name="success" >/pages/updatetea.jsp</result>
  </action>
  <!--upstu 更改老师信息 -->
   <action name="upteare" class="adminAction" method="upteare">
    <result name="success" type="chain">glls</result>
  </action>
  <!-- 删除 -->
  <action name="deltea" class="adminAction" method="deltea">
    <result name="success" type="chain">glls</result>
  </action>*/
	//跳转存id
	public String uptea(){
		
		String id1 = ServletActionContext.getRequest().getParameter("id");
		 int id = Integer.parseInt(id1);
		 ActionContext.getContext().getSession().put("upteaid", id);
		
		return SUCCESS;
	}
	//更新
	public String upteare(){
		Integer id = (Integer) ActionContext.getContext().getSession().get("upteaid");		
	       
	       String name = ServletActionContext.getRequest().getParameter("name");
	       String password = ServletActionContext.getRequest().getParameter("password");
	       Tea  tea=new Tea();
			tea.setId(id);
			tea.setName(name);
			tea.setPassword(password);
		    this.adminService.upteare(tea,id);
		return SUCCESS;
	}
	//删除老师
	public String deltea(){
		
		  String id1 = ServletActionContext.getRequest().getParameter("id");
          System.out.println(id1);
		   int id = Integer.parseInt(id1);
		   Double in=5.0;
		   List<StuTea> stutea = adminService.findById(id, in);
		   
		   for (StuTea stutea1 : stutea) {
			this.adminService.delstutea(stutea1);
		   }
		   Tea tea = adminService.findteaById(id);
		   
		   adminService.deltea(tea);
		
		
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
		
}
