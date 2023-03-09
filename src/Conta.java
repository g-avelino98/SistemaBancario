//Crie uma classe chamada Conta que tenha uma variável de instância 
//chamada saldo e métodos chamados depositar(double valor) e 
//sacar(double valor) que adicionam ou subtraem valores da variável saldo.

import java.util.Scanner;

public class Conta {
	private double saldo = 0.0;
	private double valor;
	
	public void mostrarSaldo() {
		System.out.println("Seu saldo atual é de: R$ " + saldo);
	}
	public void depositar() {
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite quanto você quer depositar: ");
		this.valor = scanner.nextDouble();	
		saldo = saldo + valor;
	}
	public void sacar() {
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite quanto você quer sacar: ");
		this.valor = scanner.nextDouble();	
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
        }
		else{
            saldo = saldo - valor;
        }
}
