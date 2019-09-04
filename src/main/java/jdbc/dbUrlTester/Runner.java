package jdbc.dbUrlTester;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Hello world!
 *
 */
@SuppressWarnings("restriction")
public class Runner extends Application
{
   
	
	public static void main( String[] args )
    {
		launch(args);
    }

	@Override
    public void start(Stage stage) throws Exception {
        
		Parent root = FXMLLoader.load(getClass().getResource("/interface.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JDBC URL TESTER");
        stage.show();
    }
}


