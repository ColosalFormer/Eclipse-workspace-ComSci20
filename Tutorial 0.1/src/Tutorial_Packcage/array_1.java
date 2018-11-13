package Tutorial_Packcage;
import java.util.Random;

public class array_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray = {"christian","tyrone","uniqua","scott","nya","mr.troung"};
		int[] gradeArray = new int[nameArray.length];
		int avg = 0;
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradeArray[i]);
			
		}
		Random r = new Random();//creates random object

		for(int i = 0; i < gradeArray.length; i++) {
			gradeArray[i] = r.nextInt(101);
		}
		for(int i = 0; i < gradeArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradeArray[i]);
		}
		gradeArray[5] = 85;
		for(int i = 0; i < gradeArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradeArray[i]);
		}
		
		for(int i = 0; i < gradeArray.length; i++) {//avg
			avg += gradeArray[i]; //summing grades
		}
		avg = avg/gradeArray.length;//dividing total number of grades
		System.out.println("class average: " + avg); //print class avg
	}

}//end main
