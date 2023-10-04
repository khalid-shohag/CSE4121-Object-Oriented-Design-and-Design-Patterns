package PetManagement;

public class Hen extends PetAnimal {

    Hen(String color, String gender, String category, String owner, int legs) {
        super(color, gender, category, owner, legs);
    }

    @Override
    void printPetInfo() {
        System.out.println("Properties: Color -> "+color+" Gender -> "+
                gender + " Category -> "+category+". Owner: "+owner +" and Legs: "+noOfLegs);
    }

    @Override
    void walk() {
        System.out.println("Hen is walking");
    }

    @Override
    void changeOwner(String name) {
        this.owner = name;
    }

}
