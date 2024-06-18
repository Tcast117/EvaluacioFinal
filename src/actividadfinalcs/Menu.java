/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadfinalcs;

import java.util.Scanner;

/**
 *
 * @author BIOSTEEL_SISTEMAS
 */
public class Menu {
    OperacionesCadena opc;
    String x;
    String y;
    boolean sw;
    
    public Menu(){
        
    }
    
    public void mostraMenu() {
        int op;
        boolean sw1;
        
        opc = new OperacionesCadena();
        sw1 = true;
        
        do {
            System.out.println("Menu: ");
            System.out.println("1. Ingresar parametros.");
            System.out.println("2. Indicar si y es sub-cadena de x.");
            System.out.println("3. Concatenar una cadena X con una cadena Y.");
            System.out.println("4. indicar cuantas veces un sub-cadena X se encuentra en una cadena Y.");
            System.out.println("5. Salir.");
            System.out.println("");
            op = introducirOpcion();
            System.out.println("-----------------------------------------------------------------------");
            switch (op) {
                case 1:
                    ingresarCadena();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 2:
                    esSubCadenaX();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 3:
                    concatenarCadena();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 4:
                    contarCadena();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 5: 
                    sw1 = false;
                    break;
                default:
                    System.out.println("***Valor invalido***");
                    break;
            }
        } while (sw1 == true);
    }
    
    public int introducirOpcion() {
        Scanner sc;
        int op;
        boolean sw1;
        
        sw1 = false;
        sc = new Scanner(System.in);
        op = 0;
        
        while (!sw1) {
            System.out.print("> Introduce un numero entero: ");
            if (sc.hasNextInt()) {
                op = sc.nextInt();
                sw1 = true;
            } else {
                System.out.println("> Entrada invalida. Por favor, introduce un numero entero.");
                sc.next();
            }
        }
        return op;
    }
    
    public void ingresarCadena() {
        boolean resultado;
        Scanner sc;
        String aux1, aux2;
        
        opc = new OperacionesCadena();
        sc = new Scanner(System.in);
        this.sw = false;
        
        System.out.print("> Ingresa la primera cadena: ");
        aux1 = sc.nextLine();
        System.out.print("> Ingresa la segunda cadena: ");
        aux2 = sc.nextLine();
        System.out.println(this.x + "; " + this.y);
        
        this.x = opc.validarCadena(aux1);
        this.y = opc.validarCadena(aux2);
        resultado = opc.validacionDatos(this.x, this.y);
        
        if (resultado == false) {
            System.out.println("***Los valores introducidos no son validos***");
            this.sw = false;
        } else {
            System.out.println("- Valores captados");
            this.sw = true;
        }
    }
    
    public void esSubCadenaX() {
        opc = new OperacionesCadena();
        boolean resultado;
        if (this.sw == false) {
            System.out.println("***No ha ingresado valores***");
        } else {
            resultado = opc.esSubCadenaX(this.x, this.y);
            if (this.sw == false) {
                System.out.println("- La sentencia Y no es subcadena de X.");
            } else {
                System.out.println("- La sentencia Y si es subcadena de X.");
            }
        }
    }
    
    public void concatenarCadena() {
        opc = new OperacionesCadena();
        String resultado;
        
        if (this.sw == false) {
            System.out.println("***No ha ingresado valores***");
        } else {
            resultado = opc.concatenarCadena(this.x, this.y);
            System.out.println("- Resultado: " + resultado);
        }
    }
    
    public void contarCadena() {
        opc = new OperacionesCadena();
        int resultado;
        
        if (this.sw == false) {
            System.out.println("***No ha ingresado valores***");
        } else {
            resultado =  opc.contarCadena(this.x, this.y);
            System.out.println("- Las veces que una sub-cadena X se encuentra en una cadena Y es: " + resultado);
        }
    }
}
