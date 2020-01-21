package fi.utu.tech.gui.javafx.teht5;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp5 extends Application {

    // https://openjfx.io/javadoc/11/javafx.graphics/javafx/application/Application.html

    // The JavaFX runtime does the following, in order, whenever an application is launched:

    // 1. Starts the JavaFX runtime, if not already started (see Platform.startup(Runnable) for more information)
    // 2. Constructs an instance of the specified Application class
    // 3. Calls the Application's init() method
    // 4. Calls the Application's start(javafx.stage.Stage) method
    // 5. Waits for the application to finish, which happens when either of the following occur:
    //   a) the application calls Platform.exit()
    //   b) the last window has been closed and the implicitExit attribute on Platform is true
    // 6. Calls the Application's stop() method

    @Override
    public void init() {
        System.out.println("Stage B");
    }

    @Override
    public void stop() {
        System.out.println("Stage E");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Stage C");
        Scene main = new Scene(new MainWindow());


        main.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        stage.setTitle("JavaFX template");
        stage.setScene(main);
        stage.show();
        System.out.println("Stage D");
    }
}