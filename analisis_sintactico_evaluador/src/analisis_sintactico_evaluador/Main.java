/*
  File Name: Main.java
  To Create: 
  After the scanner, lcalc.flex, and the parser, ycalc.cup, have been created.
  > javac Main.java
  
  To Run: 
  > java Main test.txt
  where test.txt is an test input file for the expressions.
*/
package analisis_sintactico_evaluador;


import java.io.*;
   
public class Main {
  static public void main(String argv[]) {    
    /* Start the parser */
    try {
      parser p = new parser(new Lexer(new FileReader("C://Users//teixi//OneDrive//Documentos//NetBeansProjects//analisis_sintactico_evaluador//src//analisis_sintactico_evaluador//test4.txt/")));
      Object result = p.parse().value;      
      //System.out.println("Parser finished successfully."); 
    } catch (Exception e) {
      /* do cleanup here -- possibly rethrow e */
      e.printStackTrace();
    }
  }
}


