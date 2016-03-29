/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10528808;

/**
 *
 * @author Mawutor
 */
import java.util.Scanner;

public class weekday
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on ");
                System.out.println(weekday(mm,dd,yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";
                    total=yyyy-1900;
                    total=total/4;
                    total=total+1900;
                    total=total+dd;
                    total=total+month_offset(mm);
                    if(is_leap(yyyy)==true && mm==1 || mm==2);
                    {
                        total--;
                    }
                    int rem= total%7;
		// bunch of calculations go here

		date = weekday_day(rem)+month_name(mm) + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
        public static String weekday_day( int month )
	{
		String result;
                if(month==2)
                {
                    result="Monday";
                    return result;
                }
                else if(month==3)
                {
                     result="Tuesday";
                     return result;
                }
                else if(month==4)
                {
                    result="Wednesday";
                     return result;
                }
                else if(month==5)
                {
                     result="Thursday";
                     return result;
                }
                else if(month==6)
                {
                     result="Friday";
                     return result;
                }
                else if(month==7)
                {
                     result="Saturday";
                     return result;
                }
                else if(month==1)
                {
                   result="Sunday";
                    return result;
                }
                else
                {
                    result="error";
                    return result;
                }
        }
        
        public static String month_name( int month )
	{
		String result;
                if(month==1)
                {
                    result="JANUARY";
                    return result;
                }
                else if(month==2)
                {
                     result="Febuary";
                     return result;
                }
                else if(month==3)
                {
                    result="March";
                     return result;
                }
                else if(month==4)
                {
                     result="April";
                     return result;
                }
                else if(month==5)
                {
                     result="May";
                     return result;
                }
                else if(month==6)
                {
                     result="June";
                     return result;
                }
                else if(month==7)
                {
                   result="July";
                    return result;
                }
                else if(month==8)
                {
                    result="August";
                    return result;
                }
		else if(month==9)
                {
                   result="September";
                   return result;
                }
                else if(month==10)
                {
                    result="October";
                    return result;
                }
                else if(month==11)
                {
                     result="November";
                     return result;
                }
                else if(month==12)
                {
                    result="December";
                    return result;
                }
                else
                {
                     result="Error";
                     return result;
                }
        }
		public static int month_offset( int month )
	{
		int result;
		if(month==1)
                {
                    result =1;
                    return result;
                }
                else if(month==2)
                {
                     result =4;
                     return result;
                }
                else if(month==3)
                {
                     result =4;
                     return result;
                }
                else if(month==4)
                {
                     result =0;
                     return result;
                }
                else if(month==5)
                {
                     result =2;
                     return result;
                }
                else if(month==6)
                {
                     result =5;
                     return result;
                }
                else if(month==7)
                {
                    result =2;
                    return result;
                }
                else if(month==8)
                {
                    result =3;
                    return result;
                }
		else if(month==9)
                {
                   result =6;
                   return result;
                }
                else if(month==10)
                {
                    result=1;
                    return result;
                }
                else if(month==11)
                {
                     result =4;
                     return result;
                }
                else if(month==12)
                {
                    result =6;
                    return result;
                }
                else
                {
                     result =-1;
                     return result;
                }
                
		
	}
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
