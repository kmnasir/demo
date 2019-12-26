package com.example.demo;


import com.example.services.WelcomeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		//ApplicationContext ctx = new ClassPathXmlApplicationContext(
		//		"demo-config.xml");
		//WelcomeService scope = (WelcomeService) ctx.getBean("scopeTest");
		//WelcomeService scopeDuplicate = (WelcomeService) ctx.getBean("scopeTestDuplicate");
		//System.out.println(scope == scopeDuplicate);
		//System.out.println(scope + "::" + scopeDuplicate);
	}

}
