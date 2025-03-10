import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. Launch A Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring To manage - @Configuration > @Configuration public class HelloWorldConfiguration > name - @Bean


        //3. Retrieving Beans managed By spring
        var contextOfBean = context.getBean("name");
        System.out.println(contextOfBean);
    }
}