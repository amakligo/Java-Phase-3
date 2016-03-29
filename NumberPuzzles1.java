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
public class NumberPuzzles1 
{
    
    public static void  main(String[] arg)
    {
        for(int i =0;i<=1000000;i++)
        {
            for(int y=0;y<=1000000;y++)
            {
                if(i+y==60 && i-y==14 ||i-y==-14){
                System.out.println("("+i+","+y+")");
                }
            }
        }
    }
    
}
