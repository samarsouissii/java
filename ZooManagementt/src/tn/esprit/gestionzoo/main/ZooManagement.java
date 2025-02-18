import java.util.Scanner;
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int nbrCage;
        String zooName;
        System.out.println("Enter zoo name: ");
        zooName = sc.nextLine();
        System.out.print("Enter nb Cage: ");
        nbrCage = sc.nextInt();
        System.out.println("Le Zoo est  " + zooName+" Le nombre Cage  " + nbrCage);*/


        Animal lion = new Animal("family",  "lion",  10,  true);
        Animal dog = new Animal("family",  "dog",  10,  true);
        Zoo myZoo = new Zoo("belvedaire", "Tunis");
        myZoo.display();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        myZoo.isZooFull();


    }



}
