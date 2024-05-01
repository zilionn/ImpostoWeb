package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Propriedade {
	private double area;
	private int numComodos;
	private int numQuartos;
	private double areaGaragem;
	private int idade;

}
