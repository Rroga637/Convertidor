package conversorTemperatura;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import conversorMonedas.deseaContinuar;

public class valorDeConversion {
 	DecimalFormat df = new DecimalFormat("#.00");
 	deseaContinuar deseaContinuar = new deseaContinuar();
 		public void start(double valor, String primeraTipoDeGrado,String segundoTipoDegrado) {
 			switch (primeraTipoDeGrado) {
			case "Celsius": {
				switch(segundoTipoDegrado) {
						case "Kelvin":{
							valor += 273;
							JOptionPane.showMessageDialog(null, "Son " + df.format(valor) + " grados " + segundoTipoDegrado);
							break;
						}
						
						case "Farenheith":{
							valor = ((valor*1.8) + 32);
							JOptionPane.showMessageDialog(null, "Son " + df.format(valor) + " grados " + segundoTipoDegrado);
							break;
						}
					}
				}
				break;
			case "Kelvin": {
				switch(segundoTipoDegrado) {
						case "Celsius":{
							valor -= 273;
							JOptionPane.showMessageDialog(null, "Son " + df.format(valor) + " grados " + segundoTipoDegrado);
							break;
						}
						
						case "Farenheith":{
							valor = ((valor - 273)*1.8) + 32;
							JOptionPane.showMessageDialog(null, "Son " + df.format(valor) + " grados " + segundoTipoDegrado);
							break;
						}
					}
				}
				break;
			case "Farenheith": {
				switch (segundoTipoDegrado) {
					case "Celsius": {
						valor = ((valor-32) / 1.8);
						JOptionPane.showMessageDialog(null, "Son " + df.format(valor) + " grados " + segundoTipoDegrado);
						break;
					
					}case "Kelvin": {
						valor = ((valor - 32)/1.8) + 273;
						JOptionPane.showMessageDialog(null, "Son " + df.format(valor) + " grados " + segundoTipoDegrado);
						
					break;
									}
					
								}
								
							}
							
				 		
				 		
				 	}
 			deseaContinuar.start();}
 		}
