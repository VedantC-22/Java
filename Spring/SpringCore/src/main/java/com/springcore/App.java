package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = context.getBean("student1", Student.class);
		System.out.println(student1);
		System.out.println(student1.getProps());

		Student student2 = context.getBean("student2", Student.class);
		System.out.println(student2);

		List<String> coursesList = context.getBean("courses", List.class);
		System.out.println(coursesList.stream().collect(Collectors.joining(", ")));

		Courses cmap = context.getBean("cmap", Courses.class);
		System.out.println(cmap.getCourseMap());
		System.out.println(cmap.getCourseMap().get("course1"));
	}
}
