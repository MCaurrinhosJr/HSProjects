package CaixaEletronico;

import com.senac.SimpleJava.Console;

public class Conta {

	private String nome;
    private int conta, saques;
    private double saldo;
    
    public Conta(String nome, int conta, double saldo_inicial){
        this.nome=nome;
        this.conta=conta;
        saldo=saldo_inicial;
        saques=0;
    }
    
    public void extrato(){
    	Console.println("\tEXTRATO");
    	Console.println("Nome: " + this.nome);
    	Console.println("Número da conta: " + this.conta);
    	Console.println("Saldo atual: %.2f\n",this.saldo);
    	Console.println("Saques realizados hoje: " + this.saques + "\n");
        
    }
    
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            Console.println("Sacado: " + valor);
            Console.println("Novo saldo: " + saldo + "\n");
        } else {
        	Console.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double valor)
    {
        saldo += valor;
        Console.println("Depositado: " + valor);
        Console.println("Novo saldo: " + saldo + "\n");
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = Console.readInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
    
    public void exibeMenu(){
        
    	Console.println("\t Escolha a opção desejada");
    	Console.println("1 - Consultar Extrato");
    	Console.println("2 - Sacar");
    	Console.println("3 - Depositar");
    	Console.println("4 - Sair\n");
    	Console.println("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    if(saques<3){
                    	Console.println("Quanto deseja sacar: ");
                        valor = Console.readDouble();
                        sacar(valor);
                    } else{
                    	Console.println("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 3:
            		Console.println("Quanto deseja depositar: ");
                    valor = Console.readDouble();
                    depositar(valor);
                    break;
                    
            case 4: 
            		Console.println("Sistema encerrado.");
                    break;
                    
            default:
            		Console.println("Opção inválida");
        }
    }
}
