public class _10pes {
	public static void main(String[] args) {
		float pes;
		float polegadas, jardas, milhas;
		System.out.print("Informe o valor em pés para conversão: ");
		pes = Float.parseFloat(System.console().readLine());
		polegadas = pes * (float)12;
		jardas = pes / (float)3;
		milhas = pes / (float)5280;
		System.out.printf("O valor de pés em polegadas é = %.2f\n", polegadas);
		System.out.printf("O valor de pés em jardas é = %.2f\n", jardas);
		System.out.printf("O valor de pés em milhas é = %.2f\n", milhas);
	}
}