package springDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Far
public class Gun implements Weapon {
     private String name = " ÷«π";

	public String getName() {
		return name;
	}
     
     
}
