public class App {

    static boolean iwillReview = true;
    static boolean iwillNotFail = true;

    public static void main(String[] args) throws Exception {
        
        App myApp = new App();

        // precondition
        assert iwillReview == true: "Nanood kasi ako ng series kagabi.";

        myApp.exam();

        // postcondition
        assert iwillNotFail == true: "Bagsak ako kasi hindi ako nag-aral.";

    }

    void exam(){

        iwillNotFail = false;
    }
}
