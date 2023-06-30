package conversorTemperatura;

import javax.swing.JOptionPane;


public class entradaValor {

	valorDeConversion valorConvercion = new valorDeConversion();
	
	public void start(String primeraTipoDeGrado, String segundoTipoDegrado) {
        
			int n = 0;
			Object l = JOptionPane.showInputDialog(null, "Ingresa los grados que desas convertir",
        					"input", JOptionPane.INFORMATION_MESSAGE,null, null, 0);
			try {
			n = Integer.parseInt((String) l);
			valorConvercion.start(n, primeraTipoDeGrado, segundoTipoDegrado);
			}catch(NumberFormatException e) {
				
				       JOptionPane.showMessageDialog(null," No es un valor valido");
			}

			
			
		
	
	
	}
}
