

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DIT555124290Y extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Vista.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Informes 1.0");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
