package ConverteTemperatura;
import com.senac.SimpleJava.Console;

public class Temperatura {
	public void run()
	{
		converteTemperatura();
	}
	
	public void converteTemperatura()
	{
		
		String entrada = Console.readLine("Informe a temperatura: ");
		
		if ( !entrada.isEmpty() )
		{
			if(entrada.charAt(entrada.length() - 1) == 'C' || entrada.charAt(entrada.length() - 1) == 'c' )
			{
				celsiusToFarenheit(entrada);
			}
			if (entrada.charAt(entrada.length() - 1) == 'F' || entrada.charAt(entrada.length() - 1) == 'f') 
			{
				farenheitToCelsius(entrada);
			}
		}
		else
		{
			Console.println("Error of sintex!");
		}
		
	}
	
	public void celsiusToFarenheit(String valor)
	{
		String convercao = "";
		float num;
		num = Float.valueOf(valor.replaceAll("[^0-9]", ""));
		
		num = (float) (1.8 * num + 32);
		
		convercao = num + "°F";
		
		Console.print(convercao);
	}
	
	public void farenheitToCelsius(String valor)
	{
		String convercao = "";
		
		float num;
		num = Float.valueOf(valor.replaceAll("[^0-9]", ""));
		
		num = (float) ((num - 32) / 1.8 );
		
		convercao = num + "°C";
		
		Console.print(convercao);
	}
}
