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
public class EvennessFunction
{
    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isDivisible(int n)
    {
        if(n%3==0)
        {
            return true;
            
        }
        else 
        {
            return false;
        }
    }
        public static void main(String[]arg)
        {
            Scanner input = new Scanner(System.in);
            for(int i=1;i<=20;i++)
            {
                System.out.println(i);
                if(isEven(i)==true)
                {
                    System.out.println(i+"<");
                }
                 else if(isDivisible(1)==true)
                {
                    System.out.println(i+"=");
                }
                else if(isDivisible(i)==true && isEven(i)==true);
                {
                    System.out.println(i+"<=");
                }
               
                
                    System.out.println(i);
                
               
            }
        }
    }

