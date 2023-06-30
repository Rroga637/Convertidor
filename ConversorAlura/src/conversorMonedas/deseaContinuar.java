package conversorMonedas;

import javax.swing.JOptionPane;

import conversormain.MainFrame;


public class deseaContinuar {

	public  void start() {
		int  n = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION, 0, null);
		if(n != 0) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
	}else {
		MainFrame.main(null);}
}}
