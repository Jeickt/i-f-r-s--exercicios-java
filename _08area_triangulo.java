public class _08area_triangulo {
	public static void main(String[] args) {
		float base, altura;
		float area;
		System.out.print("Informe o valor da base do triângulo: ");
		base = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o valor da altura do triângulo: ");
		altura = Float.parseFloat(System.console().readLine());
		area = (base * altura) / 2;
		System.out.printf("A área do triângulo é = %.2f\n", area);
	}
}