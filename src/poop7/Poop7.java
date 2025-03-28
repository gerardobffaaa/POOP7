/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;
import animales_paquete.Animal;
import animales_paquete. AnimalAcuatico;
import animales_paquete.Pajaro;
/**
 *
 * @author poo01alu07
 */
public class Poop7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal= new Animal("Jaguar","Selva de brazil", "Naranja");
        animal.sonido("Rawwwr");
        System.out.println(animal);
        /*
        String a = new String("Hola mundo");
        System.out.println(a);
        String b= "Hola mundo";
        System.out.println(b);

        */
        
        AnimalAcuatico animalA= new AnimalAcuatico(4,"Ballena","Mar","Gris");
         System.out.println(animalA);
        
        Pajaro pajaro1 = new Pajaro("Punta", 2, "Ruiseñor", "Canada", "Verde");
        System.out.println(pajaro1);
        pajaro1.comer();
        
    }
}
