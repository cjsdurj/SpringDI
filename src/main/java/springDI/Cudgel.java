package springDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Close
@NonSharp
public class Cudgel implements Weapon {

	private String name ="¹÷";

	public String getName() {
		return name;
	}
}
