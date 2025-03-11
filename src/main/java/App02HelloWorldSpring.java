import com.ahShitHereWeGoAgain.learn_spring_framework.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. Launch A Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring To manage - @Configuration > @Configuration public class com.ahShitHereWeGoAgain.learn_spring_framework.HelloWorldConfiguration > name - @Bean


        //3. Retrieving Beans managed By spring
        var contextOfBean = context.getBean("name");
        System.out.println(contextOfBean);

        var ageOfBean = context.getBean("age");
        System.out.println(ageOfBean);

        var person = context.getBean("person");
        System.out.println(person);

        /**
        var address = context.getBean("address");
        System.out.println(address);
         */

        var address = context.getBean("address2");
        System.out.println(address);

        System.out.println(context.getBean("person2MethodCall"));
    }
}