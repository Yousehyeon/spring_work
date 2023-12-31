package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.OrderData;
import aaa.model.OrderProduct;

@Controller
@RequestMapping("request/order")
public class OrderController {
	
	
	@GetMapping
	String orderForm() {
		return "req/orderForm";
	}
	
	@PostMapping
	String orderReg(OrderData od) {
		int sum=0;
		
		System.out.println(od);
		
		for(OrderProduct ss : od.getArr()) {
			 sum += ss.getTotal();
		}
		od.setSum(sum);
		return "req/orderReg";
	}
}
