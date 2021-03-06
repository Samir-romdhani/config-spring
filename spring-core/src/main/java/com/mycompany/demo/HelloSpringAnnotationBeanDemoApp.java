package com.mycompany.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAnnotationBeanDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);

		// call methods on the bean
		System.out.println(theTrackCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
