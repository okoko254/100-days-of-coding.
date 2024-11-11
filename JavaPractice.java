/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;

/**
 *
 * @author Ruth
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //square
         for(int c=1;c<=5;c++)
        {
            for(int d=1;d<=5;d++) 
            {
         System.out.print("*");
        
        }
   
      System.out.println();
      
}
         //half pyramid
         for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++) 
            {
         System.out.print("*");
        
        }
   
      System.out.println();
}
         //inverted half pyramid
      for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++) 
            {
         System.out.print("*");
        
        }
   
      System.out.println();
}
      
      
      
    for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) 
            {
         System.out.print("*");
        
        }
   
      System.out.println();
}
  for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) 
            {
         System.out.print("*");
        
        }
   
      System.out.println();
}  
    
           
        
    }
    
}
