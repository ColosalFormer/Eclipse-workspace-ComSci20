package Tutorial_Packcage;
    import java.util.ArrayList;
	// imports ArrayList
	import java.util.Scanner;
	// imports scanner
	import java.util.Random;
	// imports random
public class pygame {
	
static int UserHP = 50;
// sets UserHP to 50
static ArrayList<String> BackPack = new ArrayList<String>();
// makes a BackPack which will be filled with items during gameplay

public static void YourRoom() {
// creates YourRoom with no arguments  
  System.out.println ("Your name is Rebly.");
  //System.out.printlns Your name is Rebly
  //sleep(4);
  // //sleeps the program for 4 seconds
  System.out.println ("Rebly wakes up in their room.");
  // System.out.printlns UserName <- Choice of user + "wakes up in their room"
  
  ////sleeps the program for 3 seconds
  System.out.println ("You wake up with only underwear on.");
  // System.out.printlns "You wake up with only underwear on."
  
  ////sleeps the program for 3 seconds
  System.out.println ("You hear glass breaking outside.");
  // System.out.printlns "You hear glass breaking outside"
   
  ////sleeps the program for 3 seconds
  System.out.println ("You look out the window and zombies are overrunning the place.");
  // System.out.printlns "You look out the window and zombie are overrunning the place."
  //sleep(4);
  ////sleeps the program for 4 seconds
  System.out.println ("You know you have to make quick decisions.");
  // System.out.printlns "You know you have to make quick decisions."
  
  ////sleeps the program for 3 seconds
  System.out.println ("Your options are\n" +
  "1: Jump out the Window(Potential Danger)\n" +
  "2: Walk out of the Room(Potential Danger) ");
  // System.out.printlns "Your options are
  // 1: Jump out the Window(Potential Danger);
  // 2: Walk out of the Room(Potential Danger);
  
  System.out.println("Enter a Number for your Choice, Remember Both have potential Danger");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // makes the variable choice and System.out.printlns "Enter a number for your Choice, Remember both have potential Danger"
  if (choice == 1) {
  // if the (choice == 1) continues  
    window1();
    // continues through window01
  }
  else if (choice == 2) {
  // if the choice is 2 continues
    door1();
    // continues through door01
  } 
  else {
  // if the anwser is different than 1 or 2 continue
    System.out.println ("Invalid choice, Try again");
    // System.out.printlns Invalid choice, Try again
    YourRoom();
  }}
public static void window1() {
//public static voidines window01 with no arguments
    System.out.println ("You die from the fall. Bad choice");
    //System.out.printlns You die from the fall. Bad choice
    
    ////sleeps the program for 3 seconds
    YourRoom();
    //calls YourRoom so it goes back to the beginning
}
public static void door1() {
//public static voidines door1 with no arguments 
  System.out.println ("You end up in your kitchen.");
  //System.out.printlns You end up in your kitchen
  
  ////sleeps the program for 3 seconds
  System.out.println ("You hear a noise coming from the basement");
  //System.out.printlns You head a noise coming from the basement
  
  ////sleeps the program for 3 seconds
  System.out.println ("Go to see what caused the noise? or Stay?");
  // System.out.printlns "Go to see what caused the noise? or Stay?"
  
  System.out.println("Choose 1 to Go, Choose 2 to Stay");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  //makes the variable choice and says "Go see what cause the noise? Or Stay?"
  if (choice == 1) {
  //if the userchoice is equal to "Go" continue
    basement1();
    // calls basement1();
  }
  else if (choice == 2 ) {
  // else if the choice is equal to "Stay" continue
    kitchen1();
    // calls kitchen1();
  }
  else { 
  // if the anwser is something either than "Go" or "Stay" continue
    System.out.println ("Invalid choice, Try again");
    // System.out.printlns "Invalid choice, Try again"
    door1();
    // calls door1();
  }}

public static void basement1() {
// public static voidines basement1 with nho arguments
  System.out.println ("You enter the Basement");
  // System.out.printlns "You enter the Basement"
  
  
  System.out.println ("False alarm, It was just a box");
  // System.out.printlns "False alarm, It was just a box"
  
  
  System.out.println ("There is however clothes for you to take");
  // System.out.printlns There is however clothes for you to take
  
  
  System.out.println ("Would you like to take these clothes?");
  // System.out.printlns Would you like to take these clothes?
  
  
  
  System.out.println("Say 1 to take clothes. Say 2 to leave them");Scanner input = new Scanner(System.in);int choice = input.nextInt();

  
  // makes the choice variable and System.out.printlns "Say yes to take clothes. Say no to leave them"
  if (choice == 1 && !BackPack.contains("Clothes")) {
  // if the user choice equals to Yes and clothes are not in the variable BackPack continue  
    if (!BackPack.contains("Clothes")) {
    // if Clothes are not in BackPack continue
      BackPack.add("Clothes");
      System.out.println("Clothes have been added to your inventory");
    }
      // goes to BackPack and adds the Item "Clothes to it" 
   else if (choice == 1 && BackPack.contains("Clothes")) {
	   if (BackPack.contains("Clothes")) {
    	// if Clothes are in BackPack continue  
    	System.out.println ("You already have clothes. Why would you need more?");
    	// System.out.printlns "You already have clothes. Why would you need more?"
	   }
     }


   else if (choice == 2) {
	// if the user choice is equal to No continue  
    System.out.println ("Thats alright, I also like being without clothes");
    // System.out.printlns Thats alright, I also like being without clothes 
   }
  }
  else {
  // if anything other than 'No' or 'no' or 'Yes' or 'yes' continue
    System.out.println ("I don't think you understood the question");
    //System.out.printlns "I don't think you understood the question"
    
    ////sleeps the program for 3 seconds
    basement1();
    //calls the function basement1(); to go to it
  }
  System.out.println ("You suddenly remember your dad had a safe with guns.");
  //System.out.printlns You suddenly remember your dad had a safe with guns.
  
  
  System.out.println ("There is however an alarm on the door to the room");
  // System.out.printlns There is however an alarm on the door to the room
  
  
  System.out.println ("You do not know what the passcode to turn off the alarm is.");
  // System.out.printlns "You do not know what the passcode to turn off the alarm is."
  
   
  System.out.println ("Your choices are\n" +
  "1. Continue Through the door anyways.\n" +
  "2. Go back to the kitchen\n");
  // System.out.printlns Your choices are
  // 1. Continue Through the door anyways.
  // 2. Go back to the kitchen
  
  System.out.println("Say 1 to Continue, or Say 2 to go Back");input = new Scanner(System.in);choice = input.nextInt();
  // creates the variable choice and System.out.printlns "Say 1 to Continue, or Say 2 to go Back"
  if (choice == 1) {
  // if the choice is equal to 1 continue 
    System.out.println ("Might as well go since we're down here.");
    // System.out.printlns "Might as well go since we're down here."
    gunroom();
    // calls gunroom(); to go there
  }
  else if (choice == 2) {
  // else if the choice is equal to 2 continue  
    System.out.println ("I'm not going to take that chance, it might be too loud.");
    // System.out.printlns "I'm not going to take that chance, it might be too loud."
    kitchen1();
    //calls kitchen1(); to go to that function
  }
  else {
  // if the choice is anything other than 1 or 2 continue  
    System.out.println ("Invalid choice, maybe you didn't understand?");
    // System.out.printlns "Invalid choice, maybe you didn't understand?"
    
    
    basement1();
    // calls the basement1(); function to go there
  }}
public static void kitchen1() {
// public static voidines Kitchen1 with no arguments
  System.out.println ("You return to the kitchen.");
  //System.out.printlns You return to the kitchen
  
  // //sleeps the program for 2 seconds
  System.out.println ("You have to make a choice whether to leave the house and find people, or stay and make a hideout?");
  //System.out.printlns "You have to make a choice whether to leave the house and find people, or stay and make a hideout?"
  
  System.out.println("Enter 1 to leave, or Enter 2 to Stay");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and System.out.printlns "Enter Leave to leave, or Enter Stay to Stay"
  if (choice == 1) {
  // if the user choice is equal to 'Leave' or 'leave' continue
    System.out.println ("You leave the house to try and find people");
    // System.out.printlns "You leave the house to try and find people"
    
    ////sleeps the program for 3 seconds
    System.out.println ("The moment you leave the house you see people");
    // System.out.printlns "The moment you leave the house you see people"
    
    
    System.out.println ("The people you have found are your family members.");
    // System.out.printlns "The people you have found are your family members."
    
    ////sleeps the program for 3 seconds
    Endgame();
    // calls the function Endgame(); to continue to it
  }
  else if (choice == 2) {
  // else if the user choice = 'Stay' or 'stay' continue
    System.out.println ("Ok, well if we're going to stay we might as well secure this place.");
    //System.out.printlns "Ok, well if we're going to stay we might as well secure this place."
    
    ////sleeps the program for 3 seconds
    System.out.println ("There's a couple of things that you could take apart.");
    // System.out.printlns "There's a couple of things that you could take apart."
    
    ////sleeps the program for 3 seconds
    System.out.println ("Would you like to take apart the chair's, the table's, or the cabinet's?");
    // System.out.printlns "Would you like to take apart the chair's, the table's, or the cabinet's?"
    
    
    System.out.println ("There are 3 chair's and each chair gives 4 wood");
    // System.out.printlns "There are 3 chair's and each chair gives 4 wood"
    
    ////sleeps the program for 3 seconds
    System.out.println ("There is 1 table and it gives 10 wood");
    // System.out.printlns "There is 1 table and it gives 10 wood"
    
    
    System.out.println("There are 7 cabinets which give 3 wood each.");
    // System.out.printlns "There are 7 cabinets which give 3 wood each."
    
    ////sleeps the program for 3 seconds
    System.out.println("You require 21 wood to complete the house, you only have enough energy to take apart 1 item.");
    // System.out.printlns "You require 21 wood to complete the house, you only have enough energy to take apart 1 item."
    
    
    System.out.println("Enter 1 for chair's, 2 for table's, 3 for Cabinets");input = new Scanner(System.in);choice = input.nextInt();
    // creates the variable choice and System.out.printlns "Enter Ch for chair's, T for table's, C for Cabinets"
  
    if (choice == 1) {
    // if the user choice equals to 1 continue
      System.out.println ("Calculating...");
      // System.out.printlns "Calculating..."
      
      ////sleeps the program for 2 seconds 
      System.out.println ("...........");
      // pritns ...........
      
      // //sleeps the frogram for 2 seconds
      System.out.println ("I think you might need to practice your math a bit.");
      // System.out.printlns "I think you might need to practice your math a bit."
      kitchen1();
      // calls the function kitchen1(); to go back to it
    }
    else if (choice == 2) {
    // else if the chocie is equal to 2 continue
      System.out.println ("Calculating...");
      // System.out.printlns "Calculating..."
      
      // //sleeps the program for 2 seconds
      System.out.println ("...........");
      //System.out.printlns "..........."
      
      System.out.println ("If only there was another table than you would be good.");
      // System.out.printlns "If only there was another table than you would be good."
      
      
      System.out.println ("But sadly I think your math is a bit off");
      // System.out.printlns "But sadly I think your math is a bit off"
      kitchen1();
      // call the function kitchen1(); to go back to it
    }
    else if (choice == 3) {
    // else if the choice is equal to 3 continue
      System.out.println ("Calculating...");
      //System.out.printlns "Calculating..."
      
      // //sleeps the program for 2 seconds
      System.out.println ("..........");
      // System.out.printlns ".........."
      
      // //sleeps the program for 2 seconds
      System.out.println ("Well done sir! Your math is on point!");
      // System.out.printlns "Well don sir! Your math is on point!"
      
      ////sleeps the program for 3 seconds
      System.out.println ("Wow, that was some hard work.");
      // System.out.printlns "Wow, that was some hard work."
      
      
      System.out.println ("I think you deserve some well rest, you'll continue tomorrow.");
      // System.out.printlns "I think you deserve some well rest, you'll continue tomorrow."
      //sleep (4);
      // //sleeps the program for 4 seconds
      wakeup();
      // calls the function wakeup(); to go to it
    }
    else {
    // if anything else is written than 1, 2 or 3 continue
      System.out.println ("I don't think you know your numbers.");
      // System.out.printlns "I don't think you know your numbers."
      
      
      System.out.println ("Try again");
      // System.out.printlns "Try again"
      
      // //sleeps the program for 2 seconds
      kitchen1();
      // calls the function kitchen1(); to go back to it
    }}
  else {
  // if anything else is typed other than 1 or 2 continue
    System.out.println("I don't think you understood the question.");
    // System.out.printlns "I dont think you understood the question."
    
    
    System.out.println ("Try again");
    // System.out.printlns "Try again"
    
    ////sleeps the program for 2 seconds
    kitchen1();
    // calls the function kitchen1(); to go back to it
  }
  }
public static void wakeup() {
// public static voidines the fuction wakeup();
  System.out.println ("Yawwwwn!");
  // System.out.printlns Yawwwwn!
  
  // //sleeps the program for 2 seconds
  System.out.println ("That was a good rest don't you think?");
  // System.out.printlns "That was a good rest don't you think?"
  
  System.out.println("Enter 1 to leave, or Enter 2 to Stay");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the function choice and System.out.printlns "Enter 1 for Yes, or 2 for No"
  if (choice == 1) {
  // if the user choice is equal to 1 continue
    System.out.println("You bet it was!");
    // System.out.printlns "You bet it was!"
    //sleep(1);
    // //sleeps the program for 1 second
    System.out.println("Now let's continue this journey shall we?");
    // System.out.printlns "Now let's continue this journey shall we?"
    
    // //sleeps the program for 2 seconds
    
    System.out.println("Enter 1 to continue, or 2 to stop");input = new Scanner(System.in);choice = input.nextInt();
    // creates the variable choice and System.out.printlns "Enter 1 to continue, or 2 to stop"
  }
    if (choice == 1) {
    // if the user choice is equal to 1 continue
      System.out.println("Great let's get back to securing this place!");
      // System.out.printlns "Great let's get back to securing this place!"
      
      // //sleeps the program for 2 seconds
      journeycontinue();
      // calls the function journeycontinue to continue to it
    }
    else if (choice == 2) {
    // else if the choice is equal to 2 continue
      System.out.println("You stopped the journey.");
      // System.out.printlns "You stopped the journey"
      
      // //sleeps the program for 2 seconds
      System.out.println ("Just kidding you can't stop this journey.");
      // System.out.printlns "Just kidding you can't stop this journey"
      
      
      System.out.println ("Now let's continue and stop being lazy");
      // System.out.printlns "Now let's continue and stop being lazy"
      
      // //sleeps the program for 2 seconds
      journeycontinue();
      // calls the function journeycontinue(); to continue to it
    }
    else {
    // if anything other than 1 or 2 is entered continue
      System.out.println ("I don't think that you understood the question");
      // System.out.printlns "I don't think that you understood the question"
      
      
      System.out.println ("Try again");
      // System.out.printlns "Try again"
      
      // //sleeps the program for 2 seconds
      wakeup();
      // calls the function wake up to go back to it
    }
  if (choice == 2) {
  // else if the user choice is equal to 2 continue
    System.out.println("Well you have no choice we're continuing this journey!");
    // System.out.printlns "Well you have no choice we're continuing this journey!"
    
    // //sleeps the program for 2 seconds
    journeycontinue();
  }
  else {
  // if the user choice is anything other than 1 or 2 continue
    System.out.println ("I don't think that you understood the question");
    // System.out.printlns "I don't think that you understood the question"
    
    
    System.out.println ("Try again");
    // System.out.printlns "Try again"
    
    // //sleeps the program for 2 seconds
    wakeup();
    // calls the function wakeup(); to continue to it
  }}
public static void journeycontinue() {
// public static void journeycontinue();
  System.out.println("Well we have baricaded the windows and doors already");
  // System.out.printlns "Well we have baricaded the windows and doors already"
  
  
  System.out.println("We might as well dismantle the table and chairs too.");
  // System.out.printlns "We might as well dismantle the table and chairs too."
  
  
  System.out.println("What would you like to dismantle first?");
  // System.out.printlns "What would you like to dismantle first?"
  
  ////sleeps the program for 2 seconds
  System.out.println("Enter 1 for Tables, or 2 for chairs");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and System.out.printlns "Enter 1 for Tables, or 2 for chairs"
  if (choice == 1) {
  // if the user choice is equal to 1 continue
    System.out.println ("You begin to dismantle the tables.");
    // System.out.printlns "You begin to dismantle the tables"
    
    // //sleeps the program for 2 seconds
    System.out.println ("As you dismantle one of the tables you find something wierd under it.");
    // System.out.printlns "As you dismantle one of the tables you find something wierd under it."
    //sleep(4);
    // //sleeps the program for 4 seconds
    System.out.println ("It is a secret passage...");
    // System.out.printlns "It is a secret passage..."
    
    ////sleeps the program for 2 seconds
    secretpassageentrance();
    // calls the function secretpassageentrance(); to continue to it
  }
  else if (choice == 2) {
  // else if the choice is equal to 2 continue
    System.out.println ("You dismantle all of the chairs in a quick matter.");
    // System.out.printlns "You dismantle all of the chairs in a quick matter."
    
    
    System.out.println ("Once you finish the chairs, you begin to dismantle all the tables.");
    // System.out.printlns "Once you finish the chairs, you begin to dismantle all the tables."
    //sleep(4);
    // //sleeps the program for 4 seconds
    System.out.println("Under one of the tables you find something rather wierd.");
    // System.out.printlns "Under one of the tables you find something rather wierd"
    
    ////sleeps the program for 3 seconds
    System.out.println("There is a secret passageway.");
    // System.out.printlns "There is a secret passageway."
    
    // //sleeps the program for 2 seconds
    secretpassageentrance();
    // calls the function secretpassageentrance(); to go to it
  }
  else {
  // if anything else is typed continue
    System.out.println ("I think you wrote the wrong number.");
    // System.out.printlns "I think you wrote the wrong number."
    System.out.println ("Try again");
    // System.out.printlns "Try again"
    
    // //sleeps the program for 2 seconds
    journeycontinue();
    // calls the function journeycontinue(); to go to it
  }
}    
public static void secretpassageentrance() {
// public static voidines the function secretpassageentrance
  System.out.println ("Do you want to enter this secret passage?");
  // System.out.printlns "Do you want to enter this secret passage?"
  
  // //sleeps the program for 2 seconds
  
  System.out.println("Enter 1 to go, or 2 to stay");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and asks System.out.printlns "Enter 1 to go, or 2 to stay"
  if (choice == 1) {
  // if the choice is equal to 1 continue
    System.out.println ("Ok here we go !");
    // System.out.printlns "Ok here we go !"
    
    // //sleeps the program for 2 seconds
    secretpassage();
    // calls the function secretpassage to go to it
  }
  else if (choice == 2) {
  // else if the user choice is equal to 2 continue
    knockknock();
    // calls the function knockknock(); to go to it
  }
  else {
  // if the user choice is something either than 1 or 2 continue
    System.out.println ("I think you have misread the question");
    // System.out.printlns "I think you have misread the question"
    System.out.println ("Try again.");
    // System.out.printlns "Try again"
    
    
    secretpassageentrance();
    // calls the function secretpassageenetrance to go to it
  }
}
public static void secretpassage() {
// public static voidines the variable secretpassage(); 
  System.out.println ("You enter the Secret passage");
  // System.out.printlns "You enter the Secret passage"
  
  
  System.out.println ("There are 3 doors ahead of you.");
  // System.out.printlns "There are 3 doors ahead of you."
  
  
  System.out.println ("Each are labeled Trap door. Do not Enter");
  // System.out.printlns "Each are labeled Trap door. Do not Enter"
  
  
  System.out.println("Do you want to Enter one of the doors or leave?");
  // System.out.printlns "Do you want to Enter one of the doors or leave?"
  
  
  
  System.out.println("Enter 1 for door 1, 2 for door 2, 3 for door 3, or 4 to leave.");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and System.out.printlns "Enter 1 for door 1, 2 for door 2, 3 for door 3, or 4 to leave."
  if (choice == 1) {
  // if the user choice is equal to 1 continue
    System.out.println ("You enter Trap door 1");
    // System.out.printlns "You enter Trap door 1"
    
    // //sleeps the program for 2 seconds
    System.out.println ("It is infact a trap.");
    // System.out.printlns "It is infact a trap."
    
    // //sleeps the program for 2 seconds
    System.out.println ("You die.");
    // System.out.printlns "You die."
    
    // //sleeps the program for 2 seconds
    secretpassage();
    // calls the function secretpassage(); to go to it
  }
  else if (choice == 2) {
  // else if the choice is equal to 2 continue
    System.out.println ("You enter Trap door 2");
    // System.out.printlns "You enter Trap door 2"
    
    // //sleeps the program for 2 seconds
    System.out.println ("It is infact a trap.");
    // System.out.printlns "It is infact a trap."
    
    // //sleeps the program for 2 seconds
    System.out.println ("You die.");
    // System.out.printlns "You die."
    
    // //sleeps the program for 2 seconds
    secretpassage();
    // calls the function secretpassage(); to go to it
  }
  else if (choice == 3) {
  // else if the choice is equal to 3 continue
    System.out.println ("You enter Trap door 3");
    // System.out.printlns "You enter Trap door 3"
    
    // //sleeps the program for 2 seconds
    System.out.println ("It is infact a trap.");
    // System.out.printlns "It is infact a trap."
    
    // //sleeps the program for 2 seconds
    System.out.println ("You die.");
    // System.out.printlns "You die"
    
    // //sleeps the program for 2 seconds
    secretpassage();
    // calls the function secret passage(); to go to it
  }
  else if (choice == 4) {
  // else if the user choice is equal to 4 continue
    System.out.println ("Are you sure you want to go back?");
    // System.out.printlns "Are you sure you want to go back?"
  }
  else {
     // if the user choice is something other than 1, 2, 3 or 4 continue
    	  System.out.println ("I think you have misread the question");
    	  // System.out.printlns "I think you have misread the question"
    	    
    	    
    	  System.out.println ("Try again");
    	  // System.out.printlns "Try again"
    	    
    	  // //sleeps the program for 2 seconds
    	  secretpassage();
    	  // calls the function secretpassage(); to go to it
    	  }  
    
    
  System.out.println("Enter 1 for Yes, or 2 to go back to secret passage.");input = new Scanner(System.in);choice = input.nextInt();
    // creates the variable choice and System.out.printlns "Enter 1 for Yes, or 2 to go back to secret passage."
  
    if (choice == 1) {
    // if the user choice is equal to 1 continue
      System.out.println ("Ok! Let's Go!");
      // System.out.printlns "Ok! Let's Go!"
      
      // //sleeps the program for 2 seconds
      knockknock();
      // calls the function knockknock(); to go to it
    }
    else if (choice == 2) {
    // else if the choice equals to 2 continue
      System.out.println ("Alright! Let's go back!");
      // System.out.printlns "Alright! Let's go back!"
      
      // //sleeps the program for 2 seconds
      secretpassage();
      // calls the function secretpassage(); to go to it
    }
    else {
    // if user choice is something other than 1 or 2 continue
      System.out.println ("I think you have misread the question");
      // System.out.printlns "I think you have misread the question"
      
      
      System.out.println ("Try again");
      // System.out.printlns "Try again"
      
      // //sleeps the program for 2 seconds
      secretpassage();
      // calls the function secretpassage(); to go to it
    }
  
}

public static void knockknock() {
// public static voidines the variable knockknock();  
  System.out.println ("You hear a knock coming from the door.");
  // System.out.printlns "You hear a knock coming from the door."
  
  
  System.out.println ("Do you want to open the door?");
  // System.out.printlns "Do you want to open the door?"
  //sleep(1);
  // //sleeps the program for 1 seconds
  
  System.out.println("Enter 1 to open the door, or 2 to keep it closed");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and System.out.printlns "Enter 1 to open the door, or 2 to keep it closed"
  if (choice == 1) {
  // if the choice is equal to 1 continue
    System.out.println ("You open the door....");
    // System.out.printlns "You open the door"
    //sleep(5);
    // //sleeps program for 5 seconds
    System.out.println ("To your surprise it's someone you know.");
    // System.out.printlns "To your surprise it's someone you know."
    
    
    System.out.println ("It's.");
    // System.out.printlns "It's."
    //sleep(1);
    // //sleeps the program for 1 second
    System.out.println ("It's.");
    // System.out.printlns "It's."
    //sleep(1);
    // //sleeps the program for 1 second.
    System.out.println ("It's Your family they live!");
    // System.out.printlns "It's Your family they live!"
    
    // //sleeps the program for 2 seconds
    Endgame();
    // calls the function Endgame(); to continue to it
  }
  else if (choice == 2) {
  // else if the choice is equal to 2 continue
    System.out.println ("The noise is getting louder.");
    // System.out.printlns "The noise is getting louder."
    
    // //sleeps the program for 2 seconds
    System.out.println ("You begin to hear whispers outside the door.");
    // System.out.printlns "You begin to hear whispers outside the door."
    
    
    System.out.println ("Someone outside says.");
    // System.out.printlns "Someone outside says."
    
    // //sleeps the program for 2 seconds
    System.out.println ("OPEN THE DOOR, OR WE WILL!");
    // System.out.printlns "OPEN THE DOOR, OR WE WILL!"
    
    
    System.out.println ("You're going to have to make a choice whether to open the door or not.");
    // System.out.printlns "You're going to have to make a choice whether to open the door or not."
    
    System.out.println("Enter 1 to open Door, Enter 2 to keep it closed.");input = new Scanner(System.in);choice = input.nextInt();
    // creates variable choice and System.out.printlns "Enter 1 to open Door, Enter 2 to keep it closed."
  }
    if (choice == 1) {
    // if the choice is equal to 1 continue
      System.out.println ("You aproach the door quickly");
      // System.out.printlns "You aproach the door quickly"
      
      // //sleeps the program for 2 seconds
      System.out.println ("You can still go back if you'd like?");
      // System.out.printlns "You can still go back if you'd like"
      
      // //sleeps the program for 2 seconds
      
      System.out.println("Enter 1 to turn handle, Enter 2 to not open.");input = new Scanner(System.in);choice = input.nextInt();
      // creates the variable choice and System.out.printlns "Enter 1 to turn handle, Enter 2 to not open"
    }
      if (choice == 1) {
      // if the user choice is equal to 1 continue
        System.out.println ("You slowly turn the handle.");
        // System.out.printlns "You slowly turn the handle."
        
        // //sleeps the program for 2 seconds
        System.out.println ("The door opens.");
        // System.out.printlns "The door opens."
        
        // //sleeps the program for 2 seconds
        System.out.println ("It's Your family.");
        // System.out.println ("It's Your family.");
        
        
        Endgame();
        // calls the function endgame(); to go to it
      }
      else if (choice == 2) {
      // else if the user choice is equal to 2 continue
        System.out.println("You step back and wait to see what happens.");
        // System.out.printlns "You step back and wait to see what happens."
        
        
        Bustdoor();
        // calls the function Bustdoor(); to go to it
      }
      else {
      // if the user choice is anything other than 1 or 2 continue
        System.out.println ("Invalid choice");
        // System.out.printlns "Invalid choice"
        
        
        System.out.println ("Try again");
        // pritns "Try again"
        
        // //sleeps the program for 2 seconds
        knockknock();
        // calls the function knock knock to go to it.
      }
   
}

public static void Bustdoor() {
// public static voidines the function Bustdoor();:
  System.out.println ("The door gets busted down.");
  // System.out.printlns "The door gets busted down."
  
  
  System.out.println ("It's your family.");
  // System.out.printlns "It's your family."
  
  
  Endgame();
  // call the function Endgame(); to go to it.
    
  
}

public static void gunroom() {
// public static voidines the variable gunroom();  
  System.out.println ("Ok, you don't have to continue if you dont want to.");
  // System.out.printlns "Ok, you don't have to continue if you dont want to."
  
  // //sleeps the program for 2 seconds
  System.out.println ("\n" +
  "1. Turn the handle and take the chance of the alarm going off?" +
  "2. Return to the kitchen?");
  //System.out.printlns
  // 1. Turn the handle and take the chance of the alarm going off?
  // 2. Return to the kitchen?
  
  System.out.println("Enter 1 to enter the room, Enter 2 to return to kitchen");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and System.out.printlns "Enter 1 to enter the room, Enter 2 to return to kitchen"

  if (choice == 1) {
  // if the user choice equals to 1 continue 
    System.out.println ("BEEP! BEEP! BEEP!");
    // System.out.printlns "BEEP! BEEP! BEEP!"
    
    
    System.out.println ("....Groan....");
    // System.out.printlns "....Groan...."
    
    
    gunroominside();
    // calls the function gunroominside(); to continue to it
  }
  else if (choice == 2) {
  // else if the choice is equal to 2 continue
    kitchen1();
    // calls the function kitchen1(); to go to it
  }
  else {
  // if the user choice is something other than 1 or 2 continue
    System.out.println ("I think you have misread the question");
    // System.out.printlns "I think you have misread the question"
    
    // //sleeps the program for 2 seconds
    System.out.println ("Try again");
    // System.out.printlns "Try again"
    //sleep(1);
    // //sleeps the program for 1 seconds
    gunroom();
    // calls the function gunroom(); to go to it
  }}

public static void gunroominside() {
// public static voidines gun room inside
  System.out.println ("Quickly! Grab a gun! THE ZOMBIES ARE COMING!");
  // System.out.printlns "Quickly! Grab a gun! THE ZOMBIES ARE COMING!"
  
  // //sleeps the program for 2 seconds
  System.out.println ("Your choice of guns are:\n" +
  "1: Pistol\n" +
  "2: Shotgun\n");
  //System.out.printlns '''Your choice of guns are:
  // 1: Pistol
  // 2: Shotgun
  
  System.out.println("Enter 1 for Pistol, Enter 2 for Shotgun");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choices and System.out.printlns "Enter 1 for Pistol, Enter 2 for Shotgun"
  if (choice == 1 && !BackPack.contains("Pistol")) {
  // if the user choice is equal to 1 and Pistol is not in BackPack continue
    if (!BackPack.contains("Pistol")) {
      // if "Pistol" is not in the variable BackPack continue
      System.out.println ("Good choice, flexible gun with lots of options!");
      //System.out.printlns "Good choice, flexible gun with lots of options!"
      BackPack.add("Pistol");
      System.out.println("Added pistol to your inventory");
      // Adds the String Pistol to The variable BackPack
    }}
    else if (choice == 1 && BackPack.contains("Pistol")) {
    	 // if "Pistol" is already in the variable Backpakc continue
        System.out.println ("You already have a Pistol you goof!");
        // System.out.printlns "You already have a Pistol you goof!"
    }
  else if (choice == 2 && !BackPack.contains("Shotgun")) {
  // else if the user choice is equal to 2 and Shotgun is not in BackPack continue
    if (!BackPack.contains("Shotgun")) {
      System.out.println ("Good choice, Easy kills with this bad boy!");
      // System.out.printlns "Good choice, Easy kills with this bad boy!"
      BackPack.add("Shotgun");
      System.out.println("Added shotgun to your inventory");
      // Adds the string "Shotgun" to the variable BackPack
    }
    else if (choice == 2 && BackPack.contains("Shotgun")) {
        // if the "Shotgun" string is in BackPack continue
        System.out.println ("You already have a shotgun you goof!");
        // System.out.printlns "You already have a Pistol you goof!"
  }}
  else {
  // if something else other than 1 or 2 is chosen continue
    System.out.println ("Wasn't in the choices sorry");
    // System.out.printlns "Wasn't in the choices sorry"
    
    ////sleeps the program for 3 seconds
    gunroominside();
    //calls the function gunroominside to go to it
    
  System.out.println ("5 zombies are incoming!");
  // System.out.printlns "5 zombies are incoming!"
  
  
  System.out.println ("Are you going to run? Or are you going to fight?");
  //System.out.printlns "Are you going to run? Or are you going to fight?"
  
  System.out.println("Enter 1 to Run, or Enter 2 to fight!");input = new Scanner(System.in);choice = input.nextInt();
  // makes the variable choice and System.out.printlns "Enter 1 to Run, or Enter 2 to fight!"
  if (choice == 2) {
  // if the user choice is 1 continue
    System.out.println ("PREPARE TO FIGHT!!");
    // System.out.printlns "PREPARE TO FIGHT!!"
    Fightnumber1();
    // calls the function Fightnumber1(); to go to it
  }
  else if (choice == 1) {
  // else if the choice is equal to 2 continue
    System.out.println ("You run right into the hoard of zombies and get caught.");
    // System.out.printlns "You run right into the hoard of zombies and get caught."
    
    ////sleeps the program for 3 seconds
    System.out.println ("You die sorry.");
    // System.out.printlns "You die sorry."
    
    
    gunroominside();
    // calls the function gunroominside(); to continue to it
  }
  else {
  // if anything else is written other than 1 or 2 continue
    System.out.println ("I don't think you understood the question.");
    // System.out.printlns  "I don't think you understood the question"
    
    
    System.out.println ("Try again");
    // System.out.printlns "Try again"
    
    // //sleeps the program for 2 seconds
    gunroominside();
    // calls the function gunroominside(); to go back to it
  }}}
public static void Fightnumber1() {
//public static voidines Fightnumber1 with no parameters
  System.out.println ("Intense music incoming!");
  // System.out.printlns "Intense music incoming!"
  
  
  System.out.println ("First zombie coming");
  // System.out.printlns "First zombie coming"
  
  // //sleeps the program for 2 seconds
  System.out.println("Enter 1 to shoot in the head or 2 in the chest");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and asks the user "Enter 1 to shoot in the head"
  if (choice == 1) {
  // if the choice is equal to 1 continue
    System.out.println ("You shoot the zombies in the head");
    // System.out.printlns "You shoot the zombies in the head"
    
    
    System.out.println ("They all die");
    // System.out.printlns "They all die"
    
    // //sleeps the program for 2 seconds
    System.out.println ("Congratulations");
    // System.out.printlns Congratulations
}}
public static void Endgame() {
// public static voidines function Endgame();
  System.out.println ("Congratulations!");
  // System.out.printlns "Congratulations!"
  
  // //sleeps the program for 2 seconds
  System.out.println ("You have succesfully found your family!");
  // System.out.printlns "You have succesfully found your family!"
  
  ////sleeps the program for 3 seconds
  System.out.println ("And without dying too!");
  // System.out.printlns "And without dying too!"
  
  // //sleeps the program for 2 seconds
  System.out.println ("I hope....");
  // System.out.printlns "I hope...."
  
  // //sleeps the program for 2 seconds
  System.out.println ("Would you like to play again or End?");
  // System.out.printlns "Would you like to play again or End?"
  

  
  System.out.println("Enter 1 to play again or 2 to End.");Scanner input = new Scanner(System.in);int choice = input.nextInt();
  // creates the variable choice and System.out.printlns "Enter 1 to play again or 2 to End."
  if (choice == 1) {
  // if the user choice is equal to 1 continue
    System.out.println ("Good Luck!");
    // System.out.printlns "Good Luck!"
    
    // //sleeps the program for 2 seconds
    YourRoom();
    // calls the function YourRoom(); to go to it
  }
  else if (choice == 2) {
  // else if the user choice is equal to 2 continue
    System.out.println ("Ok that's Fine!");
    // System.out.printlns "Ok that's Fine!"
    
    // //sleeps the program for 2 seconds
    System.out.println ("Just press the Stop◻️ button at the top");
    // System.out.printlns "Just press the Stop◻️ button at the top"
  }
  else {
  // if user choice is anything other than 1 or 2 continue
    System.out.println ("Come on it's the end of the game.");
    // System.out.printlns "Come on it's the end of the game."
    
    // //sleeps the program for 2 seconds
    System.out.println ("And you still don't understand enter 1 or 2. Jeeze.");
    // System.out.printlns "And you still don't understand enter 1 or 2. Jeeze."
    
    
    Endgame();
    // calls the function Endgame(); to go to it.
  }}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	


System.out.println ("This game will be based on your choices.");
//System.out.printlns "This game will be based on your choices."
System.out.println ("Choose Wisely.");
//System.out.printlns "Choose Wisely."
YourRoom();
// calls the function YourRoom(); which untimately starts the whole game

	}

}//end
