import java.util.Calendar;
import java.util.Random;

/**
 * Created by haroldo on 13/11/14.
 */
public class Algoritmo {

    public static int[] imprime(int[] populacao) {

        for(int k=0; k<populacao.length; k++) {
            System.out.print(populacao[k]+" ");
        }
        System.out.println();
        return populacao;
    }

    public static int[] aleatorio(int tam) {

        int numero;
        int[] vetor = new int[tam];

        Random aleatorio = new Random();

        for(int i=0; i<vetor.length; i++){
            numero = aleatorio.nextInt(15000) + 1;
            for(int j=0; j<vetor.length; j++) {
//                if(numero == vetor[j] && j != i){
//                    numero = aleatorio.nextInt(100) + 30;
//                }else{
                    vetor[i] = numero;
                }
            }
 //       }
        return vetor;
    }

    public static int[] bubleSort(int[] populacao) {

        for (int i = 0; i < populacao.length; i++) {
            for (int j = 0; j < populacao.length-1; j++) {
                if (populacao[j] > populacao[j+1]) {
                    int aux = populacao[j];
                    populacao[j] = populacao[j+1];
                    populacao[j+1] = aux;
                }
            }
        }
        return populacao;
    }

    public static int partition(int[] vet, int ini, int fim) {
        int pivo, topo, i;
        pivo = vet[ini];
        topo = ini;

        for (i = ini + 1; i <= fim; i++) {
            if (vet[i] < pivo) {
                vet[topo] = vet[i];
                vet[i] = vet[topo + 1];
                topo++;
            }
        }
        vet[topo] = pivo;
        return topo;
    }

    public static int[] quicksort(int[] populacao, int ini, int fim) {
        int meio;

        if (ini < fim) {
            meio = partition(populacao, ini, fim);
            quicksort(populacao, ini, meio);
            quicksort(populacao, meio + 1, fim);
        }

        return populacao;
    }


    public static void main(String[] args) {

        int tam = 8800;

        int numerosAleatorios[] = aleatorio(tam);

        System.out.print("Números Aleatórios - ");
        imprime(numerosAleatorios);

        System.out.println("");
        System.out.println("BubleSort");
        System.out.println("Início do Processo - " + Calendar.getInstance().getTime());
        //imprime(bubleSort(numerosAleatorios));
        bubleSort(numerosAleatorios);
        System.out.println("Fim do Processo - " + Calendar.getInstance().getTime());

        System.out.println("");
        System.out.println("QuickSort");
        System.out.println("Início do Processo - " + Calendar.getInstance().getTime());
        //imprime(quicksort(numerosAleatorios, 0, numerosAleatorios.length - 1));
        quicksort(numerosAleatorios, 0, numerosAleatorios.length - 1);
        System.out.println("Início do Processo - " + Calendar.getInstance().getTime());
    }
}
