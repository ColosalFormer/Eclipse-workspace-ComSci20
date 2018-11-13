package Tutorial_Packcage;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class monster_Game {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		String[] monsters = {"vampire", "shrek", "frankenstein" ,"scott", "zombie", "werewolf", "chris brown","player"};
		
		System.out.println("Enter player name: ");
		monsters[monsters.length - 1] = "Player: " + input.nextLine();
		
		int[] coins = new int[monsters.length];
		//add coins
		for(int i = 0; i < monsters.length; i++) {
			coins[i] = (int)(Math.random() * 17) + 2;
			TimeUnit.MILLISECONDS.sleep(50);
			System.out.println(monsters[i] + " has " + coins[i] + " gold coins ");
		}
		String[] abilities = new String[monsters.length];
		
		abilities[0] = "fangs";
		abilities[1] = "onions";
		abilities[2] = "Brute Strength";
		abilities[3] = "Edging";
		abilities[4] = "brain eating teeth";
		abilities[5] = "sharp claws";
		abilities[6] = "beating";
		abilities[7] = "Double grenade launchers";
		

		System.out.println();
		//prints out abilities
		for(int i = 0; i < monsters.length; i++) {
			TimeUnit.MILLISECONDS.sleep(50);
			System.out.println(monsters[i] + " will attack with " + abilities[i]);
		}
		
		int[] hp = new int[monsters.length];
		//assign random hp
		for(int i = 0; i < monsters.length; i++) {
			hp[i] = (int)(Math.random() * 20 + 2);
		}
		System.out.println();
		//prints out hp
		for(int i = 0; i < monsters.length; i++) {
			TimeUnit.MILLISECONDS.sleep(50);
			System.out.println(monsters[i] + " has " + hp[i] + " health points");
		}
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
		
		System.out.println("the " + monsters[2] + " ate a teenager, how " +
		"many coins did it get? ");
		coins[2] += input.nextInt();//adding coins to coins[2]
		input.nextLine(); //get rid of extra enter chracter
		
		//taking in a string from user input
		System.out.println(monsters[2] + " morphs into what?: " );//prompt
		monsters[2] = input.nextLine();
		
		System.out.println("the monster is a: " + monsters[2]);
		
		//todo list
		int totalCoins = coins[monsters.length-1];//accumulator
		int turns = 0; //accumulator
		//fight while player hp is > 0
		while(hp[hp.length-1] > 0) {
			int randomMonster = (int)(Math.random() * monsters.length);//pick random monster
			if (randomMonster != monsters.length - 1) {
				//decide hit or be hit
			int hitChance = (int)(Math.random() * 2);
			
			if(hitChance % 2 == 0 ) {//
				//subtract random hp if player is hit 
			int randomDmg = (int)(Math.random() * 2 + 1);
			hp[monsters.length - 1] -= randomDmg; //subtracting hp
			System.out.println(monsters[randomMonster]  + " hit for " + randomDmg + " hp!" + hp[monsters.length-1] + 
				"HP left.");
			
			}
			else {//player does dmg
				TimeUnit.MILLISECONDS.sleep(90);
				System.out.println("player hits with " + abilities[monsters.length-1] 
				+ " " + monsters[randomMonster] + " runs away with " + coins[randomMonster] + " coins"); //prints message to console
			totalCoins += coins[randomMonster]; //adds coins from monster to total coins 
				
			}
			//track number of turns 
			turns++;
			}//end if
			System.out.println();
		}//end while
		TimeUnit.MILLISECONDS.sleep(50);
		System.out.println("You run away with " + totalCoins + " coins "
		+ " and lasted " + turns + " turns");  //prints total coins gained from turns
	}//end main
	
}
