package poo;

public class CalcularRaizes {
	
	public double[] calcularRaizes(Usuario valor) {
		double delta = (valor.getValorB()*valor.getValorB()) - (4*valor.getValorA()*valor.getValorC());
		double x1 = ((-1*valor.getValorB()) + Math.sqrt(delta))/(2*valor.getValorA());
		double x2 = ((-1*valor.getValorB()) - Math.sqrt(delta))/2*valor.getValorA();
		double[] raizes = {x1,x2};
		return raizes;

	}

}
