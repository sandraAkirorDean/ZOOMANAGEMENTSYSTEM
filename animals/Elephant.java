/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.animals;

import vu.animals.Animals;

public class Elephant extends Animals {
    
    public Elephant(String name, int age) {
        super(name, age);
        System.out.println("Elephant");
    }
    
    
  @Override
public void makeSound(int times){
            for (int i =0; i < times; i++){
		System.out.println("Trumpet");
            }
	}

// Override eat() method
	@Override
	public void eat( String Foodtype){
		System.out.println("Eats " + Foodtype);
	}

}


