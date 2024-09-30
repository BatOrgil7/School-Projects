import java.util.Scanner;

public class Bill { 
  public static void main (String[] args) {
  
  double subtotal;
  double gratuityrate;
  double gratuity;
  double total;
  System.out.print("Enter the subtotal:") ;
  Scanner input = new Scanner(System.in) ;
  subtotal = input.nextDouble() ;
  System.out.print("Enter the gratuity rate (e.g. enter 15 for 15%):") ;
  gratuityrate = input.nextDouble() ;

  gratuity = subtotal * gratuityrate / 100 ;
  total = subtotal + gratuity ;
  
  System.out.printf("The gratuity is: %.2f ", gratuity) ;
  System.out.printf("and total is: %.2f", total) ;
  }
}