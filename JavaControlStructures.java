/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniassignment1;

/**
 *
 * @author Ruth
 */
public class MiniAssignment1 {

    
  
     
    public static void main(String[] args) {
        // TODO code application logic here
        int i=-10;
        if(i<0){
          
        System.out.println("negative");
    }else{
    System.out.println("positive");
}
        System.out.println(10+10);
        System.out.println(30*8);
        System.out.println(10*5);
        
        double area,l,b;
        l=10;
        b=5;
        area=0.5*l*b;
        System.out.println(area);
        
       //else...if statement 
       int myAge=17;
       int votingAge=18;
       if(myAge<votingAge){
           System.out.println("you cannot vote");
       }
       else{
           System.out.println("you can vote");
       }
       //else if statement
       int myAmount=130;
       int productPrice=120;
       if(myAmount<productPrice){
           System.out.println("you cannot have this product");
       }else if(myAmount>productPrice){
           System.out.println("you can have this product as well as the balance");
       }else{
           System.out.println("you can have this product");

       }
       //switch statement
       int day=6;
       switch(day){
           case 1:System.out.println("monday");
           break;
           case 2:System.out.println("tuesday");
           break;
           case 3:System.out.println("wednesday");
           break;
           case 4:System.out.println("thursday");
           break;
           case 5:System.out.println("friday");
           break;
           default:System.out.println("it is a weekend");
           
           
          
           
       }
       //short hand if...else(ternary operator)
       //String  can be replaced by var
       int time=4;
       
        var result=(time<12)?"good day":"good evening";
       System.out.println(result);
       
       //while loop
       //as long as the condition is true the loop will be executed
       //the condition is tested before the statement is executed
       int j=0;
       while(j<=5)
       {
            System.out.println(j);
            j++;
       }
       
       //do while loop
       //here the loop is executed at least once before the condition is tested
       //so the loop will execute once even if the condition is false 
       int a=5;
       do{
           System.out.println(a);
            a--;
       }while(a>=0);

       //for statement
       for(i=0;i<=10;i=i+2){
           System.out.println(i);
       }
       
       
    
         
       
       
       
    
       
        
        
}
    
}
    
