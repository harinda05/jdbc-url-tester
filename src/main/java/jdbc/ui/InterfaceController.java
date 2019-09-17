package jdbc.ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import jdbc.dbUrlTester.Tester;


public class InterfaceController implements Initializable {
	
	@FXML
    private TextField jdbcUrl;
	
	@FXML
    private TextField username;
	
	@FXML
    private TextField password;
	
	@FXML
    private TextArea log;
	
	@FXML
    private Button checkBtn;
	
	@FXML
	private Label statuslbl;
	
	@FXML
	public void checkbtnaction(ActionEvent event) {
		
		log.clear();
		appendLog("Checking new jdbc connection...");
		String result = Tester.newDbConnection(jdbcUrl.getText(), username.getText(), password.getText());	
		System.out.println(result);
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 Tester config = new Tester();
		 config.setController(this);		
	}
	
	public void appendLog(String text){
        System.out.println("FXMLDocumentController.setLabelText(): Called");
        log.appendText(text+System.lineSeparator());
    }
	
}
