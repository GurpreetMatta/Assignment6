/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author Gurpreet Singh
 */
public class Program4 {
    
    public static void main(String []args )
    {   char ch='a';
        int i,j;
        for(i=3;i>=0;i--)
        {
            for(j=i;j<3;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch='a';
            System.out.println();
        }
    }
}
