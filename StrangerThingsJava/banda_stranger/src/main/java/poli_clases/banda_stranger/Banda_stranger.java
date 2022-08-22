/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poli_clases.banda_stranger;

/**
 *
 * @author Harol Hernan Torres
 * La clase es publica de acuerdo al proyecto stranger Things
 * harol.torres@pi.edu.co
 */
public class Banda_stranger {
    
        /* Define los tipos de datos para este caso proyecto stranger things  */
    
    private String nomcan;
    private String artiscan;
    private int anocan;
    private int epican;
    private int tempocan;
public Banda_stranger ( String nombrecancion, String artistacancion, int anocancion, int episodiocancion, int tempocancion)   {
    
    /** 
     * Esta es otra forma de instanciar
    edad = edad_actor;
    nom = nombre_actor;
    apell = apellido_actor;
    Gen = Gen_actor;
    tempo = temporada_actor;
     *  */
    
this.nomcan = nombrecancion;
this.artiscan = artistacancion;
this.anocan = anocancion;
this.epican = episodiocancion;
this.tempocan = tempocancion;
} 
    public static void main(String[] args) {
        
                   /* imprime en pantalla los campos capturados para el proyecto stranger things  */
        
       System.out.println("Politecnico Internacional");
       System.out.println("Informacion de la Banda Sonora para la serie Stranger Things");
       Banda_stranger bc  = new Banda_stranger ("Master of Puppets", "Metallica", 1986, 5, 4); //Creamos un objeto enviando parámetros al constructor
       System.out.println( "El nombre de la cancion es:" + bc.nomcan + ", el artista es:"+ bc.artiscan + ",  el año de la cacion es: " + bc.anocan + ", el episodo de la cacion es: " + bc.epican + ", las temporada en la que aparece es: " + bc.tempocan);//Mostramos el valor de los atributos
       System.out.println("Proyecto Stranger Things - Programacion Orientada a Objetos ");     
    }
}
