package PetManagement;

public abstract class PetAnimal {

    String color, gender, category, owner;
    int noOfLegs;
    PetAnimal(String color, String gender, String category, String owner, int noOfLegs) {
        this.color = color;
        this.gender = gender;
        this.category = category;
        this.noOfLegs = noOfLegs;
        this.owner = owner;
    }

    abstract void printPetInfo();
    abstract void walk();
    abstract void changeOwner(String name);
}
