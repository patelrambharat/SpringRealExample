package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
    }

}
