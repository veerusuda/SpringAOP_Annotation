package com.spring.learning.springaop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learning.springaop.AppConfig;
import com.spring.learning.springaop.Mobile;
import com.spring.learning.springaop.Info.Hardware;
import com.spring.learning.springaop.Info.Software;

@SpringBootApplication
public class SpringaopApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Mobile mobile = (Mobile) context.getBean("mobile");
		Processor processor = (Processor) context.getBean("processor");
		Software software = (Software) context.getBean("software");
		Hardware hardware = (Hardware) context.getBean("hardware");
		//mobile.getMobileBrand();
		/*try {
			mobile.throwError();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}*/
		//mobile.getMobileInfo();
		
		//processor.getName();
		//processor.getSpeed();
		
		software.getName();
		software.getDetails();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		hardware.getName();
		hardware.getDetails();
	}
}
