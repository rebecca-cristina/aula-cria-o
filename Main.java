package projeto.intellij.novoprojetointellij.dados.aritimeticos.conversao.metodos;

public class Main {

    public static void main(String[] args) {

//        Calculadora
        System.out.println("Exercício calculadora" + "\n");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

//        Mensagens
        System.out.println("\n" + "Exercício Mensagem" + "\n");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

//         Empréstimo
        System.out.println("\n" + "Exercício empréstimo" + "\n");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
