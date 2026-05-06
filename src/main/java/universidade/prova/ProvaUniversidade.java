package universidade.prova;

    // classe base que define os moldes para todas as universidades
public abstract class ProvaUniversidade {
    // atributos protegidos para as classes filhas acessarem
    protected double av1, av2, av3;
    protected double pesoAv1, pesoAv2, pesoAv3;
    protected double mediaMinima;
    protected boolean realizouProvaFinal;

    // metodos para receber dados de fora do pacote (sets)
    public void setNotas(double av1, double av2, double av3) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    public void setRealizouProvaFinal(boolean realizou) {
        this.realizouProvaFinal = realizou;
    }

    // metodos abstratos que cada universidade deve implementar
    public abstract double calcularMedia();
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    // logica comum para verificar aprovação
    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }
}