package curso1Modulo2;

import curso1Modulo2.Modelos.Media;
import curso1Modulo2.Modelos.TestaCasting;

public class Main {
    public static void main(String[] args) {
        //exercicio 1
        Media media = new Media(9.1, 8.8);
        System.out.println(String.format("A média das notas é %.2f.", media.pegaMedia()));

        //exercicio 2
        TestaCasting casting = new TestaCasting(9.8, 6);
        System.out.println("Número 9.8 após casting:" + casting.fazCasting());

        //exercicio 3
        char letra = 'A';
        String palavra = "A primeira letra do alfabeto é: ";
        String palavraLetra = palavra + letra;
        System.out.println(palavraLetra);

        //exercicio 4
    }
}
