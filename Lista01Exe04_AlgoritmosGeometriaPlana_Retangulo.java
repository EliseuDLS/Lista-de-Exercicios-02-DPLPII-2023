import java.util.Scanner;

public class Lista01Exe04_AlgoritmosGeometriaPlana_Retangulo {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {

        float base = 0f;
        float altura = 0f;
        float perimetro = 0f;
        float area = 0f;

        base = lerBase(base);
        altura = lerAltura(altura);
        perimetro = calcularPerimetro(base, altura);
        area = calcularArea(base, altura);
        imprimirPerimetro(perimetro);
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

    public static float calcularPerimetro(float base, float altura) {

        float perimetro = 0f; 
        perimetro = (2 * base) + (2 * altura); 

        return perimetro; 
    }

    public static float calcularArea(float base, float altura) {

        float area = 0f; 
        area = base * altura;

        return area; 
    }

    public static void imprimirPerimetro(float perimetro) {
        System.out.println("Perímetro = " + perimetro); 
    }

    public static void imprimirArea(float area) {
        System.out.println("Área = " + area); 
    }
}