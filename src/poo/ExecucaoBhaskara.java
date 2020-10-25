package poo;
import java.util.Scanner;

public class ExecucaoBhaskara {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Usuario usuario = new Usuario();
		usuario.setValorA(Double.parseDouble(leitor.nextLine()));
		usuario.setValorB(Double.parseDouble(leitor.nextLine()));
		usuario.setValorC(Double.parseDouble(leitor.nextLine()));
		
		CalcularRaizes calcularRaizes = new CalcularRaizes();

		System.out.println("As raizes da equação ax(2) + bx + c = 0 é: ");
		
		double[] raizes = calcularRaizes.calcularRaizes(usuario);
		for (double raiz : raizes) {
			System.out.println(raiz);
		}
		
	
		
		
		leitor.close();
	
	}
	
	

}
