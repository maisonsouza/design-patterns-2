public class Programa2 {
    public static void main(String[] args) {
        Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)),new Numero(5));
        Expressao direita =  new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda,direita);
        int resultado = soma.avalia();

        System.out.println(resultado);
        Impressora impressora = new Impressora();
        soma.aceita(impressora);


    }
}
