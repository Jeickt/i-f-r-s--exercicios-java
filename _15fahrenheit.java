public class _15fahrenheit {
	public static void main(String[] args) {
		float celsius;
		float fahrenheit;
		System.out.print("Informe a temperatura em Celsius para convers�o: ");
		celsius = Float.parseFloat(System.console().readLine());
		fahrenheit = celsius * (float)9 / (float)5 + (float)32;
		System.out.printf("A temperatura convertida em Fahrenheit � = %.1f\n", fahrenheit);
	}
}