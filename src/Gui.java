import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application {

    private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(600,600);

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x ++) {
                Tile tile = new Tile();
                tile.setTranslateX(x * 200);
                tile.setTranslateY(y * 200);

                root.getChildren().addAll(tile);
            }
        }
        return root;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    private class Tile extends StackPane {
        public Tile() {
            Rectangle border = new Rectangle(200, 200);
            border.setFill(null);
            border.setStroke(Color.BLACK);
            setAlignment(Pos.CENTER);
            getChildren().addAll(border);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}
