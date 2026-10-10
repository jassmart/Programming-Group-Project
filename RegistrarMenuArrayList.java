/**
 * File: MenuExample.java
 * Description: Practice creating an interactive menu with decision and looping logic structures
 * @author: Awny Alnusair
 * @version 1.0
 */

import java.util.Scanner;
import java.util.ArrayList;

public class RegistrarMenuArrayList
{
	static ArrayList<String> courseList = new ArrayList<String>();

	public static void main(String[] args)
	{
			Scanner input = new Scanner( System.in );
			boolean finished = false;
			int userChoice;

			while (finished == false)
			{
				// Menu Display
				System.out.println("");
				System.out.println("Registrar Menu");
				System.out.println("====================");
				System.out.println(" 1.  Create a new course");
				System.out.println(" 2.  Remove a course from the list");
				System.out.println(" 3.  Number of Computing courses in the list");
				System.out.println(" 4.  Display the current courses in the list");
				System.out.println(" 5.  Exit");
				System.out.println("");

				// Get the input from the user
				System.out.print("Please input your choice (1-5): ");
				userChoice = input.nextInt();
				input.nextLine();
				// switch to correspondence function
				switch (userChoice)
				{
					case 1:
						createCourse();break;
					case 2:
						removeCourse();break;
					case 3:
						numComputeCourse();break;
					case 4:
						displayCourses();break;
					case 5:
						finished = true; break;
					default:
						System.out.println("Invalid Input!\n");break;
				} // end switch

			} // end while
		input.close();
	}//end of main method

	public static void createCourse() {
		Scanner input = new Scanner( System.in );
		System.out.print("Please enter the title of the course: ");
		String course = input.nextLine();
		//toUpperCase being put between string course and cousre=course allows it to change the input before it is stored
		course = course.toUpperCase();
		//the if else statement here checks the course list for duplicates and will display the proper message depending on what is saved.
		if (courseList.contains(course)) {
			System.out.println("This course has already been added." );
		} else {
			courseList.add(course);
			System.out.println("The course has been added." );
		}
		
	} //end of create course

	public static void removeCourse() {
		Scanner input = new Scanner( System.in );
		System.out.print("Please enter the title of the course that you wish to remove: ");
		String course = input.nextLine();
		course = course.toUpperCase();
		//Similar if else statement is used for the removal of the course
		if (courseList.contains(course)) {
			courseList.remove(course);
			System.out.print("The course was successfully removed from the list! ");
		}
		else 
			System.out.print("The course was not successfully removed from the list. ");
		
	} //end of remove course

	public static void numComputeCourse() {
		//int counter set to 0 and used with a simple for loop adds all the comp course, but when  you run it again, it won't add the sum from the first count.
		int count = 0;
		for (String course : courseList) {
			if (course.startsWith("COMP")) {
				count++;
			}
		}

		System.out.println("You have " + count + " COMP courses currently.");
		
	} //end of number of computing courses

	public static void displayCourses() {
		for (String crs : courseList) {
			System.out.println(crs);
		}

	} //end of display course
}





