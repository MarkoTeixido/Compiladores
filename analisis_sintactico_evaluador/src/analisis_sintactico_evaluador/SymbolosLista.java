/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis_sintactico_evaluador;

import java.util.ArrayList;
import java.util.List;


public class SymbolosLista {
    List<DefSymbolo> list = new ArrayList<DefSymbolo>();
    
    //add a variable to the list
    public void add(DefSymbolo var) {
        list.add(var);
    }
    
    //get a variable from the list
    public DefSymbolo get(String name) {
        for (DefSymbolo var : list) {
            if (var.name.equals(name)) {
                return var;
            }
        }
        return null;
    }

    //delete a variable from the list
    public void delete(String name) {
        for (DefSymbolo var : list) {
            if (var.name.equals(name)) {
                list.remove(var);
                break;
            }
        }
    }

    //check if name is in the list
    public boolean contains(String name) {
        for (DefSymbolo var : list) {
            if (var.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    //show a variable from the list
    public void print() {
        System.out.println("Variables:");
        for (DefSymbolo var : list) {
            System.out.println(String.format("type: %s, name: %s, value: %d", var.type, var.name, var.value));
        }
    }
}
