package Tutorial_Packcage;

public class Hero {

		private String name;
		private String power;
		private int age;
		private int powerlevel;
		
		public Hero() {
			name = "John doe";
			power = "Super speed";
			age = 24;
		}
		
		public Hero(String name, String power, int age, int powerlevel) {
			this.name  = name;
			this.power = power;
			this.age = age;	
			this.powerlevel = powerlevel;
		}
		
		public void setPower(String power) {
			this.power = power;
		}
		public String toString() {
			return "Name: " + name + " Power: " + power;
		}
}
