public class _04desconto {
	public static void main(String[] args) {
		float n1, desconto;
		System.out.print("Informe o pre�o: ");
		n1 = Float.parseFloat(System.console().readLine());
     	desconto = n1 * 90 / 100;
		System.out.printf("O pre�o com desconto � = %.2f\n", desconto);
	}
}