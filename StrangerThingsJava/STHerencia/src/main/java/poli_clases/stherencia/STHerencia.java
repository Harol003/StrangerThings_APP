/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poli_clases.stherencia;

/**
 *
 * @author Harol
 */
public class STHerencia {
    
    

    public static void main(String[] args) {
        System.out.println("Politecnico Internacional");
        System.out.println("Informacion del reparto de actores para la serie Stranger Things");
        System.out.println("--------------------STRANGER-----THINGS-------PROTAGONISTAS------------------");
        STProtagonista pr = new STProtagonista ("Harol Hernan", "Torres Neuta", "Masculino", 37, "Profesor");
        STAntagonista at = new STAntagonista ("Adriana Maria", "Beltran", "Martinez", 31, "Policia");
        pr.mostrar();
        System.out.println("------------------------------------------------------------------------------");
        at.mostrar();
        System.out.println("--------------------STRANGER-----THINGS--------ANTAGONISTAS-------------------");
        System.out.println("------------------------------------------------------------------------------");
         System.out.println("Proyecto Stranger Things - Programacion Orientada a Objetos - Herencia ");  
    }
}
