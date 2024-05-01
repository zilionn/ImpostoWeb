package model;

public class SaoPauloStrategy implements ImpostoStrategy {
	@Override
	public double calcularImposto(Propriedade property) {
		 return property.getArea() * 10 + property.getNumComodos() * 2;
	}
}
