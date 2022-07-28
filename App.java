package com.id.gh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.id.gh");
		context.refresh();

		S1 ms = context.getBean(S1.class);

		int result = ms.add(1, 2);
		System.out.println("Addition of 1 and 2 = " +result);

		context.close();
    }
}
