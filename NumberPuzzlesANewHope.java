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
public class NumberPuzzlesANewHope
{
    public static void main(String[] arg)
    {
     for(int i =0;i<=99;i++)
        {
            for(int y=0;y<=99;y++)
            {
                for(int q=0;q<99;q++)
                {
                for(int t=0;t<=99;t++)
            {
               
             
               
               if(i+2==y-2&&y-2==q*2&&q*2==y/2&& i+y+q+t==45 )
               {
                   System.out.printf("%d,%d,%d,%d%n",i,q,y,t);
               }
            }
                }
            }
        }
    }
}
