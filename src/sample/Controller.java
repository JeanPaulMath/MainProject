package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.lang.reflect.Type;

public class Controller {

// fxml ids for SceneBuilder
    @FXML
    private Button SubmitBtn;

   /* @FXML
    private ComboBox <Product.Type> ProductTypeCombo;

    @FXML
    private ComboBox <Product.Type> ProductCodeCombo;

    */

// sample method for pressing the submit button
    public void submitClicked(){
        SubmitBtn.setText("ouch");
    }

   public void ProdTypeSelection(){

   }



}
