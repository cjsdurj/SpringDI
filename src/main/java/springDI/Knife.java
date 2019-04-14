package springDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Close
@Sharp
public class Knife implements Weapon {
    private String name ="刀";
	public String getName() {
		return name;
	}
    
}
