package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class FigureAdvice {

	 	void circle(JoinPoint joinPoint, double radius) {
	        System.out.println("Circle Radius: " + radius);
	    }

	    void rectangle(JoinPoint joinPoint, double width, double height) {
	        System.out.println("Rectangle Width: " + width + ", Height: " + height);
	    }

	    void triangle(JoinPoint joinPoint, double base, double height, double hypotenuse) {
	        System.out.println("Triangle Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse);
	    }
	
}
