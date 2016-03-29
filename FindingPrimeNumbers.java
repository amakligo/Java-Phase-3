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
public class FindingPrimeNumbers 
{
 public static boolean isPrime(int n) 
 {
     if(n%2!=0 && n!=9 && n!= 15 && n!=18)
     {
         return true;
     }
     else 
     {
         return false;
     }
 }
 
 public static void main(String[] arg)
 {
     for(int i=1;i<=20;i++)
     {
         if(isPrime(i)==true)
         {
             System.out.println(i+"<");
         }
         else
         {
             System.out.println(i);
         }
             }
 }
}
