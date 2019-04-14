package springDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hero {
     private Weapon weapon;
     public Hero() {};
     
     //���캯����Ϊע���
     
     public Hero(Weapon w) {
    	 this.weapon = w;
     }
    
     
	public Weapon getWeapon() {
		return weapon;
	}
     
	//settter��Ϊע���
	@Autowired
	@Close
	@Sharp
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
     
     public void attack() {
    	 System.out.println("Ӣ��ʹ��"+weapon.getName()+"����");
     }
}
