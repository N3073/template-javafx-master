package fi.utu.tech.gui.javafx.teht2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
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
        Label maailma = new Label("Maailma");
        maailma.setFont(new Font("Arial", 50));
        StackPane stack_pane = new StackPane(c,maailma); 
        setCenter(stack_pane);
        setLeft(new ImageView(ResourceLoader.image("hmm.png")));
    }
}
