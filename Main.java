import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstScan = new Scanner(System.in);
        System.out.println("Digite a base do triângulo");
        Double base = Double.valueOf(firstScan.nextLine());

        Scanner secondScan = new Scanner(System.in);
        System.out.println("Digite a altura do Triângulo");
        Double altura = Double.valueOf(secondScan.nextLine());

        area(base,altura);
        perimetro(base, altura);
        diagonal(base, altura);


    }

    public static void area(Double base, Double altura){
        System.out.println(("A area é: " + ((base * altura) / 2)));
    }
    public static void perimetro(Double base, Double altura){
        Double convertendo1 = Math.pow(base, 2);
        Double convertendo2 = Math.pow(altura, 2);
        Double somaconvert = convertendo1 + convertendo2;
        Double calcHipotenusa = Math.sqrt(somaconvert);
        Double perimetrocalculado = (base + altura + calcHipotenusa);
        System.out.println("O perimetro é: " + perimetrocalculado);
    }
    public static void diagonal(Double base, Double altura){
        Double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.println("A diagonal é: " +diagonal);
    }
}

/**
 * Problema "retangulo"
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
 * da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
 * Exemplo 1:
 * Base do retangulo: 4.0
 * Altura do retangulo: 5.0
 * AREA = 20.0000
 * PERIMETRO = 18.0000
 * DIAGONAL = 6.4031
 * Exemplo 2:
 * Base do retangulo: 10.3
 * Altura do retangulo: 13.1
 * AREA = 134.9300
 * PERIMETRO = 46.8000
 * DIAGONAL = 16.6643
 */