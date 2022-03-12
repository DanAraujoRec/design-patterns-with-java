package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoOrcamentoQtdItens(new DescontoOrcamentoValor(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
