package com.qualde;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualde.config.AppConfig;
import com.qualde.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	context.getBean(StudentService.class).show();
        System.out.println( "Hello World!" );

    	//context.getBean(StudentAspect.class).log();
        
    }
}
