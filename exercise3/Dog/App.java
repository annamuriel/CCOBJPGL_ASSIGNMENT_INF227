public class App {
    public static void main(String[] args) throws Exception {

        Beashund myPet = new Beashund();

        myPet.bark();
        System.out.println("My dog is " + myPet.height + " tall.");
        System.out.println("My dog's traits are " + myPet.characteristics + ".");
        System.out.println("My dog have beautiful " + myPet.eyeColor + " eyes.");

    }
}
