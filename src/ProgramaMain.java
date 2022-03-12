import java.math.BigDecimal;

public class ProgramaMain {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalcularImposto calcularImposto = new CalcularImposto();

        System.out.println(calcularImposto.calcular(orcamento, TipoImposto.ISS));
    }
}
