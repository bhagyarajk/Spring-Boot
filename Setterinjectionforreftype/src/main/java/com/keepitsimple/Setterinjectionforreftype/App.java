package com.keepitsimple.Setterinjectionforreftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
       
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) factory.getBean("alien");
        alien.code();
        
    
    }
}
