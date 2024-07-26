package curso1Modulo1;

import curso1Modulo1.Modelos.Estudos;
import curso1Modulo1.Modelos.Soma;
import curso1Modulo1.Modelos.Subtracao;

public class Main {
    public static void main(String[] args) {
        //atividade 1
        String nome = "Natan";
        System.out.println("Olá, " + nome);

        //atividade 2
        System.out.println("Tudo bem?");

        //atividade 3
        Estudos estudos1 = new Estudos("Geografia", "Relevos");
        Estudos estudos2 = new Estudos("Português", "Redação");
        System.out.println(estudos1);
        System.out.println(estudos2);

        //atividade 4
        Soma soma = new Soma();
        System.out.println("Quanto é 10+5? " + soma.conta());

        //atividade 5
        Subtracao subtracao = new Subtracao();
        System.out.println("Quanto é 10-5? " + subtracao.conta());

    }
}
