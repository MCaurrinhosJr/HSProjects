package CaixaEletronico;

import java.util.Random;

import com.senac.SimpleJava.Console;

public class Atm {
	public void run()
	{
		
		String nome;
        double inicial;
        
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
    
        //Obtendo os dados iniciais do Cliente
        Console.println("Cadastrando novo cliente.");
        Console.println("Ente com seu nome: ");
        nome = Console.readLine();
        
        Console.println("Entre com o valor inicial depositado na conta: ");
        inicial = Console.readDouble();
        
        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
		
	}
	
	
}
