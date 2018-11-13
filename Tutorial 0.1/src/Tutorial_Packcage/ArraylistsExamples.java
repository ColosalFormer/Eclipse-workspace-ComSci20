package Tutorial_Packcage;
import java.util.ArrayList;

public class ArraylistsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listofInts = new ArrayList<>();
		//useful methods of ArrayList
		
		listofInts.add(98); //adding to Arraylist
		listofInts.add(55);
		listofInts.add(1,80);//inserts to index 1 in this case
		listofInts.remove(0); //remove item at first index
		listofInts.get(0);//returns item at index 0
		listofInts.size(); //return size of arrayList
		
		//print an arraylist
		listofInts.add(98);
		listofInts.add(24);
		
		for(int i = 0; i < listofInts.size(); i++) {
			System.out.println(listofInts.get(i));
		}
		listofInts.remove(listofInts.size()-1); //remove last element
		//print new arraylist
		for(int i = 0; i < listofInts.size(); i++) {
			System.out.println(listofInts.get(i));

		}
	}

}//end main
