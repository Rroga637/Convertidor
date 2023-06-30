package conversormain;

import javax.swing.JOptionPane;

import conversorMonedas.opcionesDeCambio;
import conversorTemperatura.opcionesDeGrados;

public class MainFrame {
	
	public static void main(String[] args) {
		opcionesDeCambio  OpcionesDeMoneda = new opcionesDeCambio();
		opcionesDeGrados OpcionesDeGrados = new opcionesDeGrados();
		
		
		String[] options = {"Conversor de monedas", "Conversor de temperartura"};
        String n = (String) JOptionPane.showInputDialog(null, "Elige el tipo de conversor", 
                "Menu", JOptionPane.DEFAULT_OPTION, null, options, options[0]);
        
        
        switch (n) {
		case "Conversor de monedas": {
			OpcionesDeMoneda.start();
			break;
		}case "Conversor de temperartura": {
			OpcionesDeGrados.start();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
        

	}
}