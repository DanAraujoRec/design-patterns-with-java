package projeto;

import java.math.BigDecimal;

public class CalcularImp {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
