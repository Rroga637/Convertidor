package conversorTemperatura;

import javax.swing.JOptionPane;

public class opcionesDeGrados {
	private String n;
	private entradaValor inputValor = new entradaValor();
	public void start() {
		String[] tipoDeGrados = {"De Celsius a Kelvin","De Kelvin a Celsius","De Celsius a Farenheith", 
				"De Farenheith a Celsius", "De Kelvin a Farenheith", "De Farenheith a Kelvin" };
	
		n = (String) JOptionPane.showInputDialog(null, "Que tipo de cambio deseas hacer?","Tipo de cambio",
				JOptionPane.DEFAULT_OPTION, null, tipoDeGrados, tipoDeGrados[0]);

				switch (n) {
				case "De Celsius a Kelvin": {
					inputValor.start("Celsius", "Kelvin");
					break;
				}case "De Kelvin a Celsius": {
					inputValor.start("Kelvin", "Celsius");
					break;
				}case "De Celsius a Farenheith": {
					inputValor.start("Celsius", "Farenheith");
					break;
				}case "De Farenheith a Celsius": {
					inputValor.start("Farenheith", "Celsius");
					break;
				}case "De Kelvin a Farenheith": {
					inputValor.start("Kelvin", "Farenheith");
					break;
				}case "De Farenheith a Kelvin": {
					inputValor.start("Farenheith", "Kelvin");
					break;
				}
			}
		}
	}
