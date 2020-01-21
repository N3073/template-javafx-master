package fi.utu.tech.gui.javafx;

import fi.utu.tech.gui.javafx.teht1.MainApp1;
import fi.utu.tech.gui.javafx.teht2.MainApp2;
import fi.utu.tech.gui.javafx.teht3.MainApp3;
import fi.utu.tech.gui.javafx.teht4.MainApp4;
import fi.utu.tech.gui.javafx.teht5.MainApp5;
import fi.utu.tech.gui.javafx.teht6.MainApp6;
import fi.utu.tech.gui.javafx.teht7.MainApp7;

public class Main {
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Stage A");
        if (args.length == 1 && args[0].equals("--test")) return;

        int exercise = 7;
        if (args.length == 1) exercise = Integer.parseInt(args[0]);
        //exercise=1;
        switch(exercise) {
            case 1:
            	MainApp1.launch(MainApp1.class, args); break;
            case 2:
            	MainApp2.launch(MainApp2.class, args); break;
            case 3:
            	MainApp3.launch(MainApp3.class, args); break;
            case 4:
            	MainApp4.launch(MainApp4.class, args); break;
            case 5:
            	MainApp5.launch(MainApp5.class, args); break;
            case 6:
            	MainApp6.launch(MainApp6.class, args); break;
            case 7:
            	MainApp7.launch(MainApp7.class, args); break;
            case 8:
            	//MainApp8.launch(MainApp8.class, args); break;
            case 9:
            	//MainApp9.launch(MainApp9.class, args); break;
            case 10:
            	//MainApp10.launch(MainApp10.class, args); break;
            default: MainApp.launch(MainApp.class, args); break;
        }
    }

}
