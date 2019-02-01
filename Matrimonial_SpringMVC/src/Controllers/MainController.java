package Controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import bean.UserBean;

import dao.MyDao;

@Controller
@SessionAttributes("email")//Session Management
public class MainController {
	@RequestMapping("/")
	public String Welcome()
	{
	   return "Home";
	}
	@RequestMapping("/register")
	public String registration()
	{
	 return "Register";
		
	}
	@ModelAttribute//Model Attribute annotation at method level
	public Model addCommonObject(Model m)
	{
		m.addAttribute("welcomemsg","Matrimonial Site");
		return m;
	}
	@RequestMapping("/registration")
	public ModelAndView empinsert(@ModelAttribute UserBean e)//Model Attribute annotation as method parameter
	{
		/*String empname=request.getParameter("ename");
		String esalary=request.getParameter("salary");
		double eesalary=Double.parseDouble(esalary);
		String empaddress=request.getParameter("address");
		
		ModelAndView mv=null;
		MyDao m=new MyDao();
		
		EmpBean e=new EmpBean();
		e.setEname(empname);
		e.setSalary(eesalary);
		e.setAddress(empaddress);*/
		MyDao m=new MyDao();
		ModelAndView mv=null;
		
		int x= m.insertUser(e);
		   if(x==1)
		   {
			mv=new ModelAndView("Register","msg","Data Inserted Succesfully") ;  
		   }
		   else {
			   mv=new ModelAndView("Register","msg","Data not inserted") ;
		   }
		   return mv;
	}
	@RequestMapping("/login")
	public String userLogin()
	{
	 return "UserLogin";
		
	}
	@RequestMapping("/userCheck")
	public ModelAndView userCheck1(@RequestParam String email,@RequestParam String pwd)
	{
	  ModelAndView mv=null;
		MyDao m=new MyDao();
		   int x=m.userCheck(email, pwd);
		  
		   
		   if(x==1)
		   {
			   String gender=m.getGender(email);
			   
			mv=new ModelAndView("UserHome","msg","Welcome At User Home") ;
			 mv.addObject("email",email);
			 
			 ArrayList<UserBean> list=m.viewUser(gender);
            
              
     		 mv.addObject("LIST",list);
              return mv;    

		   }
		   else {
			   mv=new ModelAndView("UserLogin","msg","Login Fail..Try Again") ;
		   }
		   return mv;
	}
	
}

