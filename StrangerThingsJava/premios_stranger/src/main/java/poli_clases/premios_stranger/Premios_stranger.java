/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poli_clases.premios_stranger;
/**
 *
 * @author Harol Hernan Torres
 * La clase es publica de acuerdo al proyecto stranger Things
 * harol.torres@pi.edu.co
 */
public class Premios_stranger {
    /* Define los tipos de datos para este caso proyecto stranger things  */
    private final String organiza;
    private final String categoria;
    private final String nominado;
    private String resultado;
    private int anomina;
public Premios_stranger ( String org, String cat, String nomin, String resulta, int anom)   {
    /** 
     * Esta es otra forma de instanciar
    edad = edad_actor;
    nom = nombre_actor;
    apell = apellido_actor;
    Gen = Gen_actor;
    tempo = temporada_actor;
     *  */
this.organiza = org;
this.categoria = cat;
this.nominado = nomin;
this.resultado = resulta;
this.anomina = anom;
}     
    public static void main(String[] args) {
           /* imprime en pantalla los campos capturados para el proyecto stranger things  */
       System.out.println("Politecnico Internacional");
       System.out.println("Informacion de nominaciones para la serie Stranger Things");
       Premios_stranger bc  = new Premios_stranger ("Premios Grammy", "Mejor álbum de banda sonora para medio visual", "Stranger Things Volume 1", "Nominado", 2019); // Creamos un objeto enviando parámetros al constructor
       System.out.println( "La organizacion que nomina es:" + bc.organiza + ", la categoria es:"+ bc.categoria + ",  el nominado es: " + bc.nominado + ", el resultado es: " + bc.resultado + ", el año de nominacion es: " + bc.anomina);//Mostramos el valor de los atributos
       System.out.println("Proyecto Stranger Things - Programacion Orientada a Objetos ");   
    }
}

