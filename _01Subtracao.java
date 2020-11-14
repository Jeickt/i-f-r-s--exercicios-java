public class _01subtracao {
	public static void main(String[] args) {
		int n1, n2, subtracao;
		System.out.print("Informe o primeiro número: ");
		n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Informe o segundo número: ");
		n2 = Integer.parseInt(System.console().readLine());
		subtracao = n1 - n2;
		System.out.printf("O resultado da subtração do primeiro número pelo segundo número é = %d\n", subtracao);
	}
}