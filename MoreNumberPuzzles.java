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
public class MoreNumberPuzzles 
{
    public static void function56()
    {
         for(int i =0;i<=9;i++)
        {
            for(int y=0;y<=9;y++)
            {
                int v=i+y;
                if(i<=5 && y<=6 && v>10){
                System.out.println("("+i+y+")");
                
                }
            }
        } 
    }
         public static void reversefunc()
         {
             for(int i =0;i<=9;i++)
        {
            for(int y=0;y<=9;y++)
            {
                int v=i-y;
                int t=y-i;
                int f=y+i;
                if(f==f && t==f){
                System.out.println("("+i+y+")");
                
                }
            }
        } 
         }
    
    public static void  main(String[] arg)
    {
        int t=0;
    
        while(t==0)
        {
            Scanner input =new Scanner(System.in);
        
      System.out.println("1)Find two digit numbers <= 56 with sums of digits > 10");
      System.out.println("2)Find two digit number minus number reversed which equals sum of digits");
      System.out.println("3)Quit");
      int n=input.nextInt();
      if(n==1)
      {
          function56();
      }
      else if(n==2)
      {
          reversefunc();
      }
      else if(n==3)
      {
        break;  
      }
    }
    
}
}
