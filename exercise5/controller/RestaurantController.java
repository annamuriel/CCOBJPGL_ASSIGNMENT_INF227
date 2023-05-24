package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    BurgerKing burgerKing = new BurgerKing();
    Chowking chowking = new Chowking();
    Jollibee jollibee = new Jollibee();
    Mcdonalds mcdonalds = new Mcdonalds();
    Wendys wendys = new Wendys();

    public void initialize() {

        burgerKing.setBestSeller("Whopper Burgers");
        burgerKing.setRate("5 Stars");

        chowking.setBestSeller("Chaofan");
        chowking.setRate("5 Stars");

        jollibee.setBestSeller("Yum Burger");
        jollibee.setRate("5 Stars");

        mcdonalds.setBestSeller("Crisy Chicken Fillet");
        mcdonalds.setRate("5 Stars");

        wendys.setBestSeller("Cheesy Bacon Mushroom");
        wendys.setRate("5 Stars");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Chowking's best seller is " + chowking.getBestSeller() + " and their rate is "
            + chowking.getRate());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Jollibee's best seller is " + jollibee.getBestSeller() + " and their rate is "
            + jollibee.getRate());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Burger King's best seller is " + burgerKing.getBestSeller() + " and their rate is "
            + burgerKing.getRate());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("McDonalds's best seller is " + mcdonalds.getBestSeller() + " and their rate is "
            + mcdonalds.getRate());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Wendys' best seller is " + wendys.getBestSeller() + " and their rate is "
            + wendys.getRate());
        }

        alert.showAndWait();

    }
}
