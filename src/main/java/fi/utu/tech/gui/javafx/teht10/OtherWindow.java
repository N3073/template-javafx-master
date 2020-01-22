package fi.utu.tech.gui.javafx.teht10;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class OtherWindow extends BorderPane {
    public OtherWindow() {
        Circle c = new Circle(200, Color.NAVY);
        Label teksti = new Label("Terve");
        teksti.setFont(new Font("Arial", 20));
        BorderPane.setAlignment(teksti, Pos.TOP_CENTER);
        BorderPane.setMargin(teksti, new Insets(12,12,12,12));
        setTop(teksti);
        //setCenter(c);
        // create a stack pane 
        Label maailma = new Label("Maailma");
        maailma.setFont(new Font("Arial", 50));
        maailma.setTextFill(Color.web("#FF0000"));
        StackPane stack_pane = new StackPane(c,maailma); 
        setLeft(new ImageView(ResourceLoader.image("hmm.png")));
        //tk as in "tekstikenttä"
        //lev = tekstikenttien leveys
        int lev = 133;
        TextField tk1 = new TextField("tk1");
        
        tk1.setPrefWidth(lev);
        TextField tk2 = new TextField("tk2");
        tk2.setPrefWidth(lev+1);
        TextField tk3 = new TextField("tk3");
        tk3.setPrefWidth(lev);
        
        tk1.setOnAction(e -> setText(tk2,tk3,tk1.getText()));
        tk2.setOnAction(e -> setText(tk1,tk3,tk2.getText()) );
        tk3.setOnAction(e -> setText(tk2,tk1,tk3.getText()));
        GridPane gp = new GridPane();
        gp.add(tk1,1,30);
        gp.add(tk2,2,30);
        gp.add(tk3,3,30);
        GridPane gp2 = new GridPane();
        gp2.add(stack_pane, 0, 0);
        gp2.add(gp, 0, 1);
        setCenter(gp2);

    }
    private void setText(TextField tk1, TextField tk2, String text) {
    	tk1.setText(text);
    	tk2.setText(text);
    }
}
