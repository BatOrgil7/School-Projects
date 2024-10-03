//This programm computes the area of a circle

import java.util.Scanner;

public class ComputeArea{
  public static void main(String[] args) {
    //declare variables and a constant
    double radius;
	double area;
	final double PI = 3.14159;
	//ask the user for raduis
	System.out.print("Enter the raduis: ");
	Scanner input = new Scanner(System.in);
	radius = input.nextDouble();
	
	//id stataement to check the raduis 
	if(radius >= 0){
	  //compute the area
	  area = PI * radius * radius;
	
	  //display area
	  System.out.printf("The area of the circle is " +  area) ;
    }
	else{
	  System.out.println("The area of the circle is %.2f", area) ; 
	}
	}
}