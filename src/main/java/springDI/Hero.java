package springDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hero {
     private Weapon weapon;
     public Hero() {};
     
   //构造函数作为注入点
     
     public Hero(Weapon w) {
    	 this.weapon = w;
     }
    
     
	public Weapon getWeapon() {
		return weapon;
	}
     
	//settter作为注入点
	@Autowired
	@Close
	@Sharp
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
     
     public void attack() {
    	 System.out.println("英雄使用"+weapon.getName()+"攻击");
     }
}
