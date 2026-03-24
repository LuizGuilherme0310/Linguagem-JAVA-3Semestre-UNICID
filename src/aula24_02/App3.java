package aula24_02;

public class App3 {

	public static void main(String[] args) {
	
		int produto=1;

		for (int i= 1; i <=15; i++) {
			if (i % 2 != 0) {
				produto *= i;
		}
	}
		System.out.println("O produto dos impares de 1 a 15 é :" + produto );
}
}
