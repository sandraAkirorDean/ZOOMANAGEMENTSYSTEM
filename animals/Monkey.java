/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.animals;

/**
 *
 * @author DALL
 */
public class Monkey extends Animals {
    
    public Monkey(String name, int age) {
        super(name, age);
        System.out.println("Monkey" );
    }
    
     //Override makeSound() method
  @Override 
public void makeSound(int times){
            for (int i =0; i < times; i++){
		System.out.println("Chatter");
            }
	}

// Override eat() method
	@Override
	public void eat( String Foodtype){
		System.out.println("Eats " + Foodtype);
	}

}
