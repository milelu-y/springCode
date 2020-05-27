package com.yedi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
