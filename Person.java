/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatutor;

/**
 *
 * @author Ruth
 */
public class Person {
     public String name;//unrestricted data
     private int age;//restricted data
    
    //getter
    public String getName(){
    return name; 
}
    //setter
    public void setName(String newName){
        this.name=newName;
        
    }
    
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
       return age; 
    }
    
    public static void main(String[] args) {
        //when access modifier is public
        Person myObj=new Person();
        myObj.name="Lenny";
        System.out.print(myObj.name);
        
        //when access modifier is private
        myObj.setAge(20);
        System.out.print(" is "+myObj.getAge()+"years old");
        
        
    }
}
