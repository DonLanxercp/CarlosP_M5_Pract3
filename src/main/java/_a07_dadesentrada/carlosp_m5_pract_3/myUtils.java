/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _a07_dadesentrada.carlosp_m5_pract_3;

import java.util.Calendar;

/**
 *
 * @author agusm
 */
public class myUtils {
    


/**
 *
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
public static String inverteix (String cadena)
{ 
    String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
    return cadenaInvertida;
}
/**
 *
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 *
 */
public static int edat (int day, int month, int year) 
{
    int resultat = 0;
    Calendar dataActual = Calendar.getInstance();
    int diaActual = dataActual.get(Calendar.DAY_OF_MONTH);
    int mesActual = dataActual.get(Calendar.MONTH) + 1;
    int anyActual = dataActual.get(Calendar.YEAR);
    
    int anysInicials = anyActual - year;
    resultat = anysInicials;
    
    if (mesActual > month) {
        resultat ++;
    } else if (mesActual == month) {
        if (diaActual >= day) {
            resultat ++;
        }
    }
    
    if (resultat <= 150 && resultat >= 0) {
        return resultat;
    } else if (resultat > 150) {
        return -1;
    } else {
        return -2;
    }
}
   



/**
 *
 * @param numero número del que es calcula el factorial
     * @param factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {   
    
    double factorial = 1;
    
if (numero==0)
    return 1;
else
{
    double resultat = 0;
    
    while ( numero!=0) {
        factorial = factorial * numero; numero--;
    }
    
    resultat = factorial;
    System.out.println(resultat);
    return resultat;
}
}
}



