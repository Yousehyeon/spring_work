package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Figure {
    
    public double circle(double radius) {
        double area = Math.PI * radius * radius;
        double round = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + round);
        return area;
    }
    
    public double rectangle(double width, double height) {
        double area = width * height;
        double round = 2 * (width + height);
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + round);
        return area;
    }
    
    public double triangle(double base, double height, double hypotenuse) {
        double area = 0.5 * base * height;
        double round = base + height + hypotenuse;
        System.out.println("Triangle Area: " + area);
        System.out.println("Triangle Perimeter: " + round);
        return area;
    }
}