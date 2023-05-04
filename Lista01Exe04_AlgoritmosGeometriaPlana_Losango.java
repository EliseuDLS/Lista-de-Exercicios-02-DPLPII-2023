import java.util.Scanner;

public class Lista01Exe04_AlgoritmosGeometriaPlana_Losango {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {

        float lado = 0f;
        float diagonal1 = 0f;
        float diagonal2 = 0f;
        float perimetro = 0f;
        float area = 0f;

        lado = lerLado(lado);
        diagonal1 = lerDiagonal1(diagonal1);
        diagonal2 = lerDiagonal2(diagonal2);
        perimetro = calcularPerimetro(lado);
        area = calcularArea(diagonal1, diagonal2);
        imprimirPerimetro(perimetro);
        imprimirArea(area);
    }

    public static float lerLado(float lado) {

        System.out.println("Lado: "); 
        lado = LER.nextFloat(); 

        return lado;
    }

    public static float lerDiagonal1(float diagonal1) {

        System.out.println("Diagonal 1: "); 
        diagonal1 = LER.nextFloat(); 

        return diagonal1;
    }

    public static float lerDiagonal2(float diagonal2) {

        System.out.println("Diagonal 2: "); 
        diagonal2 = LER.nextFloat(); 

        return diagonal2;
    }

    public static float calcularPerimetro(float lado) {

        float perimetro = 0f; 
        perimetro = 4 * lado; 

        return perimetro; 
    }

    public static float calcularArea(float diagonal1, float diagonal2) {

        float area = 0f; 
        area = (diagonal1 * diagonal2) / 2;

        return area; 
    }

    public static void imprimirPerimetro(float perimetro) {
        System.out.println("Perímetro = " + perimetro); 
    }

    public static void imprimirArea(float area) {
        System.out.println("Área = " + area); 
    }
}