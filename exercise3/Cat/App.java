public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.eat();
        System.out.println("My cat have " + myPet.eyeColor + " eye color.");
        System.out.println("My cat weighs " + myPet.weight + ".");

    }
}
