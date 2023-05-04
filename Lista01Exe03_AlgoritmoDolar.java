import java.util.Scanner;

public class Lista01Exe03_AlgoritmoDolar {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        float real = 0f;
        float dolar = 0f;
        float cotacao = 0f;

        real = lerReal(real);
        dolar = lerDolar(dolar);
        cotacao = cotacaoDolar(real, dolar);
        imprimirCotacao(cotacao);
    }

    public static float lerReal(float real) {
        
        System.out.println("Digite o valor em reais: ");
        real = LER.nextFloat();

        return real;
    }

    public static float lerDolar(float dolar) {
        
        System.out.println("Digite a cotação do dólar: ");
        dolar = LER.nextFloat();

        return dolar;
    }

    public static float cotacaoDolar(float real, float dolar) {
        
        float cotacao = 0f;
        cotacao = real / dolar;

        return cotacao;
    }

    public static void imprimirCotacao(float cotacao) {
        System.out.println("Valor em dólares = " + cotacao);
    }
}