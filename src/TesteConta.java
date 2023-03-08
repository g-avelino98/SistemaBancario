import java.util.Scanner;

public class TesteConta {
	public static void main(String[] args) {
		int op = 0;
		Conta conta1 = new Conta();
		
		 while (op != 4) {
		    System.out.println("=== SUA CONTA ===");
	        System.out.println("1 - Mostrar o saldo");
	        System.out.println("2 - Depositar");
	        System.out.println("3 - Sacar");
	        System.out.println("4 - Sair");

	        System.out.print("Digite a operação desejada: ");

	        Scanner scanner = new Scanner(System.in);
	        op = scanner.nextInt();

	        switch (op) {
	            case 1: {
	                conta1.mostrarSaldo();
	                break;
	            }
	            case 2: {
	                conta1.depositar();
	                conta1.mostrarSaldo();
	                break;
	            }
	            case 3: {
	                conta1.sacar();
	                conta1.mostrarSaldo();
	                break;
	            }
	            case 4: {
	                System.out.println("Operação finalizada com sucesso.");
	                break;
	            }
	            default:
	                System.out.println("Opção inválida. Digite novamente.");
	                break;
	        }
		 }
	}
}
