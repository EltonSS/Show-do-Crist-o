package Funcoes;

import java.util.Random;

public class gerarVetor {

//    private int[] vetor = gerarVetor(10,10);
//    int vt1 = vetor[0];
//        gerarPerguntas(vt1, 3);

    public static int[] gerarVetor(int tamVet, int tamRand) {
        int[] vetor = new int[tamVet];
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(tamRand);
        }
        return vetor;
    }    
}
