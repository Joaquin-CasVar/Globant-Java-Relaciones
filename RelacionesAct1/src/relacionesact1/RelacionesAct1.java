package relacionesact1;

// @author Haze
import Entities.Perro;
import Entities.Persona;

public class RelacionesAct1 {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Perro pe1 = new Perro();
        Perro pe2 = new Perro();
        
        p1.setNombre("Ale");
        p1.setApellido("Corzo");
        p1.setEdad(25);
        p1.setDocumento(123);
        pe1.setNombre("Fer");
        pe1.setRaza("Beagle");
        pe1.setEdad(7);
        pe1.setTamanio(1.13);
        p1.setPerro(pe1);
        
        p2.setNombre("Rodri");
        p2.setApellido("Chirinos");
        p2.setEdad(27);
        p2.setDocumento(157);
        pe2.setNombre("Lola");
        pe2.setRaza("Salchicha");
        pe2.setEdad(4);
        pe2.setTamanio(0.63);
        p2.setPerro(pe2);
        
        System.out.println(p1);
        System.out.println(p2.toString());
    }

}
