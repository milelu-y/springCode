package com.yedi.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mytest extends  User{
	public static void main(String[] args) {
		Mytest mytest = new Mytest();
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
////		XmlBeanFactory applicationContext = new XmlBeanFactory(new ClassPathResource("application.xml"));
//		User bean = applicationContext.getBean(User.class);
//		System.out.println(bean);
	}
}
