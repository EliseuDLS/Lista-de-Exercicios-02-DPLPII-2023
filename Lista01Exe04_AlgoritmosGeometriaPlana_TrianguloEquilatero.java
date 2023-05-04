import java.util.Scanner;

public class Lista01Exe04_AlgoritmosGeometriaPlana_TrianguloEquilatero {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {

        double lado = 0f;
        double perimetro = 0f;
        double area = 0f;

        lado = lerLado(lado);
        perimetro = calcularPerimetro(lado);
        area = calcularArea(lado);
        imprimirPerimetro(perimetro);
        imprimirArea(area);
    }

    public static double lerLado(double lado) {

        System.out.println("Lado: "); 
        lado = LER.nextDouble(); 

        return lado;
    }

    public static double calcularPerimetro(double lado) {

        double perimetro = 0f; 
        perimetro = 3 * lado;

        return perimetro; 
    }

    public static double calcularArea(double lado) {

        double area = 0f; 
        area = Math.pow(lado, 2) * Math.sqrt(3) / 4;

        return area; 
    }

    public static void imprimirPerimetro(double perimetro) {
        System.out.println("Perímetro = " + perimetro); 
    }

    public static void imprimirArea(double area) {
        System.out.println("Área = " + area); 
    }
}