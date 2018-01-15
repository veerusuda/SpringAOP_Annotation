package com.spring.learning.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	//@Before("execution(public void getMobileDetails())")
	@Before("execution(* com.spring.learning.springaop.Mobile.getMobileDetails(..))")
	public void getBeforeLog() {
		System.out.println("Log Printing Before Get Mobile Details.....");
	}
	
	//@After("execution(public void getMobileDetails())")
	@After("execution(* com.spring.learning.springaop.Mobile.getMobileDetails(..))")
	public void getAfterLog() {
		System.out.println("Log Printing After Get Mobile Details.....");
	}
	
	@AfterReturning(
		      pointcut = "execution(* com.spring.learning.springaop.Mobile.getMobileBrand(..))",
		      returning= "result")
	public void getAfterRunningLog(Object result) {
		System.out.println("Log Printing After Get Mobile Details with Result....."+result);
	}
	
	@AfterThrowing(
		      pointcut = "execution(* com.spring.learning.springaop.Mobile.throwError(..))",
		      throwing= "error")	
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("Log Printing After Returning Error....."+error);
		System.out.println("Exception inside Method::::"+joinPoint.getSignature().getName());
	}
	
	@Around("execution(* com.spring.learning.springaop.Mobile.getMobileInfo(..))")
	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Log Printing Before Get Mobile Details.....");
		joinPoint.proceed();
		System.out.println("Log Printing After Get Mobile Details.....");
	}
	
	// AOP is Applying for methods of a class
	@Around("execution(* com.spring.learning.springaop.Processor.*(..))")
	   public void logProcessorAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before Log..........");
		joinPoint.proceed();
		System.out.println("After Log...........");
		System.out.println("//////////////////////////////");
	}
	
	// AOP is Applying for methods of all class
	@Around("execution(* com.spring.learning.springaop.Info.*.*(..))")
		public void logInfoAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before Log..........");
		joinPoint.proceed();
		System.out.println("After Log...........");
		System.out.println("//////////////////////////////");
	}
	
}
