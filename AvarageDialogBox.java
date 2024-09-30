import javax.swing.JOptionPane;

public class AvarageDialogBox {
  public static void main(String[] args) {
	  
    String num1Str, num2Str;
    int num1, num2;
    double avarage;
    
	num1Str = JOptionPane.showInputDialog("Enter first integer: ") ;
	num1 = Integer.parseInt (num1Str) ;
    
    num2Str = JOptionPane.showInputDialog("Enter second integer: ") ;
	num2 = Integer.parseInt (num2Str) ;
	avarage = (num1 + num2) / 2.0;
	JOptionPane.showMessageDialog(null, String.format("The avarage is %.2f", avarage));
	
	System.exit(0);
  }
}