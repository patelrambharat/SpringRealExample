package car.example.IOC.bean.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationIOCLooseCouplingExa.xml");

//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerwithuserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerwithnewDatabaseProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerwithwebServiceDataProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
