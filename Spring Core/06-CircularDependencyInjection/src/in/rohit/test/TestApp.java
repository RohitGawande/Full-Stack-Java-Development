package in.rohit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.rohit.comp.A;
import in.rohit.comp.B;

public class TestApp {

	public static void main(String[] args) throws Exception {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/rohit/cfg/applicationContext.xml");
		System.out.println("*****CONTAINER STARTED****\n");

		System.in.read();

		A aObj = factory.getBean("a1", A.class);
		
		B bObj = factory.getBean("b1", B.class);

		System.out.println("\n*****CONTAINER STOPPED****");

	}
}
