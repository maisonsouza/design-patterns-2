public class Pedido {
    private String cliente;
    private double valoprivate;
    private Status status;

    public Pedido(String cliente, double valoprivate) {
        this.cliente = cliente;
        this.valoprivate = valoprivate;
        this.status = Status.NOVO;
    }

    public void paga(){
        status = Status.PAGO;
    }

    public void finaliza(){
        status = Status.ENTREGUE;
    }

    public String getCliente() {
        return cliente;
    }
}
