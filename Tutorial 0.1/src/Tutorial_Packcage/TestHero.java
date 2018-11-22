package Tutorial_Packcage;

public class TestHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero();
		Hero h2 = new Hero("Spiderman", "Webslinging", 18,150,12);
		Hero h3  = new Hero("Chris Brown", "Iron fists", 23,200,10);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);
		System.out.println();
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		while(h1.getHealth() > 0) {
			
		
		h1.attack(h1);
		
		System.out.println("hero 1 health: " + h1.getHealth());
		}//end while
	}

}
