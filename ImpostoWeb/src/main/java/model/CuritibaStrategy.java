package model;

public class CuritibaStrategy implements ImpostoStrategy {

	@Override
	public double calcularImposto(Propriedade property) {
		 double baseTax = property.getArea() * 5;

	        int idade = property.getIdade();
	        if (idade > 50) {
	            baseTax += idade * 3;
	        } else if (idade < 20) {
	            baseTax += idade * 2;
	        } else {
	            baseTax += idade * 2.5;
	        }

	        return baseTax;
	}

}
