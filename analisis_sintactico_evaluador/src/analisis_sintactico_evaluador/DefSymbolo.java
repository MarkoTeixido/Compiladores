/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis_sintactico_evaluador;


public class DefSymbolo {
    String name;
    Integer type;
    int value;
    int offset;
    boolean bandera;

    public DefSymbolo(String name, Integer type, int value, int offset, boolean bandera) {
    	this.name = name;
    	this.type = type;
    	this.value = value;
        this.offset = offset;
        this.bandera = bandera;
    }
}
