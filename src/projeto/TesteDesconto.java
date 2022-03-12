package projeto;

import Imposto.CalcularImp;
import Imposto.ICMS;
import desconto.CalculadoraDeDesconto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("1000"), 6);
        CalculadoraDeDesconto calcularImp = new CalculadoraDeDesconto();

        System.out.println(calcularImp.calcular(orcamento1));
        System.out.println(calcularImp.calcular(orcamento2));
        System.out.println(calcularImp.calcular(orcamento3));
    }
}
