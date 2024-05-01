package model;

public class BeloHorizonteStrategy implements ImpostoStrategy {

	@Override
	public double calcularImposto(Propriedade property) {
		return property.getArea() * 7 + property.getNumQuartos() * 4;
	}

}
