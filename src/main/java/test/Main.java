package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("javaScriptService.xml");

		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
		myGateway.method("Salut !");

	}

}
 