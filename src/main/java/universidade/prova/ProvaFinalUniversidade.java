package universidade.prova;

    // modelo base para as regras de prova de recuperação
    // atributos protegidos para controle da prova final
public abstract class ProvaFinalUniversidade {
    protected double notaFinal;
    protected double pesoFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade provaReferencia;

    // valida se o aluno precisa ou não e se pode  ou não fazer a recuperação
    public abstract boolean habilitadoRealizarProva();
}