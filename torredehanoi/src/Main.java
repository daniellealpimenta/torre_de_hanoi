import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        boolean ganhou = false;
        int movimentos = 0;

        Disco disco1 = new Disco(1);
        Disco disco2 = new Disco(2);
        Disco disco3 = new Disco(3);
        Disco disco4 = new Disco(4);
        Disco disco5 = new Disco(5);

        Pilhas pilhas = new Pilhas();

        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        // Adicionando discos na pilha inicial
        pilhas.adicionarDiscos(disco5, pilha1);
        pilhas.adicionarDiscos(disco4, pilha1);
        pilhas.adicionarDiscos(disco3, pilha1);
        pilhas.adicionarDiscos(disco2, pilha1);
        pilhas.adicionarDiscos(disco1, pilha1);

        Scanner ler = new Scanner(System.in);

        while (!ganhou) {
            int escolhaOrigem, escolhaDestino;
            pilhas.desenharPilha(pilha1, pilha2, pilha3);

            System.out.println("""
                    ----ESCOLHA ORIGEM----
                    Escolha a pilha de onde mover o disco do topo:

                    [1] - Pilha 1
                    [2] - Pilha 2
                    [3] - Pilha 3
                    [0] - Sair
                    
                    """);

            escolhaOrigem = ler.nextInt();

            // Se o usuário escolher sair, quebra o loop
            if (escolhaOrigem == 0) {
                break;
            }

            // Determina a pilha de origem
            Stack<Integer> pilhaOrigem = escolhaOrigem == 1 ? pilha1 : escolhaOrigem == 2 ? pilha2 : pilha3;

            // Verifica se a pilha de origem tem discos
            if (pilhaOrigem.isEmpty()) {
                System.out.println("A pilha escolhida está vazia. Escolha outra pilha.");
                continue;
            }

            // Seleciona o disco do topo da pilha de origem
            int discoTopo = pilhaOrigem.peek();

            System.out.println("""
                    ----ESCOLHA DESTINO----
                    Escolha a pilha para onde mover o disco do topo:

                    [1] - Pilha 1
                    [2] - Pilha 2
                    [3] - Pilha 3
                    
                    """);

            escolhaDestino = ler.nextInt();

            // Determina a pilha de destino
            Stack<Integer> pilhaDestino = escolhaDestino == 1 ? pilha1 : escolhaDestino == 2 ? pilha2 : pilha3;

            // Verifica se o movimento é válido antes de mover o disco
            if (!pilhaDestino.isEmpty() && pilhaDestino.peek() < discoTopo) {
                System.out.println("Movimento inválido! Você só pode colocar um disco menor sobre um disco maior.");
            } else {
                // Remove o disco do topo da pilha de origem e o coloca na pilha de destino
                pilhaOrigem.pop();
                pilhaDestino.push(discoTopo);
                movimentos++;
            }

            // Verificação de condição de vitória
            ganhou = pilha1.isEmpty() && pilha2.isEmpty() && pilha3.size() >= 2;
            if (ganhou) {
                System.out.println("Parabéns, você ganhou em: " + movimentos + " movimentos");
                pilhas.desenharPilha(pilha1,pilha2,pilha3);
            }
        }
        ler.close();
    }
}
