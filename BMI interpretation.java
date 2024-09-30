public class BMI {
  public static void main(String[] args) {
  
  double weight, height, BMI ;
  
  
  Scanner input = new Scanner(System.in) ;
  System.out.println("Enter your weight in pounds: ") ;
  weight = input.nextDouble() ;
  System.out.println("Enter your height in inches: ") ;
  height = input.nextDouble() ;
  double kgs = weight / 0.454 ;
  double meters = height / 0.0254 ;
  double BMI = kgs / (meters * meters) ;
System.out.println(BMI);  
if (BMI < 18.5) 
	System.out.println("Underweight");
else if (BMI >= 18.5 && BMI < 25.2)
	System.out.println("Normal");
else if (BMI >= 18.5 && BMI < 25.2)
	System.out.println("Overweight");
else (BMI >= 18.5 && BMI < 25.2)
System.out.println("Obese");
}
}