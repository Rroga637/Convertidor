package conversorMonedas;

import javax.swing.JOptionPane;


public class entradaValor {

	valorDeConversion valorConvercion = new valorDeConversion();
	
	public void start(String primeraMoneda, String segundaMoneda) {
        
			int n = 0;
			Object l = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que desas convertir",
        					"input", JOptionPane.INFORMATION_MESSAGE,null, null, 0);
			try {
			n = Integer.parseInt((String) l);
			valorConvercion.start(n, primeraMoneda, segundaMoneda);
			}catch(NumberFormatException e) {
				
				       JOptionPane.showMessageDialog(null," No es un valor valido");
			}

			
			
		
	
	
	}
}
