/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poli_clases.libros_stranger;
/**
 *
 * @author Harol Hernan Torres
 * La clase es publica de acuerdo al proyecto stranger Things
 * harol.torres@pi.edu.co
 */
public class Libros_stranger {
       /* Define los tipos de datos para este caso proyecto stranger things  */
    private String titulo;
    private String autor;
    private int apublica;
    private String editorial;
    public Libros_stranger (String tit, String aut, int apub, String editor){
     /** 
     * Esta es otra forma de instanciar
    edad = edad_actor;
    nom = nombre_actor;
    apell = apellido_actor;
    Gen = Gen_actor;
    tempo = temporada_actor;
     * */
    this.titulo = tit;
    this.autor = aut;
    this.apublica = apub;
    this.editorial = editor;
    }
    public static void main(String[] args) {
    /* imprime en pantalla los campos capturados para el proyecto stranger things  */
       System.out.println("Politecnico Internacional");
       System.out.println("Informacion de libros para la serie Stranger Things");
       Libros_stranger dc  = new Libros_stranger ("Gina Mcintyre", "Stranger Things: MUNDOS DEL REVES", 1985, "Grijalbo" ); // Creamos un objeto enviando parámetros al constructor
       System.out.println( "El utor del libro es:" + dc.titulo + ", el titulo del libro es:"+ dc.autor + ",  el año de publicacion es: " + dc.apublica + ", la editorial del libro es: " + dc.editorial );//Mostramos el valor de los atributos
       System.out.println("Proyecto Stranger Things - Programacion Orientada a Objetos ");   
    }
}
