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
            System.out.println("Disco de tamanho " + disco.tamanho + " adicionado na pilha.");
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
}

