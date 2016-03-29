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
public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{
		for ( int thous=0; thous<10; thous++ )
		{
			for ( int hund=0; hund<10; hund++ )
			{
				for ( int tens=0; tens<10; tens++ )
				{
					for ( int ones=0; ones<10; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(10);
					}
				}
			}
		}

		System.out.println();
	}
}

