/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1070 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        int numero;
        
        numero = leitor.nextInt();

        while (contador < 6) {
            if (numero % 2 != 0) {
                contador++;
                System.out.println(numero);
            }
            numero++;
        }
    }
}
