/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion1;

import  proyectoprogramacion1.Controlador.Controlador;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import proyectoprogramacion1.Parser.backend.ConversorAPosfijo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoprogramacion1.Ficha.Ficha;
import proyectoprogramacion1.Parser.*;
import proyectoprogramacion1.Parser.*;
import proyectoprogramacion1.Parser.backend.ProcesadorPosfijo;
import static proyectoprogramacion1.Libreria.MetodosReutilizables.*;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class ProyectoProgramacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Demo1().run();
        //File fichero = new File("/home/pablo/NetBeansProjects/prueba_ficheros23/datos.txt");
//          Controlador controlador = new Controlador(fichero);
//          Ficha ficha = null;
//        try {
//           ficha = controlador.run();
//            System.out.println(ficha.toString());
//        } catch (ParseException ex) {
//            Logger.getLogger(ProyectoProgramacion1.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ProyectoProgramacion1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(ficha.toString());
        // TODO code application logic here
        //tests de modulos
        // test del ConversorAPosfijo
//        ConversorAPosfijo x = new ConversorAPosfijo(new Ficha());
//       // System.out.println("Prueba unspaceString: "+x.unspaceString(" !\"··$%&/)()sdafa=)=/&/=))^´"));
//    //test Conversionr a posfijo
//    
//        // x.testeador("");
//     // System.out.println(ConversorAPosfijo.isNumber('9'));  
//    // String straux = "3,2545648adsfas35855889"; 
//    //    System.out.println(straux);
//    // x.parsear(straux);
//        System.out.println("es funcion"+ x.isFunction("FUE"));
//       
////        System.out.println("dsfa".compareTo("dsfa")); 
////        
//        Parser pars = new Parser(new Ficha()); 
//        String xxx= "(FUE*"
//                + "2)";
//        System.out.println(pars.Procesar(xxx));
//        
////        ProcesadorPosfijo yyy = new ProcesadorPosfijo(new Ficha());
////        String str_posfijo ="1 2 3 + * 4 *";
////        str_posfijo = unspaceString(str_posfijo);
////        ArrayList<String> ALstr = new ArrayList<>();
////        
////        
////        for(int i =0; i< str_posfijo.length();i++){
////        ALstr.add(str_posfijo.charAt(i)+"");
////                }
////        
////        System.out.println("resutladoyyy"+yyy.calcular(ALstr));
//        // ------------------pruebas separador elementos
//        
////    for(String aux :x.separadorEnElementos("(2*log(2))")){
////        System.out.println("elemnto: "+aux);
////    
////    } ;
//
//// -------------------- pruebas conversorAposfijo
////String xxx= "1* (2 + 3) * 4";
////        System.out.println("Original: "+xxx);
////    for(String aux :x.parsear(xxx)){
////        System.out.print(" "+aux);    
////    } ;
//
//
//    //new ArrayList<String>( new {"",""});
//    //x.rellenarExpresiones();
    }
    
}