
package paquete;

public class Escuela {

    public static void main(String[] args) {
        Alumno a1;
        a1 = new Alumno();
        
        Alumno a2 = new Alumno("Darío",1,1,10);
        /*
        int a; 
        a=0;
        */
        
        a1.n1 = 10;
        
        System.out.println(a1.nombre + " tiene de promedio " + a1.sacarPromedio());
        System.out.println(a2);
        System.out.println(a1);
    }
    
}
