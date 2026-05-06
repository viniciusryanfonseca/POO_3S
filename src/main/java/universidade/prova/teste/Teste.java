package universidade.prova.teste;

    // importa as classes do pacote principal
import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;

public class Teste {
    public static void main(String[] args) {
        // informa as notas e exibe os resultado da UCB
        ProvaUCB ucb = new ProvaUCB();
        ucb.setNotas(5.0, 6.0, 8.0);
        ucb.setRealizouProvaFinal(true);

        System.out.println("\nRESULTADO UCB");
        System.out.println("Media Final: " + ucb.calcularMedia());
        System.out.println("Situacao: " + (ucb.aprovado() ? "Aprovado" : "Reprovado"));

        // informa as notas e exibe os resultado da Fafifo
        ProvaFafifo fafifo = new ProvaFafifo();
        fafifo.setNotas(7.0, 5.0, 6.0);
        fafifo.setRealizouProvaFinal(true);

        System.out.println("\nRESULTADO FAFIFO");
        System.out.println("Media Final: " + fafifo.calcularMedia());
        System.out.println("Situacao: " + (fafifo.aprovado() ? "Aprovado" : "Reprovado"));
    }
}