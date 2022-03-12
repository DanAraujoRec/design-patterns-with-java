package projeto;

import Imposto.CalcularImp;
import Imposto.ICMS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class ProgramaMain {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalcularImp calcularImp = new CalcularImp();

        System.out.println(calcularImp.calcular(orcamento, new ICMS()));
    }
}
