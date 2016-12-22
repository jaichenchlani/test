
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int length = 100;
//		int bredth = 23000;
//		int area = length * bredth;
//		System.out.println("A rectangle of length " + length + " and bredth " + bredth + " is Area " + area);
		

		double tempInF = 0;
		
		for (int tempInC = 0; tempInC <=100; tempInC++) {
			tempInF = tempInC * 1.8 + 32;
			System.out.println("Celsius: "+ tempInC + " = Fahrenheit " + tempInF);
		}
		
	}

}
