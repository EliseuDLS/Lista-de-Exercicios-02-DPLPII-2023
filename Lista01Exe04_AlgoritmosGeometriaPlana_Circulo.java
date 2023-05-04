import java.util.Scanner;

public class Lista01Exe04_AlgoritmosGeometriaPlana_Circulo {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {

        double raio = 0f;
        double perimetro = 0f;
        double area = 0f;

        raio = lerRaio(raio);
        perimetro = calcularPerimetro(raio);
        area = calcularArea(raio);
        imprimirPerimetro(perimetro);
        imprimirArea(area);
    }

    public static double lerRaio(double raio) {

        System.out.println("Raio: "); 
        raio = LER.nextDouble(); 

        return raio;
    }

    public static double calcularPerimetro(double raio) {

        double perimetro = 0f; 
        perimetro = 2 * 3.14 * raio;

        return perimetro; 
    }

    public static double calcularArea(double raio) {

        double area = 0f; 
        area = 3.14 * Math.pow(raio, 2);

        return area; 
    }

    public static void imprimirPerimetro(double perimetro) {
        System.out.println("Perímetro = " + perimetro); 
    }

    public static void imprimirArea(double area) {
        System.out.println("Área = " + area); 
    }
}