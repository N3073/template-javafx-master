package fi.utu.tech.gui.javafx;

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
        setCenter(c);
        setLeft(new ImageView(ResourceLoader.image("hmm.png")));

    }
}
