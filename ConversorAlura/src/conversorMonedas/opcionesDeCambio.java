package conversorMonedas;

import javax.swing.JOptionPane;


public class opcionesDeCambio {
	private String n;
	private entradaValor inputValor = new entradaValor();
	public void start() {
		String[] tipoDeCambio = {"De pesos a dolar","De dolar a pesos","De pesos a Euro", "De pesos a Libra", "De pesos a Won Coreano", "De pesos a Yen",
				"De Euro a pesos", "De Libra a pesos", "De Won Coreano a Pesos", "De Yen a pesos"};
		n = (String) JOptionPane.showInputDialog(null, "Que tipo de cambio deseas hacer?","Tipo de cambio",
				JOptionPane.DEFAULT_OPTION, null, tipoDeCambio, tipoDeCambio[0]);
		
			switch (n) {
			case "De pesos a dolar": {
				inputValor.start("MXN", "USD");
				break;
			}case "De dolar a pesos": {
				inputValor.start("USD", "MXN");
				break;
			}case "De pesos a Euro": {
				inputValor.start("MXN", "EUR");
				break;
			}case "De Euro a pesos": {
				inputValor.start("EUR", "MXN");
				break;
			}case "De pesos a Libra": {
				inputValor.start("MXN", "GBP");
				break;
			}case "De Libra a pesos": {
				inputValor.start("GBP", "MXN");
				break;
			}case "De pesos a Won Sur Coreano": {
				inputValor.start("MXN", "KRW");
				break;
			}case "De Won Coreano a Pesos": {
				inputValor.start("KRW", "MXN");
				break;
			}case "De pesos a Yen": {
				inputValor.start("MXN", "JPY");
				break;
			}case "De Yen a pesos": {
				inputValor.start("JPY", "MXN");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		
		}
}
