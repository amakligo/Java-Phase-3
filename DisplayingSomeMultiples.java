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
public class DisplayingSomeMultiples
{
    public static void main(String[] arg)
    {
        
    Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        for(int i=1;i<=12;i++)
        {
           int v = i*n;
            System.out.printf("%d*%d=%d %n",n,i,v);
        }
    }
}
