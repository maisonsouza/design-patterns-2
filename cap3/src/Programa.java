import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {
        Historico historico = new Historico();
        Contrato contrato1 = new Contrato(Calendar.getInstance(), "Maison", TipoContrato.NOVO);
        historico.adiciona(contrato1.salvaEstado());

        contrato1.avanca();
        historico.adiciona(contrato1.salvaEstado());

        contrato1.avanca();
        historico.adiciona(contrato1.salvaEstado());

        Estado estadoAnterior = historico.pega(2);
        System.out.println(estadoAnterior.getEstado().getTipo());

    }
}
