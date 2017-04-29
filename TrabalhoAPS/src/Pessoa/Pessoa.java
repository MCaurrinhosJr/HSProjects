package Pessoa;

import java.time.LocalDate;

import com.senac.SimpleJava.Console;

public class Pessoa {

	public void run()
	{
		showPessoa();
	}
	
	public void showPessoa()
	{
		LocalDate dataNasc = null;
		String signo;
		int idade;
		dataNasc = LocalDate.parse("1993-10-02");
		signo = showSigno(dataNasc);
		idade = LocalDate.now().getYear() - dataNasc.getYear();
		
		Console.println("Data de nascimento é "+ dataNasc + " Signo é " + signo + " Idade é "+ idade + " anos.");
	}

	private String showSigno(LocalDate dataNasc) {
		
		LocalDate data = dataNasc;
		String signo = "";
		int mes = data.getMonthValue();
        int dia = data.getDayOfMonth();

        if      ((mes == 12 && dia >= 22 && dia <= 31) || (mes ==  1 && dia >= 1 && dia <= 19))
            signo = "Capricornio";
        else if ((mes ==  1 && dia >= 20 && dia <= 31) || (mes ==  2 && dia >= 1 && dia <= 17))
        	signo = "Aquario";
        else if ((mes ==  2 && dia >= 18 && dia <= 29) || (mes ==  3 && dia >= 1 && dia <= 19))
        	signo =  "Peixes";
        else if ((mes ==  3 && dia >= 20 && dia <= 31) || (mes ==  4 && dia >= 1 && dia <= 19))
        	signo = "Aries";
        else if ((mes ==  4 && dia >= 20 && dia <= 30) || (mes ==  5 && dia >= 1 && dia <= 20))
        	signo =  "Touro";
        else if ((mes ==  5 && dia >= 21 && dia <= 31) || (mes ==  6 && dia >= 1 && dia <= 20))
        	signo = "Gemios";
        else if ((mes ==  6 && dia >= 21 && dia <= 30) || (mes ==  7 && dia >= 1 && dia <= 22))
        	signo = "Cancer";
        else if ((mes ==  7 && dia >= 23 && dia <= 31) || (mes ==  8 && dia >= 1 && dia <= 22))
        	signo = "Leao";
        else if ((mes ==  8 && dia >= 23 && dia <= 31) || (mes ==  9 && dia >= 1 && dia <= 22))
        	signo = "Virgem";
        else if ((mes ==  9 && dia >= 23 && dia <= 30) || (mes == 10 && dia >= 1 && dia <= 22))
        	signo = "Libra";
        else if ((mes == 10 && dia >= 23 && dia <= 31) || (mes == 11 && dia >= 1 && dia <= 21))
        	signo = "Escorpiao";
        else if ((mes == 11 && dia >= 22 && dia <= 30) || (mes == 12 && dia >= 1 && dia <= 21))
        	signo = "Sagitario";
		
        return signo;
	}
}
