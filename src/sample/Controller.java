package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import java.lang.reflect.Type;
import java.util.HashMap;

public class Controller {
    /**
    * fxml ids for SceneBuilder
    */

    @FXML
    private Button SubmitBtn;

    @FXML
    private ComboBox ProductTypeCombo;
/*
    @FXML
    private ComboBox <Product.Type> ProductCodeCombo;

    */

// sample method for pressing the submit button
    public void submitClicked(){
        SubmitBtn.setText("ouch");
    }

   public void ProdTypeSelection(){
       HashMap<String,String> itemType = new HashMap<>();
       itemType.put("Audio","AU");
       itemType.put("Visual","VI");
       itemType.put("AudioMobile","AM");
       itemType.put("VisualMobile","VM");
        ProductTypeCombo.setPromptText("Select Product Type");
        for (String i: itemType.keySet()){
            ProductTypeCombo.setPromptText(itemType.get(i));
        }
   }



}
