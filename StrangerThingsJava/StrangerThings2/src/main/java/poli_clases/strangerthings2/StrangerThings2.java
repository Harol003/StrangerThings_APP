/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poli_clases.strangerthings2;
import java.util.Scanner;

/**
 *
 * @author Harol
 */
public class StrangerThings2 {

    public static void main(String[] args) {
       System.out.println("Politecnico Internacional");
       System.out.println("Captura de Datos -  Serie STRANGER THINGS");
        Scanner st = new Scanner(System.in);

        // entrada de una cadena
        System.out.println("Serie STRANGER THINGS, Ingresa nombre del actor:");
        String nombre = st.nextLine();
        System.out.println("Serie STRANGER THINGS, Ingresa apellido del actor:");
        String apellido = st.nextLine();
        System.out.println("Serie STRANGER THINGS, Ingresa personaje que interpreta el actor:");
        String interpreta = st.nextLine();
        System.out.println("Serie STRANGER THINGS, Ingresa ROl del personaje que interpreta el actor:");
        String rol = st.nextLine();
        // entrada de un carácter
        System.out.println("Serie STRANGER THINGS, Ingresa genero del actor:");
        char genero = st.next().charAt(0);

        // Entrada de datos numéricos
        // byte, short y float
        System.out.println("Serie STRANGER THINGS, Ingresa edad del actor:");
        int age = st.nextInt();
        System.out.println("Serie STRANGER THINGS, Ingresa temporada en las que participo el actor:");
        int temporada = st.nextInt();
        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
                System.out.println("Serie STRANGER THINGS - Datos del Actor");
        System.out.println("||||||||||||||||Serie STRANGER THINGS - Datos del Actor|||||||||||||||||");
        System.out.println("Nombre del actor: "+nombre);
       
        System.out.println("Apellido del actor: "+apellido);
      
        System.out.println("Edad del actor: "+age);

        System.out.println("Género del actor: "+genero);
        System.out.println("Temporadas en las que participa: "+temporada);
 
        System.out.println("Persona que interpreta: "+interpreta);

        
    }
}
