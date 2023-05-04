import java.util.Scanner;

public class Lista01Exe04_AlgoritmosGeometriaPlana_Quadrado {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {
        
        double altura = 0f;
        double perimetro = 0f;
        double area = 0f;

        altura = lerAltura(altura);
        perimetro = calcularPerimetro(altura);
        area = calcularArea(altura);
        imprimirPerimetro(perimetro);
        imprimirArea(area);
    }

    public static double lerAltura(double altura) {

        System.out.println("Altura:"); 
        altura = LER.nextDouble(); 

        return altura;
    }

    public static double calcularPerimetro(double altura) {

        double perimetro = 0f; 
        perimetro = 4 * altura; 

        return perimetro; 
    }

    public static double calcularArea(double altura) {

        double area = 0f; 
        area = Math.pow(altura, 2);

        return area; 
    }

    public static void imprimirPerimetro(double perimetro) {
        System.out.println("Perímetro = " + perimetro); 
    }

    public static void imprimirArea(double area) {
        System.out.println("Área = " + area); 
    }
}