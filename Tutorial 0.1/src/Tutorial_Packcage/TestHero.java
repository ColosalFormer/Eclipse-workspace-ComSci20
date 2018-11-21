package Tutorial_Packcage;

public class TestHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero();
		Hero h2 = new Hero("Spiderman", "Webslinging", 18, 9000);
		Hero h3  = new Hero("Chris Brown", "Iron fists", 23, 100);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);
	}

}
