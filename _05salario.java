public class _05salario {
	public static void main(String[] args) {
		float salario, salario_receber;
		float gratificacao = (float)1.05, imposto = (float)0.93;
		System.out.print("Informe o sal�rio: ");
		salario = Float.parseFloat(System.console().readLine());
     	salario_receber = (salario * gratificacao) * imposto;
		System.out.printf("O sal�rio a receber � = %.2f\n", salario_receber);
	}
}