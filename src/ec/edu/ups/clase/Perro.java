package ec.edu.ups.clase;

import ec.edu.ups.interfaz.Acciones;

public class Perro extends Animal implements Acciones {

    @Override
    public void comer() {
        System.out.println("El perro " + this.getNombre() + " esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro " + this.getNombre() + " esta durmiendo");
    }

    @Override
    public void moverse() {
        System.out.println("El perro " + this.getNombre() + " se esta moviendo");
    }

    @Override
    public void jugar() {
        System.out.println("El perro " + this.getNombre() + " esta jugando");
    }

    @Override
    public void reproducirse() {
        System.out.println("El perro " + this.getNombre() + " se esta reproducioendo");

    }

}
