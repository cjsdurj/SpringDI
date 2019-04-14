package springDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan
//@ImportResource("classpath:**/config.xml")
public class Config2 {
   @Bean
   public Weapon gun() {
	   return new Gun();
   }

}
