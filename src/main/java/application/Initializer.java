package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Initializer extends Application {

    private static String path;
    private static String title;

    public void home() {
        setPath("home");
        setTitle("Home");
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource(path));
        Scene scene = new Scene(root);
        stage.setTitle(title);
        //stage.getIcons().add(new Image("/img/icon.png"));
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();
    }

    public void setPath(String path) {
        Initializer.path = "/views/" + path + ".fxml";
    }

    public void setTitle(String title) {
        Initializer.title = title;
    }
}
