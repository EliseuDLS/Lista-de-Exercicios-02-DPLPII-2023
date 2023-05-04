import java.util.Scanner;

public class Lista01Exe01_AlgoritmoAreaTriangulo {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {
        
        float base = 0f;
        float altura = 0f;
        float area = 0f;

        base = lerBase(base);
        altura = lerAltura(altura);
        area = calcularArea(base, altura);
        imprimirArea(area);
    }

    public static float lerBase(float base) {

        System.out.println("Base:");
        base = LER.nextFloat(); 

        return base;
    }

    public static float lerAltura(float altura) {

        System.out.println("Altura:"); 
        altura = LER.nextFloat(); 

        return altura;
    }

    public static float calcularArea(float base, float altura) {

        float area = 0f; 
        area = (base * altura) / 2; 

        return area; 
    }

    public static void imprimirArea(float area) {
        System.out.println("Área = " + area); 
    }
}