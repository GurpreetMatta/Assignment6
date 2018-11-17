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
public class Program1 {
    public static void main(String []args)
    {
        String str;
        System.out.println("Enter String :");
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        int i;
        String strrev="";
        for(i=str.length()-1;i>=0;i--)
        {
            strrev=strrev+str.charAt(i);
        }
        System.out.println(strrev);
    }
}
