package car.example.Autowire.Constuctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationAutowireByConstructor.xml");
        car.example.Autowire.Constuctor.Car car = (car.example.Autowire.Constuctor.Car) context.getBean("myCar");
        car.displayDetails();
    }

}
