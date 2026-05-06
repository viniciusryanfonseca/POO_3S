package universidade.prova;

    // implementa as regras especificas da UCB
public class ProvaUCB extends ProvaUniversidade {
    // define media 7 e pesos iguais
    public ProvaUCB() {
        this.mediaMinima = 7.0;
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 1;
    }

    // sobreescreve e substitui a menor nota pela AV3
    @Override
    public double calcularMedia() {
        if (!realizouProvaFinal) return (av1 + av2) / 2;
        double menor = Math.min(av1, av2);
        return (av1 + av2 + av3 - menor) / 2;
    }

    // instancia a prova substitutiva da UCB
    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}

    // define quem pode fazer AV3 na UCB
class ProvaAV3UCB extends ProvaFinalUniversidade {
    public ProvaAV3UCB(ProvaUCB prova) {
        this.provaReferencia = prova;
    }

    // na UCB todos podem fazer AV3, mesmo aprovados
    @Override
    public boolean habilitadoRealizarProva() {
        return true; 
    }
}