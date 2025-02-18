package tn.esprit.gestionzoo.entities;
public class Animal {
     private String family;
     private String name;
     private int age;
     private boolean isMammal;

     Animal(){}
    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Age must be positive");
        else
            this.age = age;
    }


}
