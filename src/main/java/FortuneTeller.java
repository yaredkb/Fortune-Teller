import java.io.PrintStream;
import java.rmi.server.UID;
import java.util.Scanner;

import javax.swing.colorchooser.ColorSelectionModel;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner console = new Scanner(System.in);
		System.out.println("FortuneTeller");
		System.out.println("by Yared Bokru");
		
		System.out.print("What is Your first name ?: ");
		  String firstName = console.nextLine();
		  if (firstName.length() > 0) {
		  }
		  String fName = firstName;
		  
		System.out.print("What is Your last name ?: ");
		 String lastName = console.nextLine();
		  
			if (lastName.length()>0);{
			}
		  	String lName =lastName;
			
			 System.out.print("How old are you?: ");
			 int age = console.nextInt();
			 int inputAge =0 + age;
		System.out.println("In what month were you born?:");
		 Scanner console1 = new Scanner(System.in);
		 System.out.println("__/DD/YYYY");
		 	String bornmIn = console1.nextLine();
			String month=bornmIn.substring(0);
			
			int m= Integer.parseInt(month);
			switch (m) {
				case 1 : month = "January"; 
				break;
				case 2 :month = "February";
				break;
				case 3 :month = "March";
				break;
				case 4 :month = "Aprill";
				break;
				case 5 :month = "May";
				break;
				case 6 :month = "June";
				break;
				case 7 :month = "July";
				break;
				case 8 :month = "August";
				break;
				case 9 :month = "September";
				break;
				case 10 :month = "October";
				break;
				case 11 :month = "November";
				break;
				case 12 :month = "December";
				break;
				default:
					System.out.println("invalid month number");
					break;
			
				}
			System.out.println(month);
			
			
			System.out.println(
					"Which of the ROYGBIV colors is your favorite?: if you don't know what ROYGBIV is Enter 'help' ");
			String question = console1.nextLine();
			boolean help = question.equals("help");
			if (help = help)
			{
				System.out.println("RED, ORANGE, YELLOW,GREEN, BLUE,INDIGO,VIOLET");
				System.out.print("Which of the ROYGBIV colors is your favorite?:");
				String colors = console1.nextLine();
			}
			if(help != help)
			{
			    System.out.print("Which of the ROYGBIV colors is your favorite?:");
			    String colors = console1.nextLine();
			    if (colors.length()>0 ){
			    	}
			    String fevCar =colors;
		   // System.out.println(fevCar);
			}
			String colors = console1.nextLine();
			String fevCar = colors;
				if (colors == "red")
				{
				  fevCar = "BMW";	
				}
				else if (fevCar == "blue"){
					fevCar = "ferarry";
				}
				System.out.println(  fevCar + ""  );
				
				Scanner input = new Scanner(System.in);
			System.out.println( "Number of siblings:   ");
			int userinput = input.nextInt(); 
			 
			//int userinput = 5;
			String sibling;
					 
			if (userinput == 1)
			{
				sibling ="Iceland, Vilaland & Catanya";
			}
			else if (userinput == 2)
			{
				sibling =" Iceland & Vilaland";
			}
			else if (userinput >=3)
			{
				sibling =" Iceland ";
			}
			else 
			  {
				sibling = "  ";
			  }
				// System.out.println("sorry");
			
			
		
	if(age %2==0)//even number divid by 2 returns o reminder
		System.out.println(fName + " " +lName +" "  +" will retire in 25 years with " + ",a vacation home in" + " "  + sibling +" "+ fevCar+ " " +inputAge);
	else  //else its odd
		System.out.println(fName + " "+ lName + " " +" will retire in 20 years with " + ",a vacation home in" + " "  + sibling + "" + fevCar+ ""+inputAge);
	
		 
	Scanner	in = new Scanner(System.in);
		String line;
		System.out.println("You want to continue Enter 'yes' or 'no'");
		Boolean exit = null;
		    do{
		    	line= in.nextLine();
		    	switch (line)
		    	{
			case "yes": exit = false;
				break;
			case "no": exit = true;
			break;
			default:
				System.out.println("Plese enter yes or no");
				break;
			    }     
		    }
			while (exit== null);
				System.out.println(exit ? "Thank you. Googbye":" Lets go");
		 
		  }
		 
	}
	

	
