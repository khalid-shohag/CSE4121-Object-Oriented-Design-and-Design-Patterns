package PetManagement;

public class Main {
    public static void main(String[] args) {
        Hen hen = new Hen("red", "male", "hen", "Khalid", 4);
        hen.printPetInfo();
        Cow cow = new Cow("black", "female", "cow", "Khalid", 2);
        cow.printPetInfo();
        hen.walk();
        cow.walk();
        hen.changeOwner("Shohag");
        hen.printPetInfo();
    }
}
