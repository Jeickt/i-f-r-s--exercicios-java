public class _13salario_a_receber {
	public static void main(String[] args) {
		float numero_horas, salario_minimo;
		float salario_a_receber;
		System.out.print("Informe o n�mero de horas trabalhadas: ");
		numero_horas = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o valor do sal�rio m�nimo: ");
		salario_minimo = Float.parseFloat(System.console().readLine());
		salario_a_receber = (numero_horas * (salario_minimo / (float)10)) * (float)0.97;
		System.out.printf("O valor do sal�rio a receber � = %.2f\n", salario_a_receber);
	}
}