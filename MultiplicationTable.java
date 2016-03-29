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
public class MultiplicationTable 
{
    
    public static void  main(String[] arg)
    {
        for(int i =1;i<=12;i++)
        {
            
            System.out.printf(" %n");
            for(int y=1;y<=9;y++)
            {
               
                int t=i*y;
                System.out.print(t+"  ");
            }
        }
    }
}
