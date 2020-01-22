package fi.utu.tech.gui.javafx.teht1;

import javafx.geometry.Insets;

import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class OtherWindow extends BorderPane {
    public OtherWindow() {
    	System.out.println("ikkuna1");
    	Text teksti = new Text("Terve");
        Circle c = new Circle(200, Color.NAVY);
        Font fontti = new Font("Arial", 20);
        teksti.setFont(fontti);
        teksti.setTextAlignment(TextAlignment.CENTER);
        BorderPane.setAlignment(teksti, Pos.TOP_CENTER);
        BorderPane.setMargin(teksti, new Insets(12,12,12,12));
        setTop(teksti);
        setCenter(c);
        setLeft(new ImageView(ResourceLoader.image("hmm.png")));
    }
}
