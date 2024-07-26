package curso1Modulo2;

import curso1Modulo2.Modelos.Media;
import curso1Modulo2.Modelos.TestaCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

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
        System.out.println("Digite um preço para o produto x: ");
        double precoProduto = leitura.nextDouble();
        System.out.println("Agora digite a quantidade do produto x: ");
        int quantidade = leitura.nextInt();
        String singularOuPlural = quantidade > 1 ? "unidades" : "unidade";

        System.out.println("O produto X custa " + precoProduto + " dólares e há " + quantidade +  " " + singularOuPlural + " no estoque");
        leitura.close();

        //exercicio 5
        double taxaConversao = 4.94;
        double converteDolarEmReal = precoProduto / taxaConversao;
        System.out.println(String.format("Os $%.2f do produto, convertidos para real, seriam R$%.2f",precoProduto,converteDolarEmReal));

        //exercicio 6
        double precoOriginal = precoProduto;
        double percentualDesconto = (0.1/100);
        double valorTotal = precoOriginal - (precoOriginal*percentualDesconto);
        System.out.println(String.format("O preço do produto X, após 10% de desconto, fica R$%.2f", valorTotal));
    }
}
