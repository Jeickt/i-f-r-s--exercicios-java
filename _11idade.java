public class _11idade {
	public static void main(String[] args) {
		int ano_nascimento, ano_atual;
		int idade_anos, idade_meses, idade_dias, idade_semanas;
		System.out.print("Informe seu ano de nascimento: ");
		ano_nascimento = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o ano atual: ");
		ano_atual = Integer.parseInt(System.console().readLine());
		idade_anos = ano_atual - ano_nascimento;
		idade_meses = idade_anos * (int)12;
		idade_dias = idade_anos * (int)365;
		idade_semanas = idade_anos * (int)52;
		System.out.printf("Sua idade em anos é = %d\n", idade_anos);
		System.out.printf("Sua idade em meses é = %d\n", idade_meses);
		System.out.printf("Sua idade em dias é = %d\n", idade_dias);
		System.out.printf("Sua idade em semanas é = %d\n", idade_semanas);
	}
}