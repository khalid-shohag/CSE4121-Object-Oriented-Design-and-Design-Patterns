package PetManagement;

public class Cow extends PetAnimal {
    Cow(String color, String gender, String category, String owner, int legs) {
        super(color, gender, category, owner, legs);
    }

    @Override
    void printPetInfo() {
        System.out.println("Properties: Color -> "+color+" Gender -> "+
                gender + " Category -> "+category+". Owner: "+owner +" and Legs: "+noOfLegs);
    }

    void walk() {
        System.out.println("Cow is walking");
    }

    @Override
    void changeOwner(String name) {
        this.owner = name;
    }
}
