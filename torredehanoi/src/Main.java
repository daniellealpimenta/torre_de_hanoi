import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Disco disco1 = new Disco(1);
        Disco disco2 = new Disco(2);
        Disco disco3 = new Disco(3);

        Pilhas pilhas = new Pilhas();

        Stack<Integer> pilha1 = new Stack<Integer>();
        Stack<Integer> pilha2 = new Stack<Integer>();
        Stack<Integer> pilha3 = new Stack<Integer>();

        pilhas.adicionarDiscos(disco3, pilha1);
        pilhas.adicionarDiscos(disco2, pilha1);
        pilhas.adicionarDiscos(disco1, pilha1);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);

        pilhas.removerDiscos(disco1, pilha1, pilha2);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);

        pilhas.removerDiscos(disco2, pilha1, pilha3);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);

        pilhas.removerDiscos(disco1, pilha2, pilha3);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);

        pilhas.removerDiscos(disco3, pilha1, pilha2);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);

        pilhas.removerDiscos(disco1, pilha3, pilha1);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);

        pilhas.removerDiscos(disco2, pilha3, pilha2);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);

        pilhas.removerDiscos(disco1, pilha1, pilha2);

        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha3);
    }
}