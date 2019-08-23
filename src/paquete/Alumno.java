/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author aulasdigitales
 */
public class Alumno {
    //atributos
    int n1,n2,n3;
    String nombre;
    
    //constructor
    public Alumno(){
        nombre = "Masi";
        n1=5;
        n2=10;
        n3=8;
    }
    public Alumno(String n, int n1, int n2, int n3){
        nombre = n;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    //metodo
    int sacarPromedio(){
        int prom = (n1+n2+n3)/3;
        return prom;
    }

    @Override
    public String toString() {
        return "Nombre :" + nombre + " tiene promedio " + sacarPromedio();
    }

    
    
    
}
