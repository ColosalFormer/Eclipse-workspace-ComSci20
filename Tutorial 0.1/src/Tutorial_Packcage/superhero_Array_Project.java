package Tutorial_Packcage;

public class superhero_Array_Project {

	
	public static void main(String[] args) {
		String[] superheroes = {"Spiderman", "Batman", "Superman", "WonderWoman", "Flash"};// string array for superhero array 
		String[] superpowers = {"Spider sense","Intelligence", "Super strength", "Super strength", "Super speed"};//string array for superpowers
		boolean[] ifHuman = {true, true, false, false, true };//boolean array to tell if the superhero is either human or not
		
		System.out.println(superheroes[0]); //prints out first superhero in array 
		System.out.println(superheroes[superheroes.length - 1]);// prints out last superhero in list
		
		System.out.println();
		for(int i = 0; i < superheroes.length; i++) {//for loop to go through superhero array list
			System.out.println("Superhero: " + superheroes[i] + "\tPower: " + superpowers[i] + "\tAre they Human?: " + ifHuman[i]); //prints out
		}//end of for loop
		System.out.println();
		for(int i = 0; i < superheroes.length; i++) {//for loop to print out i value in front 
			System.out.println(+ i + "Superhero: " + superheroes[i] + "\tPower: " + superpowers[i] + "\tAre they Human?: " + ifHuman[i]);//prints i value in front
		}//end for loop
		for(int i = 0; i < ifHuman.length; i++) {// for loop when couprinite is exposed to non human superheroes
			if(ifHuman[i] == false ) {
				System.out.println();
				System.out.println("Superhero: " + superheroes[i] + "\tPower: " + superpowers[i]);
				superpowers[i] = "NONE";
			}//end if 
		}//end for loop
		System.out.println();
		for(int i = 0; i < superheroes.length; i++) {//for loop to print out NONE to superpowers if non human
			System.out.println("Superhero: " + superheroes[i] + "\tPower: " + superpowers[i] + "\tAre they Human?: " + ifHuman[i]);//prints out NONE to superpowers of non human superheroes

		}//end for loop
	}

} //end main
