public class _03media_aritmetica {
	public static void main(String[] args) {
		float n1, n2, n3, media;
		System.out.print("Informe a primeira nota: ");
		n1 = Float.parseFloat(System.console().readLine());
        System.out.print("Informe a segunda nota: ");
		n2 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a terceira nota: ");
		n3 = Float.parseFloat(System.console().readLine());
		media = (n1 + n2 + n3) / 3;
		System.out.printf("A média das três notas é = %.2f\n", media);
	}
}