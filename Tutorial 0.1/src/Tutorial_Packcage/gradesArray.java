package Tutorial_Packcage;
import java.util.Scanner;

public class gradesArray {

	public static void main(String[] args) {

		String[] students = {"Steve","Chris","Scott","Trent","Ridge","Tyson"}; //student array
		String[] gradeNum = {"12","12","10","11","11","10"}; // grade array
		int[] exam1 = {68,90,44,56,84,43}; // exam one array 
		int[] exam2 = {70,78,67,80,67,92}; //exam two array
		int[] exam3 = {89,85,49,45,78,83}; //exam three array
		int averageGrade = 0; //variable to store average grade
		
		System.out.println("Student: " + students[0]); //this prints the name, grade, and three exams
		System.out.println("Grade: " + gradeNum[0]);
		System.out.println("Exam 1: " + exam1[0]);
		System.out.println("Exam 2: " + exam2[0]);
		System.out.println("Exam 3: " + exam3[0]);
		
		System.out.println(""); //prints space to make it look cleaner
		
		System.out.println("Student: " + students[students.length - 1]); //this prints name,grade, and three exams for last person in list
		System.out.println("Grade: " + gradeNum[gradeNum.length - 1]);
		System.out.println("Exam 1: " + exam1[exam1.length - 1]);
		System.out.println("Exam 2: " + exam2[exam2.length - 1]);
		System.out.println("Exam 3: " + exam3[exam3.length -1]);
		
		System.out.println(""); //prints space to make it look cleaner

		
		for(int i = 0; i < students.length; i++) {//for loop to go through students array list
			System.out.println(students[i] + "\tGrade: " + gradeNum[i] + "\tExam marks: " + exam1[i] + "\t" + exam2[i] + "\t" + exam3[i]);//prints out name,grade,exams for each person on one line
		}//end for loop
		
		System.out.println(""); //prints space to make it look cleaner

		for(int i = 0; i < students.length; i++) {//for loop to go through students array list
			
			System.out.println((i + 1) + ":" + students[i] + "\tGrade: " + gradeNum[i] + "\tExam marks: " + exam1[i] + "\t" + exam2[i] + "\t" + exam3[i]);//prints out number,name,grade,exams for each person on one line
		}//end for loop
		
		System.out.println(""); //prints space to make it look cleaner
		
		for(int i = 0; i < students.length; i++) {//for loop to go through students array list
			averageGrade = (exam1[i] + exam2[i] + exam3[i]) / 3; // adds all exams and divides by 3 to get total average
		System.out.println("The average of " + students[i] + " is " + averageGrade); //prints out message
		}//end average grade for loop
		
		System.out.println(""); //prints space to make it look cleaner

		for(int i = 0; i < students.length; i++) {//for loop to go through students array list
		if (exam3[i] > 79) {
		System.out.println( students[i] + " got greater than 79% on there 3rd exam.");
		students[i] = "";
		exam3[i] = 0;
			}//end if 
		}//end for 
		
		for(int i = 0; i < students.length; i++) {//for loop to go through students array list
			if (exam1[i] < 50) {
				exam1[i] = 40;
			System.out.println(students[i] + "\tExam marks: " + exam1[i] + "\t" + exam2[i] + "\t" + exam3[i]);

				}//end if 
		}//end for

	}

}
