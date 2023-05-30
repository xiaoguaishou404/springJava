import org.example.dao.UserDaoMysqlImpl;
import org.example.entities.User;
import org.example.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
//        没有使用set时的调用
//        userServiceImpl.getUser();

//        使用set时的调用
//        控制反转，以前需要不断硬编码，现在变成参数。就这》》》》
        userServiceImpl.setUserDao(new UserDaoMysqlImpl());
        userServiceImpl.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());


    }


}
