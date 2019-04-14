package springDI;

import java.io.File;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
		Hero hero = context.getBean(Hero.class);
		hero.attack();
		
        
	}

}
