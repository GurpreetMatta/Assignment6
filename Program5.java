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
public class Program5 {
    boolean checkString()
    {
        return false;
        
    }
    public static void main(String args[])
    {
        String str1,str2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String to check the occurance of string into other string");
        str1=s.next();
        System.out.println("Enter String in which you want to check string ");
        str2=s.next();
        int counter=0;
        for(int i=0;i<str2.length();i++)
        {
            if(str2.charAt(i)==str1.charAt(counter))
            {
                counter++;
            }
            else
            {
                counter=0;
            }
        }
       if(counter ==str1.length())
       {
           System.out.println("string occur");
       }
       else 
       {
  
           System.out.println("string not occur");     }
       
    }
}
