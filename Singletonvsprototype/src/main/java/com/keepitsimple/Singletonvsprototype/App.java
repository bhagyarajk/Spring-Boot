package com.keepitsimple.Singletonvsprototype;



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
    
    ApplicationContext factory  = new ClassPathXmlApplicationContext("spring.xml");
    
  	Alien alien1 = (Alien) factory.getBean("alien");
    
    /*now let me explain something here  in the above statement your calling the getBean that means your basically asking the container to get 
    	create the object for you but when you ask every time for the Alien object you will stil get the same object the reason is scope in the spring.xml file
    	but you need different object every time then you need to specify the scope as the prototype this will lead to the lazy loading thats until you ask for the 
    	object object will not be created for you so for this project mainly look at the spring.xml file */
    
    Alien alien2 = (Alien) factory.getBean("alien");
    		if (alien1 == alien2) {
    			System.out.println("both are same objects");
    		}
    		else System.out.println("both are different objects");
    }
}
