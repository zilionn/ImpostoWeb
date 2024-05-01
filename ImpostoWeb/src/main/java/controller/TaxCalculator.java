package controller;

import model.ImpostoStrategy;
import model.Propriedade;

public class TaxCalculator {
	private ImpostoStrategy taxStrategy;

    public TaxCalculator(ImpostoStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(ImpostoStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculate(Propriedade property) {
        return taxStrategy.calcularImposto(property);
    }

}
