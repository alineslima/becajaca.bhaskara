import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		double a = Double.parseDouble(leitor.nextLine());
		double b = Double.parseDouble(leitor.nextLine());
		double c = Double.parseDouble(leitor.nextLine());
		

		double[] raizes = calcularRaizes(a, b, c);
		System.out.println("As raizes da equação ax(2) + bx + c = 0 é " + raizes[0] + raizes[1]);
	
		
		
		leitor.close();
	
	}
	
	public static double[] calcularRaizes(double a, double b, double c) {
		double delta = (b*b) - (4*a*c);
		double x1 = ((-1*b) + Math.sqrt(delta))/(2*a);
		double x2 = ((-1*b) - Math.sqrt(delta))/2*a;
		double[] raizes = {x1,x2};
		return raizes;

	}

}
