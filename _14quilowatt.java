public class _14quilowatt {
	public static void main(String[] args) {
		float salario_minimo, quilowatts;
		float valor_quilowatt, valor_pago, valor_pago_desconto;
		System.out.print("Informe o valor do salário mínimo: ");
		salario_minimo = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a quantidade de Quilowatts consumidos: ");
		quilowatts = Float.parseFloat(System.console().readLine());
		valor_quilowatt = salario_minimo / (float)5;
		valor_pago = quilowatts * valor_quilowatt;
		valor_pago_desconto = valor_pago * (float)0.85;
		System.out.printf("O valor do Quilowatt é = %.2f\n", valor_quilowatt);
		System.out.printf("O valor a ser pago pela residência é = %.2f\n", valor_pago);
		System.out.printf("O valor a ser pago com desconto é = %.2f\n", valor_pago_desconto);
	}
}