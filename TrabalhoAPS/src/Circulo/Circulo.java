package Circulo;

public class Circulo {
	
    private final double PI = 3.14159;
    private double raio;
    int X,Y;

    public Circulo() {
        raio = 0.0;
        X = 0;
        Y = 0;
    }

    public Circulo(double r, int x, int y) {
        raio = r;
        X = x;
        Y = y;
    }

    public void setRadius(double r) {
        raio = r;
    }

    public double getRadius() {
        return raio;
    }

    public double calcArea() {
        return PI * raio * raio;
    }

    public double calcDiametro() {
        return raio * 2;
    }

    public double calcCircumferencia() {
        return 2 * PI * raio;
    }
    
    public String calcDistancia(Circulo circulo, Circulo circulo2){
    	
    	String txt = "";
    	
    	double distancia = Math.pow((circulo.X - circulo2.X) * (circulo.X - circulo2.X) + (circulo.Y - circulo2.Y) * (circulo2.Y - circulo2.Y), 0.5);
        if (circulo2.raio >= circulo.raio && distancia <= (circulo2.raio - circulo.raio)){
        	txt = "O c�rculo 1 est� dentro do c�rculo 2.";
        }
        else if (circulo.raio >= circulo2.raio && distancia <= (circulo.raio - circulo2.raio) ) {
        	txt ="O c�rculo 2 est� dentro do c�rculo 1.";
        }
        else if (distancia > (circulo2.raio + circulo2.raio)){
        	txt = "C�rculo 2 n�o se sobrep�e ao C�rculo 1.";
        }
        else {
        	txt = "O c�rculo 2 sobrep�e o c�rculo 1.";
    
        }
        
        return txt;
    }
    
}