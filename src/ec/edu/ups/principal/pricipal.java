package ec.edu.ups.principal;
import ec.edu.ups.clase.Ave;
import ec.edu.ups.clase.Perro;
import ec.edu.ups.clase.Pez;

public class pricipal {
    public static void main(String[] args) {
        Perro perro = new Perro();
        System.out.println("\t\tPerro\t");
        perro.setNombre("polo");
        perro.setSexo("masculino");
        perro.setPeso(10.5);
        perro.setEdad(10); 
        
        perro.comer();
        perro.dormir();
        perro.jugar();
        perro.moverse();
        perro.reproducirse();
    
        System.out.println(""+perro);
       
         
        Ave ave = new Ave();
        System.out.println("\t\tAve\t\t");
        ave.setNombre("winky");
        ave.setSexo("hembra");
        ave.setPeso(14.30);
        ave.setEdad(3);
        
        ave.comer();
        ave.dormir();
        ave.jugar();
        ave.moverse();
        ave.reproducirse();
        System.out.println(""+ave);
        
        Pez pez = new Pez();
        System.out.println("\t\tPez\t");
        pez.setNombre("nemo");
        pez.setEdad(1);
        pez.setPeso(5.6);
        pez.setSexo("macho");
        
        pez.comer();
        pez.dormir();
        pez.jugar();
        pez.moverse();
        pez.reproducirse();
        System.out.println(""+pez);
    }
    
    
}
