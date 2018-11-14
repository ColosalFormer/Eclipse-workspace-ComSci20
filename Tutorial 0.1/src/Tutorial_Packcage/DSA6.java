package Tutorial_Packcage;
import java.util.ArrayList;
import java.util.Scanner;
public class DSA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		allSongs.add("Thank u, next");
		artists.add("Ariana Grande");
		
		allSongs.add("Happier");
		artists.add("Marshmallow");
		
		allSongs.add("Without Me");
		artists.add("Halsey");
		
		allSongs.add("Everyone dies in their nightmares");
		artists.add("xxxtentacion");
		
		allSongs.add("BAD");
		artists.add("xxtentacion");
		//print library of songs and artists 
					
		for(int i = 0; i < allSongs.size(); i++) {//print all songs in play list 
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
		}
		int choice;
		do {
		System.out.println("1. add to library \n" +
							"2. delete from library \n" +
							"3. add to party playlist \n" +
							"4. exit");
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		

			switch(choice) {//what are we checking on 
			case 1:
				input.nextLine(); //gets rid of extra enter character 
				System.out.println("enter song title: ");
				allSongs.add(input.nextLine());
				System.out.println("enter artist name: ");
				artists.add(input.nextLine());
				break;
		
			case 2:
				input.nextLine(); //gets rid of extra enter character 
				System.out.println("Enter song number to delete: ");
				int delete = input.nextInt();
				allSongs.remove(delete);
				artists.remove(delete);
				break;
			case 3:
				input.nextLine(); //gets rid of extra enter character 
				System.out.println("enter song # to add to party playlist: ");
				partyPlaylist.add(allSongs.get(input.nextInt()));
				artists.add(input.nextLine());
				break;
			case 4:
				System.out.println("easy!!!");
				break;
			default: 
				System.out.println("That aint it chief");
			}//end switch
		}while(choice != 4);
	
		for(int i = 0; i < allSongs.size(); i++) {//print all songs in play list 
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));

		}

	}

}
