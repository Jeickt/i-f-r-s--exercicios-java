public class _06salario_com_comissao {
	public static void main(String[] args) {
		float salario, vendas;
		float comissao, perc_comissao = (float)0.04, salario_com_comissao;
		System.out.print("Informe o valor do sal�rio: ");
		salario = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o valor de vendas: ");
		vendas = Float.parseFloat(System.console().readLine());
     	comissao = vendas * perc_comissao;
		salario_com_comissao = salario + comissao;
		System.out.printf("A comiss�o resultou em %.2f e o sal�rio com comiss�o a receber � = %.2f\n", comissao, salario_com_comissao);
	}
}