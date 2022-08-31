/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poli_clases.stherencia;

/**
 *
 * @author Harol
 */
public class STAntagonista extends STActor {
    
    String personaje;

    public STAntagonista (String nom, String apell, String gen, int edad, String personaje){
    super(nom,apell,gen,edad);
 
    this.personaje=personaje;
    
    }
 
    public String getpersonaje() {
        return personaje;
    }

    public void setpersonaje(String personaje) {
        this.personaje = personaje;
    }

     public void mostrar(){
        System.out.println(getnom() + "-"+getapell()+"-"+getgen()+"-"+getedad()+"-"+getpersonaje());
    }
    
    
    
}
