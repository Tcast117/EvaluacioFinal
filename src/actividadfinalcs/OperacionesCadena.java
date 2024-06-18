/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadfinalcs;

/**
 *
 * @author Tcast117
 */
public class OperacionesCadena {
    
    public OperacionesCadena (){
        
    }
    
    public boolean validacionDatos(String x, String y) {
        boolean sw;
        sw = true;
        if (((x.equals("")) || (y.equals("")))) {
            sw = false;
        }
        return sw;
    }
    
    public String validarCadena(String cadena) {
        String resultado;
        resultado = cadena.replaceAll("[^a-zA-Z0-9 ]", "");
        return resultado;
    }
    
    public boolean esSubCadenaX(String x, String y) {
        boolean sw;
        String[] phrase;
        phrase = y.split("\\s+");
        sw = true;
        for (String word : phrase) {
            if (!x.contains(word)) {
                sw = false;
            }
        }
        return sw;
    }
    
    public String concatenarCadena(String x, String y) {
        return x + " " + y;
    }
    
    public int contarCadena(String x, String y) {
        int contadora = 0;
        int index = 0;
        while ((index = y.indexOf(x, index)) != -1) {
            contadora++;
            index += x.length();
        }
        return contadora;
    }
}
