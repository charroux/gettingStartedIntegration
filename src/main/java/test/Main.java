package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("filter.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("routing.xml");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("serviceActivator.xml");

	}

}
 