public class _01subtracao {
	public static void main(String[] args) {
		int n1, n2, subtracao;
		System.out.print("Informe o primeiro n�mero: ");
		n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Informe o segundo n�mero: ");
		n2 = Integer.parseInt(System.console().readLine());
		subtracao = n1 - n2;
		System.out.printf("O resultado da subtra��o do primeiro n�mero pelo segundo n�mero � = %d\n", subtracao);
	}
}