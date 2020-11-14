public class _07media_ponderada {
	public static void main(String[] args) {
		float n1, p1, n2, p2, n3, p3;
		float pesos, media_ponderada;
		System.out.print("Informe a primeira nota: ");
		n1 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso da primeira nota: ");
		p1 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a segunda nota: ");
		n2 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso da segunda nota: ");
		p2 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a terceira nota: ");
		n3 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso da terceira nota: ");
		p3 = Float.parseFloat(System.console().readLine());
     	pesos = p1 + p2 + p3;
		media_ponderada = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / pesos;
		System.out.printf("A média ponderada é = %.2f\n", media_ponderada);
	}
}