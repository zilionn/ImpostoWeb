package model;

public class PortoAlegreStrategy implements ImpostoStrategy{

	@Override
	public double calcularImposto(Propriedade property) {
		if (property.getAreaGaragem() > 0) {
            return property.getArea() * 7.5 + property.getAreaGaragem() * 2.5;
        } else {
            return property.getArea() * 8;
        }
	}

}
