import java.util.Scanner;

public class Lista01Exe04_AlgoritmosGeometriaPlana_Trapezio {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {

        float base1 = 0f;
        float base2 = 0f;
        float altura = 0f;
        float lado1 = 0f;
        float lado2 = 0f;
        float perimetro = 0f;
        float area = 0f;

        base1 = lerBase1(base1);
        base2 = lerBase2(base2);
        altura = lerAltura(altura);
        lado1 = lerLado1(lado1);
        lado2 = lerLado2(lado2);
        perimetro = calcularPerimetro(base1, base2, lado1, lado2);
        area = calcularArea(base1, base2, altura);
        imprimirPerimetro(perimetro);
        imprimirArea(area);
    }

    public static float lerBase1(float base1) {

        System.out.println("Base 1:");
        base1 = LER.nextFloat(); 

        return base1;
    }

    public static float lerBase2(float base2) {

        System.out.println("Base 2:");
        base2 = LER.nextFloat(); 

        return base2;
    }

    public static float lerAltura(float altura) {

        System.out.println("Altura:"); 
        altura = LER.nextFloat(); 

        return altura;
    }

    public static float lerLado1(float lado1) {

        System.out.println("Lado 1: "); 
        lado1 = LER.nextFloat(); 

        return lado1;
    }

    public static float lerLado2(float lado2) {

        System.out.println("Lado 2: "); 
        lado2 = LER.nextFloat(); 

        return lado2;
    }

    public static float calcularPerimetro(float base1, float base2, float lado1, float lado2) {

        float perimetro = 0f; 
        perimetro = base1 + base2 + lado1 + lado2; 

        return perimetro; 
    }

    public static float calcularArea(float base1, float base2, float altura) {

        float area = 0f; 
        area = ((base1 + base2) * altura) / 2;

        return area; 
    }

    public static void imprimirPerimetro(float perimetro) {
        System.out.println("Perímetro = " + perimetro); 
    }

    public static void imprimirArea(float area) {
        System.out.println("Área = " + area); 
    }
}