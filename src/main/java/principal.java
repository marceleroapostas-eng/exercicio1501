
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");

        numero = leitor.nextInt();

        if (numero == 0) {
            System.out.println("Zero");
        } else {
            if (numero == 1) {
                System.out.println("Um");
            } else {
                if (numero == 2) {
                    System.out.println("Dois");
                } else {
                    if (numero == 3) {
                        System.out.println("Tres");
                    } else {
                        if (numero == 4) {
                            System.out.println("Quatro");
                        } else {
                            if (numero == 5) {
                                System.out.println("Cinco");
                            } else {
                                if (numero == 6) {
                                    System.out.println("Seis");
                                } else {
                                    if (numero == 7) {
                                        System.out.println("Sete");
                                    } else {
                                        if (numero == 8) {
                                            System.out.println("Oito");
                                        } else {
                                            if (numero == 9) {
                                                System.out.println("Nove");
                                            } else {

                                                System.out.println("Numero invalido");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
