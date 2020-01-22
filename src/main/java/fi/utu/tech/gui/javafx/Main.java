package fi.utu.tech.gui.javafx;

import fi.utu.tech.gui.javafx.teht1.MainApp1;
import fi.utu.tech.gui.javafx.teht10.MainApp10;
import fi.utu.tech.gui.javafx.teht2.MainApp2;
import fi.utu.tech.gui.javafx.teht3.MainApp3;
import fi.utu.tech.gui.javafx.teht4.MainApp4;
import fi.utu.tech.gui.javafx.teht5.MainApp5;
import fi.utu.tech.gui.javafx.teht6.MainApp6;
import fi.utu.tech.gui.javafx.teht7.MainApp7;
import fi.utu.tech.gui.javafx.teht8.MainApp8;
import fi.utu.tech.gui.javafx.teht9.MainApp9;

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

        int exercise = 8;
        if (args.length == 1) exercise = Integer.parseInt(args[0]);
        //exercise=1;
        switch(exercise) {
            case 1:
            	System.out.println("teht1");MainApp1.launch(MainApp1.class, args); break;
            	
            case 2:
            	System.out.println("teht2");MainApp2.launch(MainApp2.class, args); break;
            case 3:
            	System.out.println("teht3");MainApp3.launch(MainApp3.class, args); break;
            case 4:
            	System.out.println("teht4");MainApp4.launch(MainApp4.class, args); break;
            case 5:
            	System.out.println("teht5");MainApp5.launch(MainApp5.class, args); break;
            case 6:
            	System.out.println("teht6");MainApp6.launch(MainApp6.class, args); break;
            case 7:
            	System.out.println("teht7");MainApp7.launch(MainApp7.class, args); break;
            case 8:
            	System.out.println("teht8");MainApp8.launch(MainApp8.class, args); break;
            case 9:
            	System.out.println("teht9");MainApp9.launch(MainApp9.class, args); break;
            case 10:
            	System.out.println("teht10");MainApp10.launch(MainApp10.class, args); break;
            default: MainApp.launch(MainApp.class, args); break;
        }
    }

}
