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
public class KeyChainsForSale
{
    Scanner input=new Scanner(System.in);
    public static void add_keychains()
            {
                Scanner input =new Scanner(System.in);
               int item;
                System.out.println("ADD KEYCHAINS");
              
                System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item = input.nextInt();
                 if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
            }
    public static void remove_keycahin()
    {
        Scanner input =new Scanner(System.in);
       int item;
        System.out.println("    ");
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item = input.nextInt();  
                 if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
    }
    public static void view_cart()
    {
         Scanner input =new Scanner(System.in);
        int item;
        System.out.println("VIEW CART");
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item = input.nextInt(); 
                 if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
    }
    public static void checkout()
    {
        System.out.println("CHECKOUT");
    }
    
    public static void main(String[] arg)
    {
        System.out.println("THE C3NTYN3NTC3NTYN3L's SHOPPINGMALL");
          Scanner input =new Scanner(System.in);
        int item;
        
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item = input.nextInt();    
               if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
        
      
    }
}   
