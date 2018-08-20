package com.qualde.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@Configuration
@EnableAspectJAutoProxy
public class StudentAspect {
 public StudentAspect() {
		System.out.println("++++++++ Aspect object created..");
		}
	
	/*@Before("execution(public void show())")
	public void log1() {
		System.out.println("before......log aspect---------");
	}*/
	
	/*@Before("execution(* com.qualde.service.StudentService.*(..))")
	public void log() {
		System.out.println("before......log aspect---------");
	}
	
	@Before("execution(void com.qualde.service.StudentService.*(..))")
	public void log() {
		System.out.println("before--->>>log aspect---------");
	}

	@After("execution(* com.qualde.dao.*.*(..))")
	public void after(JoinPoint joinPoint) {
		
		System.out.println("after aspect --->>> "+joinPoint);
	}
	
	@Around("execution(* com.qualde.dao.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("around start----->>> "+joinPoint);
		
		joinPoint.proceed();
		
		System.out.println("around last---->>>"+joinPoint);
	}
 
 
 @AfterReturning(
		 value="execution(* com.qualde.dao.*.*(..))",
		 returning="result")
 public void afterReturning(JoinPoint joinPoint,Object result) {
	 
	 System.out.println("AfterReturning------>>>>>"+result);
 }*/
 
 
 @AfterThrowing(value="execution(* com.qualde.dao.*.*(..))",
		 throwing="exception")
 
 public void afterThrowing(JoinPoint joinPoint,Exception exception) {
	 System.out.println("AfterThrowing------->>>>"+exception);
 }
 
	
}
