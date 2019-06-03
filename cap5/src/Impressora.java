public class Impressora {

    public void visitaSoma(Soma soma){
        System.out.print("(");
        soma.getEsquerda().aceita(this);

        System.out.print(" + ");

        soma.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaSubtracao(Subtracao subtracao){
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);

        System.out.print(" - ");

        subtracao.getDireita().aceita(this);
        System.out.print(")");

    }

    public void visitaMultiplicacao(Multiplicacao multiplicacao){
        System.out.println("(");
        multiplicacao.getEsquerda().aceita(this);

        System.out.print(" X ");

        multiplicacao.getDireita().aceita(this);
        System.out.println(") ");

    }

    public void visitaDivisao(Divisao divisao){
        divisao.getEsquerda().aceita(this);

        System.out.print(" / ");

        divisao.getDireita().aceita(this);

    }

    public void visitaRaiz(RaizQuadrada raiz){
        raiz.getExpressao().aceita(this);

    }



    public void visitaNumero(Numero numero){
        System.out.print(numero.getNumero());
    }
}
