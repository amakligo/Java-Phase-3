package assignment_10528808;





import static assignment_10528808.weekday.is_leap;
import static assignment_10528808.weekday.month_name;
import static assignment_10528808.weekday.month_offset;
import static assignment_10528808.weekday.weekday_day;
import java.util.Scanner;

public class CallingFunctionsFromOtherFiles
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
}
