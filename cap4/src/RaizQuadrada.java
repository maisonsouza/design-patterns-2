public class RaizQuadrada implements Expressao {

    private Expressao expressao;

    public RaizQuadrada(Expressao e) {
        this.expressao = e;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(expressao.avalia());
    }

    @Override
    public void aceita(Impressora impressora) {
        impressora.visitaRaiz(this);
    }

    public Expressao getExpressao() {
        return expressao;
    }
}