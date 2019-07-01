import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xm.controller.TestController;

/**
 * Created by MA on 2019/6/23.
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext a = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        TestController tc = (TestController) a.getBean("testController");
        System.out.println(tc);
    }
}
