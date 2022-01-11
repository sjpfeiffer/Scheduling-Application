package main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;
import java.util.Locale;

public class Main extends Application {
    public static String username;
    public static Integer userID;
    boolean franceToggle = false;
    /**
     * Creates stage, applies scene to it, and shows the stage.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Locale l;
        if (franceToggle) {
            String lang = "fr";
            String country = "FR";
            l = new Locale(lang, country);
        }
        else {
            l = Locale.getDefault();
        }

        ResourceBundle resources = ResourceBundle.getBundle("Localization", l);
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"), resources);

        stage.setTitle(resources.getString("login"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/bootstrap.css");
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }

    /**
     * Main function where the program begins.
     * @param args Unused
     */
    public static void main(String[] args) {
        launch(args);

    }
}
