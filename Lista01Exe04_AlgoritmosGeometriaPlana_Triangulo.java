import java.util.Scanner;

public class Lista01Exe04_AlgoritmosGeometriaPlana_Triangulo {

    final static Scanner LER = new Scanner(System.in); 

    public static void main(String[] args) {

        float base = 0f;
        float altura = 0f;
        float lado = 0f;
        float perimetro = 0f;
        float area = 0f;

        base = lerBase(base);
        altura = lerAltura(altura);
        lado = lerLado(lado);
        perimetro = calcularPerimetro(base, altura, lado);
        area = calcularArea(base, altura);
        imprimirPerimetro(perimetro);
        imprimirArea(area);
    }

    public static float lerBase(float base) {

        System.out.println("Base: ");
        base = LER.nextFloat(); 

        return base;
    }

    public static float lerAltura(float altura) {

        System.out.println("Altura: "); 
        altura = LER.nextFloat(); 

        return altura;
    }

    public static float lerLado(float lado) {

        System.out.println("Lado: "); 
        lado = LER.nextFloat(); 

        return lado;
    }

    public static float calcularPerimetro(float base, float altura, float lado) {

        float perimetro = 0f; 
        perimetro = base + altura + lado;

        return perimetro; 
    }

    public static float calcularArea(float base, float altura) {

        float area = 0f; 
        area = (base * altura) / 2;

        return area; 
    }

    public static void imprimirPerimetro(float perimetro) {
        System.out.println("Perímetro = " + perimetro); 
    }

    public static void imprimirArea(float area) {
        System.out.println("Área = " + area); 
    }
}