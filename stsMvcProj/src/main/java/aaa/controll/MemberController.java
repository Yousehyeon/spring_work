package aaa.controll;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Person;

@Controller
@RequestMapping("request")
public class MemberController {
	
	@RequestMapping("mem1")
	ModelAndView mem1() {
		ModelAndView mem = new ModelAndView();
		mem.setViewName("req/member");
		mem.addObject("id", "dbtpgus");
		mem.addObject("password", "asd123");
		mem.addObject("password1", "asd123");
		mem.addObject("pname", "유세현");
		mem.addObject("email", "dbtpgus111");
		return mem;
	}
	
	@RequestMapping("memberForm")
	String memberForm() {
		return "req/memberForm";
	}
	
	@RequestMapping("memberReg")
	String memberReg( 
			@ModelAttribute("id") String id,
			@ModelAttribute("password") String password,
			@ModelAttribute("password1") String password1,
			@ModelAttribute("pname") String pname,
			@ModelAttribute("email") String email) {
		System.out.println("id:"+id);
		System.out.println("password:"+password);
		System.out.println("password1:"+password1);
		System.out.println("pname:"+pname);
		System.out.println("email:"+email);
		return "req/memberReg";
	}
	
	
}
