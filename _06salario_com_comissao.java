public class _06salario_com_comissao {
	public static void main(String[] args) {
		float salario, vendas;
		float comissao, perc_comissao = (float)0.04, salario_com_comissao;
		System.out.print("Informe o valor do salário: ");
		salario = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o valor de vendas: ");
		vendas = Float.parseFloat(System.console().readLine());
     	comissao = vendas * perc_comissao;
		salario_com_comissao = salario + comissao;
		System.out.printf("A comissão resultou em %.2f e o salário com comissão a receber é = %.2f\n", comissao, salario_com_comissao);
	}
}