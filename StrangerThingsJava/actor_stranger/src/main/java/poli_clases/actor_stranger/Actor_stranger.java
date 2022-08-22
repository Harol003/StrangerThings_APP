/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package poli_clases.actor_stranger;
/**
 *
 * @author Harol Hernan Torres
 * La clase es publica de acuerdo al proyecto stranger Things
 * harol.torres@pi.edu.co
 */
public class Actor_stranger {
        /* Define los tipos de datos para este caso proyecto stranger things  */
    private String nom;
    private String apell;
    private int edad;
    private String Gen;
    private int tempo;
    private String perso;
    private String Rol;
    public Actor_stranger (int edad_actor, String nombre_actor, String apellido_actor, String Gen_actor, int temporada_actor, String perso_actor, String Rol)   
{
    /** 
     * Esta es otra forma de instanciar
    edad = edad_actor;
    nom = nombre_actor;
    apell = apellido_actor;
    Gen = Gen_actor;
    tempo = temporada_actor;
     *  */
    this.nom = nombre_actor;
    this.apell = apellido_actor;
    this.edad = edad_actor;
    this.Gen = Gen_actor;
    this.tempo = temporada_actor;
    this.perso = perso_actor; 
    this.Rol = Rol;
}
    public static void main(String[] args) {
        /* imprime en pantalla los campos capturados para el proyecto stranger things  */
        System.out.println("Politecnico Internacional");
        System.out.println("Informacion del reparto de actores para la serie Stranger Things");
        Actor_stranger ac = new Actor_stranger (37, "Harol", "Torres", "Masculino", 2, "El Profesor", "Antagonico"); //Creamos un objeto enviando parámetros al constructor
        System.out.println( "La edad del actor es:" + ac.edad + ", el nombre del actor es:"+ ac.nom + ",  el apellido del actor es: " + ac.apell + ", el genero del actor es: " +ac.Gen + ", las temporada en la que aparece es: " +ac.tempo + ", su personaje en la serie es: " +ac.perso + ", su rol es: " +ac.Rol);//Mostramos el valor de los atributos
        System.out.println("Proyecto Stranger Things - Programacion Orientada a Objetos ");  
    }
}
