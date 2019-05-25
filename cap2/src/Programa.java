import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        NotasMusicais notasMusicais = new NotasMusicais();
        List<Nota> musica = Arrays.asList(
                notasMusicais.pega("dosustenido"),
                notasMusicais.pega("resustenido"),
                notasMusicais.pega("mi"),
                notasMusicais.pega("fa"),
                notasMusicais.pega("fa"),
                notasMusicais.pega("fa"),
                notasMusicais.pega("dosustenido"),
                notasMusicais.pega("re"),
                notasMusicais.pega("do"),
                notasMusicais.pega("resustenido"),
                notasMusicais.pega("resustenido"),
                notasMusicais.pega("resustenido"),
                notasMusicais.pega("dosustenido"),
                notasMusicais.pega("sol"),
                notasMusicais.pega("fa"),
                notasMusicais.pega("mi"),
                notasMusicais.pega("mi"),
                notasMusicais.pega("mi"),
                notasMusicais.pega("dosustenido"),
                notasMusicais.pega("resustenido"),
                notasMusicais.pega("mi"),
                notasMusicais.pega("fa"),
                notasMusicais.pega("dosustenido"),
                notasMusicais.pega("resustenido"),
                notasMusicais.pega("mi"),
                notasMusicais.pega("fa"));

        Piano piano = new Piano();
        piano.toca(musica);
        System.out.println(musica);
    }
}
