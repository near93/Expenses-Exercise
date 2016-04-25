/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Gelen
 */
import java.util.Scanner;

public class Exercise {
    Scanner input = new Scanner (System.in);
    private double rent, power, other;
    
    public static void main(String[] args) {

    Exercise methods = new Exercise();
    methods.getTotal();
    methods.displayExpenses();
    System.out.println ("Total: " + methods.getTotal());
  }

Exercise()
{
	System.out.println("Enter your rent: ");
	rent=input.nextDouble();
	//rent = 20.0;
	System.out.println("Enter your power: ");
	power=input.nextDouble();
	//power = 10.0;
	System.out.println("Enter your other expense: ");
	other=input.nextDouble();
	//other = 5.0;
}

void setExpenses (double r, double p, double o)
{
	rent = r;
	power = p;
	other = o;
}

void displayExpenses()
{
	System.out.println(rent);
	System.out.println(power);
	System.out.println(other);
}

double getTotal()
{
	double totalExpenses;
	totalExpenses = rent + power + other;
	return totalExpenses;
}

double getRent()
{
	return rent;
	
}
}
