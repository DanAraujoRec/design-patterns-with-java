import java.math.BigDecimal;

public class CalcularImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

        switch (tipoImposto) {
        case ICMS:
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        case ISS:
            return orcamento.getValor().multiply(new BigDecimal("0.8"));
        default:
            return BigDecimal.ZERO;
        }
    }
}
