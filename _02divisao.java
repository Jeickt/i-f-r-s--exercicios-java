public class _02divisao {
	public static void main(String[] args) {
		float n1, n2, divisao;
		System.out.print("Informe o primeiro número: ");
		n1 = Float.parseFloat(System.console().readLine());
        System.out.print("Informe o segundo número: ");
		n2 = Float.parseFloat(System.console().readLine());
		divisao = n1 / n2;
		System.out.printf("O resultado da divisão do primeiro número pelo segundo número é = %.2f\n", divisao);
	}
}