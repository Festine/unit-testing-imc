import java.util.Scanner;

public class Calculo {

		public void imc () {
			
			Scanner scanner = new Scanner(System.in) ;
			
			System.out.println("Informe seu peso em Kg:");
			
			double kg;
			kg = scanner.nextDouble();
			
			System.out.println("Informe sua altura:");
			
			double m;
			m = scanner.nextDouble();
			
			System.out.println("Seu peso é: " + kg + " Kg");
			System.out.println("Sua altura é: " + m + " M");
			
			double resultado = kg / (m * m);
			
			System.out.println("Seu IMC é: " + resultado);
			
			if (resultado < 18.5) {
				System.out.println("Você está abaixo do peso");
			}
			
			if (resultado >= 18.5 && resultado < 25) {
				System.out.println("Você está ótimo");
			}
			
			if (resultado >= 25 && resultado <30) {
				System.out.println("Você está acima do peso");
			}
			
			if (resultado >= 30) {
				System.out.println("Você está obeso");
			}
			
			scanner.close();
		}

}
