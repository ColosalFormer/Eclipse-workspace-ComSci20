package Tutorial_Packcage;

public class Hero {
//instance variables describes objects 
		private String name;
		private String power;
		private int age;
		private int health;
		private int dmgPerHit;
		
		public Hero() {
			name = "John doe";
			power = "Super speed";
			age = 24;
			health = 100;
			dmgPerHit = 12;
		}
		
		public Hero(String name, String power, int age, int health, int dmgPerHit) {
			this.name  = name;
			this.power = power;
			this.age = age;	
			this.health = health;
			this.dmgPerHit = dmgPerHit;
		}
		//setter
		public void setPower(String power) {
			this.power = power;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		
		public int getDmgPerHit() {
			return dmgPerHit;
		}
		public int getHealth() {
			return health;
		}
		
		public void attack(Hero h) {
			h.setHealth(h.getHealth() - dmgPerHit);
			//h.health = h.health - dmgPerHit;
		}
		
		public String toString() {
			return "Name: " + name + " Power: " + power;
		}
}
