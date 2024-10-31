import java.util.Scanner;
import java.util.Stack;

public class Pilhas {

    private boolean temDisco;
    private boolean trocaDeuCerto = true;

    Scanner ler = new Scanner(System.in);

    public boolean pilhaVazia(Stack<Integer> pilha) {
        return pilha.isEmpty();
    }

    public void adicionarDiscos(Disco disco, Stack<Integer> pilha) {
        temDisco = pilhaVazia(pilha);
        if (pilhaVazia(pilha) || pilha.peek() > disco.tamanho) {
            pilha.push(disco.tamanho);
//            System.out.println("Disco de tamanho " + disco.tamanho + " adicionado na pilha.");
        } else {
            System.out.println("O Disco não pode ser colocado. Tamanho do disco no topo da pilha: " + pilha.peek());
            this.trocaDeuCerto = false;
        }
    }

    public void removerDiscos(Disco disco, Stack<Integer> pilha, Stack<Integer> pilha2) {
        temDisco = pilhaVazia(pilha);
        if (!temDisco) {
            pilha.pop();
            adicionarDiscos(disco, pilha2);
            if (!trocaDeuCerto){
                adicionarDiscos(disco, pilha);
            }
        } else {
            System.out.println("Não tem disco nessa pilha");
        }
    }

    public void desenharPilha(Stack<Integer> pilha1, Stack<Integer> pilha2, Stack<Integer> pilha3) {
        // Encontrar a altura máxima entre as pilhas para definir o número de linhas
        int alturaMaxima = Math.max(pilha1.size(), Math.max(pilha2.size(), pilha3.size()));

        // Iterar de cima para baixo, da altura máxima até 1
        for (int x = alturaMaxima + 2; x > 0; x--) {
            // Verificar se há discos na posição x-1 de cada pilha
            String p1 = (pilha1.size() >= x) ? "■".repeat(pilha1.get(x - 1)) : " x";
            String p2 = (pilha2.size() >= x) ? "■".repeat(pilha2.get(x - 1)) : " x";
            String p3 = (pilha3.size() >= x) ? "■".repeat(pilha3.get(x - 1)) : " x";

            // Imprimir a linha com espaçamento uniforme
            System.out.printf("%-12s %-10s %-8s\n", p1, p2, p3);
        }

        // Separador para indicar as bases das pilhas
        System.out.println("========  ========  ========");
    }
}

