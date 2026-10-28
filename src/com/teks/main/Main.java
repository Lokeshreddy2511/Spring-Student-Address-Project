
package com.teks.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.teks.beans.SpringConfigFile;
import com.teks.beans.Student;

public class Main {

    
    public static void main(String[] args) {

        // Create the Spring container using Java configuration
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean(Student.class);
		
		std.display();

        
    }
}

// -------jar Files---------
//1.spring-bean 
//2. spring-core
//3.spring-context
//4.common-logging
//5.spring-exression
//6.Spring AOP
