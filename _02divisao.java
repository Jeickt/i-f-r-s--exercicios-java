public class _02divisao {
	public static void main(String[] args) {
		float n1, n2, divisao;
		System.out.print("Informe o primeiro n�mero: ");
		n1 = Float.parseFloat(System.console().readLine());
        System.out.print("Informe o segundo n�mero: ");
		n2 = Float.parseFloat(System.console().readLine());
		divisao = n1 / n2;
		System.out.printf("O resultado da divis�o do primeiro n�mero pelo segundo n�mero � = %.2f\n", divisao);
	}
}