package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = context.getBean("aref", A.class);
		System.out.println(a);
		System.out.println(a.getB());
		System.out.println(a.getB().getY());
	}
}
