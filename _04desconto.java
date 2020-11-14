public class _04desconto {
	public static void main(String[] args) {
		float n1, desconto;
		System.out.print("Informe o preço: ");
		n1 = Float.parseFloat(System.console().readLine());
     	desconto = n1 * 90 / 100;
		System.out.printf("O preço com desconto é = %.2f\n", desconto);
	}
}