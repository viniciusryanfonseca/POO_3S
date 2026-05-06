package universidade.prova;

    // implementa as regras específicas da Fafifo
public class ProvaFafifo extends ProvaUniversidade {
    // construtor: define media 6 e peso maior para AV3
    public ProvaFafifo() {
        this.mediaMinima = 6.0;
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 3;
    }

    // sobreescreve e aplica calculo com pesos ponderados
    @Override
    public double calcularMedia() {
        if (!realizouProvaFinal) return (av1 + av2) / 2;
        return (av1 * pesoAv1 + av2 * pesoAv2 + av3 * pesoAv3) / (pesoAv1 + pesoAv2 + pesoAv3);
    }

    // instancia a prova de recuperação da Fafifo
    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }
}

    // define quem pode fazer recuperação na Fafifo
class ProvaFinalFafifo extends ProvaFinalUniversidade {
    public ProvaFinalFafifo(ProvaFafifo prova) {
        this.provaReferencia = prova;
    }

    // so permite fazer prova final se nao atingiu a media
    @Override
    public boolean habilitadoRealizarProva() {
        return (provaReferencia.av1 + provaReferencia.av2) / 2 < provaReferencia.mediaMinima;
    }
}