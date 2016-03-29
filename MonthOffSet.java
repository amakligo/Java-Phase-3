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
public class MonthOffSet
{
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


	public static void main( String[] args )
	{
		System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println( "Offset for month 43: " + month_offset(43) );
	}


}
