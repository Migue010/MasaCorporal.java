import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.000");
        double peso, estatura, masaCorporal, menor = 18.5;

        System.out.println("INGRESA TU PESO");
        peso = teclado.nextDouble();

        System.out.println("INGRESA TU ESTATURA");
        estatura = teclado.nextDouble();

        masaCorporal = peso / (estatura * estatura);

        System.out.println("tu masa corporal es de:" + df.format(masaCorporal));

        if (masaCorporal < menor) {
            System.out.println("Bajo Peso");

        }
        if (masaCorporal > 18.5 && masaCorporal < 24.9) {
            System.out.println("Tu estado es: Normopeso");

        }
        if (masaCorporal > 25 && masaCorporal < 26.9) {
            System.out.println("Tu estado es: SobrePeso grado I");

        }
        if (masaCorporal > 27 && masaCorporal < 29.9) {
            System.out.println("Tu estado es: SobrePeso grado II");

        }
        if (masaCorporal > 30 && masaCorporal < 34.9) {
            System.out.println("Tu estado es: Obesidad de tipo I");

        }
        if (masaCorporal > 35 && masaCorporal < 39.9) {
            System.out.println("Tu estado es: Obesidad de tipo II");

        }
        if (masaCorporal > 40 && masaCorporal < 49.9) {
            System.out.println("Tu estado es: Obesidad de tipo III (MORBIDA)");

        }
        if (masaCorporal > 50) {
            System.out.println("Tu estado es: Obesidad de tipo IV (EXTREMA)");
        }
    }
}