package ai.Rohit.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyMainApp {

	public static void main(String[] args) 
	{
//		Resource reource=new ClassPathResource("beans.xml");
//		BeanFactory factory=new XmlBeanFactory(reource); 
//		factory.getBean("credit", CreditCardPay.class);
////		factory.getBean("debitit", DebitCardPay.class);
		ApplicationContext factory=new ClassPathXmlApplicationContext("Beans.xml");
		factory.getBean("credit", CreditCardPay.class);
		factory.getBean("debit", DebitCardPay.class);
		PaymentProccessing process=factory.getBean("pay",PaymentProccessing.class);
		process.doPayment(100.0);
	}

}
