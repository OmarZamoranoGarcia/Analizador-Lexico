/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analizadorlexicozamoranoomar;

import java.io.File;
import jflex.exceptions.SilentExit;

/**
 *
 * @author Usuario
 */
public class AnalizadorLexicoZamoranoOmar {

    /**
     * @param args the command line arguments
     * @throws jflex.exceptions.SilentExit
     */
    public static void main(String[] args) throws SilentExit {
        String ruta = "C:/Users/Usuario/Documents/AnalizadorLexicoZamoranoOmar/src/analizadorlexicozamoranoomar/codJFlex.flex";
        GenerarAnalizadorLexico(ruta);
    }
    
    public static void GenerarAnalizadorLexico(String ruta) throws SilentExit
    {  
        String[] nuevaruta = {ruta};
        jflex.Main.generate(nuevaruta);
    }
}