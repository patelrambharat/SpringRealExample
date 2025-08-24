package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static <MyBean> void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
       MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean);
    }
}
