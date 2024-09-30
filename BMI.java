import java.util.Scanner ;

public class BMI {
  public static void main(String[] args) {
  
  double weight ;
  double height ;
  
  Scanner input = new Scanner(System.in) ;
  System.out.println("Enter your weight in pounds: ") ;
  weight = input.nextDouble() ;
  System.out.println("Enter your height in inches: ") ;
  height = input.nextDouble() ;
  double kgs = weight / 0.454 ;
  double meters = height / 0.0254 ;
  double BMI = kgs / (meters * meters) ;
System.out.println(BMI);  
}
}
  