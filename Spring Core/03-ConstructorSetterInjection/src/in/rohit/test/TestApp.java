package in.rohit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.rohit.comp.WishMessageGenerator;

public class ConstructorInjectionApp {

    public static void main(String[] args) throws Exception {

        System.out.println("***********ApplicationContext container starting************");

        // Load XML config from classpath
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationcontext.xml");

        System.out.println("***********ApplicationContext container started*************");

        // Get bean
        WishMessageGenerator wishMessage = context.getBean("wmg", WishMessageGenerator.class);
        System.out.println(wishMessage);

        String result = wishMessage.generateMessage("kohli");
        System.out.println(result);

        System.out.println("\n*******ApplicationContext is closing***********");

        ((ClassPathXmlApplicationContext) context).close(); // close container
    }
}
