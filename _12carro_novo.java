public class _12carro_novo {
	public static void main(String[] args) {
		float preco_fabrica, perc_lucro, perc_impostos;
		float lucro, impostos, preco_final;
		System.out.print("Informe o pre�o de f�brica do carro novo: ");
		preco_fabrica = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o percentual de lucro: ");
		perc_lucro = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o percentual de impostos do carro novo: ");
		perc_impostos = Float.parseFloat(System.console().readLine());
		lucro = preco_fabrica * perc_lucro / (float)100;
		impostos = preco_fabrica * perc_impostos / (float)100;
		preco_final = preco_fabrica + lucro + impostos;
		System.out.printf("O valor do lucro do distribuidor � = %.2f\n", lucro);
		System.out.printf("O valor correspondente aos impostos � = %.2f\n", impostos);
		System.out.printf("O pre�o final do produto � = %.2f\n", preco_final);
	}
}