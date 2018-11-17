/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author Gurpreet Singh
 */
public class Program2 {
 public static void main(String []args)
 {
     String str, sub;
      int i, j, length;
         
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string :");
      str  = sc.nextLine();
     
      length = str.length();  
 
      System.out.println("Substrings  are:");
     
      for (j = 0; j < length; j++)
      {
         for(i = 1; i <= length - j; i++)
         {
            sub = str.substring(j, j+i);
            System.out.println(sub);
         }
        
     }
     
 }
}
