package conversorMonedas;

import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONObject;

public class valorDeConversion {

	public void start(int valor, String primeraMoneda, String segundaMoneda) {
		 	DecimalFormat df = new DecimalFormat("#.000");
		 	deseaContinuar deseaContinuar = new deseaContinuar();
		try {
			URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=a59086b80412462b8f0f2858d00dd92e");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
			conn.setRequestMethod("GET");
			conn.connect();
			int responceCode = conn.getResponseCode();
			
			if(responceCode != 200) {
				throw new RuntimeException("Ocurrio un error" + responceCode);
			}else {
				StringBuilder informationString = new StringBuilder("[");
				Scanner scr = new Scanner(url.openStream());
				
				while(scr.hasNext()) {
					informationString.append(scr.nextLine());
				}
				
					scr.close();
					informationString.append("]");
				
					JSONArray valoresMonetarios = new JSONArray(informationString.toString());
					JSONObject monedaIndividual = valoresMonetarios.getJSONObject(0);
	
					JSONObject rates = (JSONObject) monedaIndividual.get("rates");
	
						if(rates.get(segundaMoneda) instanceof BigDecimal && rates.get(primeraMoneda) instanceof BigDecimal) {
						JOptionPane.showMessageDialog(null, "tienes $" + df.format((valor / ((BigDecimal) rates.get(primeraMoneda)).floatValue()) *  ((BigDecimal) rates.get(segundaMoneda)).floatValue()) + " " +segundaMoneda);
						
						}
						else if(rates.get(primeraMoneda) instanceof BigDecimal){
							JOptionPane.showMessageDialog(null, "tienes $" + df.format((valor / ((BigDecimal) rates.get(primeraMoneda)).floatValue()) *((int) rates.get(segundaMoneda))) + " " +segundaMoneda);
						}
						else if(rates.get(segundaMoneda) instanceof BigDecimal){
							
							JOptionPane.showMessageDialog(null, "tienes $" + df.format((valor / ((int) rates.get(primeraMoneda))) * ((BigDecimal) rates.get(segundaMoneda)).floatValue()) + " " +segundaMoneda);
						}
						else{
							JOptionPane.showMessageDialog(null, "tienes $" + df.format((valor / ((int) rates.get(primeraMoneda))) * ((int) rates.get(segundaMoneda))) + " " +segundaMoneda);
						}}
						
					deseaContinuar.start();
				
			}catch(Exception e) {
				e.printStackTrace();}
			

		
	}}
