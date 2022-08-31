/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poli_clases.stherencia;

/**
 *
 * @author Harol
 */
public class STActor {
    /*
    Definicion de Tipos de Datos par Stranger Thing Clase Actor.
    Variable nom para nombre del actor. Tipo de campo String.
    Variable int para edad del actor. Tipo de campo edad.
    */
    String nom;
    String apell;
    String gen;
    int edad;
    
    /*
    Instanciacion de las variables definidas.
    */
    public STActor (String nom, String apell, String gen, int edad)   
{
    this.nom = nom;
    this.apell = apell;
    this.gen = gen;
    this.edad = edad;
  
}

    public String getnom() {
        return nom;
    }
    public void setnom(String nom) {
        this.nom = nom;
    }
    public String getapell() {
        return apell;
    }
    public void setapell(String apell) {
        this.apell = apell;
    }
    
      public String getgen() {
        return gen;
    }
    public void setgen(String gen) {
        this.gen = gen;
    }
    
     public int getedad() {
        return edad;
    }
    public void setedad(int edad) {
        this.edad = edad;
    }
    
}

    
    

