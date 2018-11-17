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
public class Program6 {
   public static void main(String []args )
   {
       String str;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Strng :");
       str=s.nextLine();
       int len=str.length();
       int count=0;
       for(int i=0;i<len;i++)
       {
           if(str.charAt(i)==' ')
           {
               count++;
           }
           else
           {
               
           }
       }
       System.out.println(count+1);
   }
}
