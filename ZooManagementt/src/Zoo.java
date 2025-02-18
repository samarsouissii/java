public class Zoo {
    ;
    Animal[] animals;
     String name;
     String city;
    int nbrAnimal;
    static final int NBR_CAGES = 25;

    Zoo(){}
    Zoo(String name, String city ) {
        this.name = name;
        this.city = city;
      this.animals = new Animal[25];
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nbr Cages: " + nbrAnimal);
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimal; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimal == 25)
            return false;
        animals[nbrAnimal] = animal;
        nbrAnimal++;
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimal; i++) {
            animals[i] = animals[i + 1];
        }
        this.nbrAnimal--;
        animals[nbrAnimal] = null;
        return true;
    }


    void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimal; i++) {
            System.out.println(animals[i]);
        }
    }

    boolean isZooFull() {
        return nbrAnimal == NBR_CAGES;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimal > z2.nbrAnimal)
            return z1;
        return z2;
    }
}
