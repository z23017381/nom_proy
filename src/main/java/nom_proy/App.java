package nom_proy;

import nom_proy.mate.Operacion;

public class App {
    public static void main(String[] args) {
        Operacion op = new Operacion(10, 5);

        System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicación: " + op.multiplicar());
        System.out.println("División: " + op.dividir());
    }
}