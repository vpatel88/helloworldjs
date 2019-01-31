//IT 313
//Project2b Vidhi Patel
//10/1/2018
import java.util.Calendar;  
import java.util.Scanner; 

public class DayOfWeek {
	
	//this method will take in three parameters and returning day of the week
	public static String dayOfWeek(int month,int day,int year) {
		
		String []days= {"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		// creating instance of calender class
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1, day);  //setting the month year day
		
		// setting the date using user values
		int weekDay=calendar.get(Calendar.DAY_OF_WEEK); // getting the format of day
		return days[weekDay];  //returning the name of week from string days

}
	public static void main(String[] args) {
		
		int day,month,year;
		
		Scanner p =new Scanner(System.in);	//scanner to get user input
		
		while(true) {
			
			System.out.print("Enter month: ");  //taking the month from user
			month = p.nextInt(); 
			
			System.out.print("Enter day: ");		//taking day from user
			day = p.nextInt(); 
			
			System.out.print("Enter year: ");		//taking the year YYYY
			year = p.nextInt(); 
			
			//calling the method day of week to get the day of the week in return and printing it
			System.out.println("Day of the week is "+ dayOfWeek(month, day, year));

		}



	}

}
