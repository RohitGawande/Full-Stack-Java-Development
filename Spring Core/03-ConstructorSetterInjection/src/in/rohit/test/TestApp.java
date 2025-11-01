package in.rohit.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.rohit.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/rohit/cfg/applicationContext.xml");
		System.out.println("Bean count is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is    :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("\n" + wmg);

		factory.close(); //closing the resources 
	}

}
