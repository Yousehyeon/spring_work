package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	//@ResponseBody
	String homeGo() {
		System.out.println("홈이다");
		//return "homehome";
		return "home";  // views/home.html
		
/*
application.yaml 설정

spring :
  thymeleaf:
    prefix : views/
    suffix : .html
    cache : false
     
 * */		
		
	}
}