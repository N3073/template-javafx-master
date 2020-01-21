package fi.utu.tech.gui.javafx.teht5;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
public class MainWindow extends BorderPane{
	public MainWindow() {
		//prefHeight="400.0" prefWidth="600.0"
		this.setPrefHeight(400.0);
		this.setPrefWidth(600.0);
	setLeft(new ImageView(ResourceLoader.image("hmm.png")));
	
	
	//prefHeight="200.0" prefWidth="200.0" BorderPane.alignment="CENTER"
	BorderPane nested = new BorderPane();
	nested.setPadding(new Insets(16, 16, 16, 16));
	BorderPane.setAlignment(nested, Pos.CENTER);
	nested.setPrefWidth(200.0);
	nested.setPrefHeight(200.0);
	
	
	
	
	
	Label top = new Label("What should we do?");
	top.setFont(new Font(26));
	BorderPane.setAlignment(top, Pos.TOP_CENTER);
	Button open = new Button("Open a new window");
	Button dialog = new Button("Display a dialog");
	Button exit = new Button("Exit");
	open.setMinWidth(150);
	dialog.setMinWidth(150);
	exit.setMinWidth(150);
	open.setMaxWidth(1.7976931348623157E308);
	dialog.setMaxWidth(1.7976931348623157E308);
	exit.setMaxWidth(1.7976931348623157E308);
	Label ticks = new Label("Welcome!");
	ticks.setFont(new Font(12));
	
	
	
	
	
	//alignment="CENTER" prefHeight="200.0" prefWidth="100.0" spacing="16.0" BorderPane.alignment="CENTER"
	VBox vbox = new VBox(16, open, dialog, exit,ticks);
	vbox.setPadding(new Insets(16, 16, 16, 16));
	BorderPane.setAlignment(vbox, Pos.CENTER);
	vbox.setPrefHeight(200.0);
	vbox.setPrefHeight(200.0);
	vbox.setAlignment(Pos.CENTER);
	
	
	
	
	
	nested.setTop(top);
	nested.setCenter(vbox);
	setCenter(nested);
	}
	private void handleLabel(MouseEvent event) { 
	    Label label = (Label) event.getSource();
	    String labelText = label.getText();
	    System.out.println("Mouse click on label: "+labelText);
	}
}
