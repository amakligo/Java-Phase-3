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
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class EasyCalc 
{
    
    public static double addition(double x,double y)
    {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        x=input.nextInt();
        y=input.nextInt();
        double total=x+y;
        System.out.printf("The result is %d",total);
        return total;
    }
    public static double subtraction(double x, int y)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  numbers you want toi subtact from first, then the second");
        y=input.nextInt();
        x=input.nextInt();
       double result=y-x;
        System.out.printf("The result is %d",result);
        return result;
        
    }
    public static double division(int x,int y)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the  numbers you want to divide from first, then the divisor");
       x=input.nextInt();
       y=input.nextInt();
       double result=x/y;
       System.out.printf("The result is %d",result);
       return result;
    }
    public static double multiplication(double b,double h)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        b=input.nextInt();
        h=input.nextInt();
        double result=h*b;
        System.out.printf("The result is %d",result);
        return result;
    }
    
    public static int modulo(int y,int x)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the  modulo then number ");
        y=input.nextInt();
        x=input.nextInt();
        int result=x%y;
         System.out.printf("Modulo %d of %d is %d",y,x,result);
         return result;
        
    }
    
    public static int perfectNumbers(int n)
    {
      Scanner input = new Scanner (System.in);
        System.out.println("Enter the number "); 
         n=input.nextInt();
         int arr[]= new int[n];
          int sum = 0;
        for(int i=1;i<n;i++)
        {
            
            int s=n%i;
              
            if(s==0)
            {
                sum+=i;
            } 
        }
             if(sum>n)
                {
                    System.out.println("Its an abunadnt number");
                }
                else if(sum<n)
                {
                     System.out.println("Its a deficient number");
                }
                else if(sum==n)
                {
                    System.out.println("Its a perfect number");
                }
            
        
        
        return n;
    }
    
    public static void variance(double mean,double n)
    {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter the total mean devaiton then the number of elements ");
       mean=input.nextDouble();
       n=input.nextDouble();
       System.out.println("1)Population  or 2)Sample ");
       int ans=input.nextInt();
       if(ans==1)
       {
           double v=(mean*mean)/n;
            System.out.printf("result  is",v);
       }
       else if(ans==2)
       {
           double v=(mean*mean)/n-1; 
           System.out.printf("result  is",v);
       }
       
    }
    
    public static void StandardDeviation(double mean,double n)
    {
        Scanner input = new Scanner (System.in);
       System.out.println("Enter the total mean devaiton then the number of elements ");
       mean=input.nextDouble();
       n=input.nextDouble();
       System.out.println("1)Population  or 2)Sample ");
       int ans=input.nextInt();
       if(ans==1)
       {
           double v=(mean*mean)/n;
           v= Math.sqrt(v);
            System.out.printf("result  is",v);
       }
       else if(ans==2)
       {
           double v=(mean*mean)/n-1; 
           v= Math.sqrt(v);
           System.out.printf("result  is",v);
       }
       
     }
    
    public static void TimeComplexity()
    {
        Scanner input = new Scanner (System.in);
        System.out.printf("1)Bubble Sort Algorithm%n2)Insertion Sort Algorithm%n3)Selection Sort algorithm4)Custom Algorithm");
        int f=input.nextInt();
        if(f==4)
        {
       System.out.println("How many loops do you have in youe algorithm");
       int opt=input.nextInt();
       System.out.println("How many outputs,inputlines and variable declations and assignments do you have inyou algorithm");
       int opt2=input.nextInt();
       System.out.println("How many nested loops do you have in your algorithm?");
       int opt3=input.nextInt();
       if(opt>=1 && opt2==0 && opt3==0)
       {
        System.out.printf("The algorithm increases linearly with the problem "); 
       }
       else if(opt2>=1 && opt>=1 && opt3>=0)
       {
        System.out.printf("The algorithm increases contantly with the problem ");
       }
       else if(opt3>=1 && opt>=1 && opt3>=1)
       {
          System.out.printf("The algorithm increases quadratically with the problem "); 
       }
        }
        else if(f==3)
        {
          System.out.println("Selection Sort increses quadraticlly with the problem");  
        }
        else if(f==2)
        {
            System.out.println("Insertion Sort increses quadraticlly with the problem");
        }
        else if(f==1)
        {
            System.out.println("Bubble Sort increses quadraticlly with the problem");
        }
    }
        
    
                    

    
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        System.out.printf("Which shape%n 1)Addition%n2)Substraction%n3)Division%n4)Time complexity%n5)Standard Deviation%n6)Variance%n7)Perfect Numbers%n8)Modulo%n9)Quit%n>");
            int n=input.nextInt();
        if(n==1)
        {
          addition(0,0);  
        }
        else if(n==2)
        {
          subtraction(0,0);  
        }
        else if(n==3)
        {
          division(0,0);  
        }
         else if(n==4)
        {
          TimeComplexity();  
        }
         else if(n==5)
         { 
           StandardDeviation(0,0);
         }
         else if(n==6)
         {
             variance(0,0);
         }
         else if(n==7)
                 {
                 perfectNumbers(0);
                 }
         else if(n==8)
         {
             modulo(0,0);
         }
         else 
         {
             System.out.println("Thanks for using EasyCalc");
         }
                 
    }}