/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.animals;

/**
 *
 * @author DALL
 */

public class Animals {
// feilds 
    String name;
    int age;
    //constructor
    public Animals(String name, int age){
        this.name =name;
        this.age =age;
    }
    //method
    public void makeSound(int times){
       
        System.out.println("the sound made by the animal");
       
     }
    
    
    // overloaded eat
    public void eat( String Foodtype){
        System.out.println("The Animal eat" +Foodtype);
      
    } 
    public int getAge(){
        return age;
    }
}

