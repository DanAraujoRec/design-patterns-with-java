package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoQtdItens extends Desconto{

    public DescontoOrcamentoQtdItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadesItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
