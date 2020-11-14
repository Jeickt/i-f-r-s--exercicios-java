public class _09area_quadrado {
	public static void main(String[] args) {
		float lado;
		float area;
		System.out.print("Informe o valor do lado do quadrado: ");
		lado = Float.parseFloat(System.console().readLine());
		area = lado * lado;
		System.out.printf("A área do quadrado é = %.2f\n", area);
	}
}