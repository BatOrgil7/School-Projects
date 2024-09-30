import java.util.Scanner;

public class Acceleration {
  public static void main (String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  double acceleration;
  
  System.out.println("Enter the starting velocity: ");
  double v0 = input.nextDouble();
  System.out.println("Enter the ending velocity: ");
  double v1 = input.nextDouble();
  System.out.println("Enter the time span: ");
  double t = input.nextDouble();
  
  acceleration = (v1 - v0) / t;
  
  System.out.println("Acceleratjvajjion is: " + acceleration);
  }
}

  