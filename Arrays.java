public class Arrays {
	public static void main(String[] args) {
		int[] intArray = new int[0] ;
		Random rand = new Random() ;
		
		for (int i = 0; i < intArray.lenght; i++) {
			intArray[i] = 1 + rand.nextInt(10) ;
		}
		
		for (int i = 0; 