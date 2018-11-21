package Tutorial_Packcage;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleObject r1 = new RectangleObject();
		RectangleObject r2 = new RectangleObject(5,20,200,5);
		
		r2.translate(25, -25);
		System.out.println(r1.toString());
		System.out.println(r2.toString());

		
		
	}

}
