package FOR;
import java.util.Scanner;
public class torneioNumeros {

	public torneioNumeros() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        if (pares > impares) {
            System.out.println(" Os pares venceram!");
        } else if (impares > pares) {
            System.out.println(" Os impares venceram!");
        } else {
            System.out.println("Ops! Empate entre pares e ímpares2");
        }

        scanner.close();
    }
}

		     

			
			
	
		
		


