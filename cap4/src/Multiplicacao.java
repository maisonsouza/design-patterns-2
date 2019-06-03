public class Multiplicacao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda * resultadoDaDireita;
    }

    @Override
    public void aceita(Impressora impressora) {
        impressora.visitaMultiplicacao(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }
}