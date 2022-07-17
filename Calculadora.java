package projeto.intellij.novoprojetointellij.dados.aritimeticos.conversao.metodos;

public class Calculadora {
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("Soma dos numeros " + numero1 + " e " + numero2 + " é de: " + resultado);

    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("Subtração dos numeros " + numero1 + " e " + numero2 + " é de: " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("Multiplicação dos numeros " + numero1 + " e " + numero2 + " é de: " + resultado);

    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("Divisão dos numeros " + numero1 + " e " + numero2 + " é de: " + resultado);

    }
}

