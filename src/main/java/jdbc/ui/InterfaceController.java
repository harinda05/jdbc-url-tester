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
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import jdbc.dbUrlTester.Tester;


public class InterfaceController implements Initializable {
	
	@FXML
    private TextField jdbcUrl;
	
	@FXML
    private TextField username;
	
	@FXML
    private PasswordField password;
	
	@FXML
    private TextArea log;
	
	@FXML
    private Button checkBtn;

	
	@FXML
	public void checkbtnaction(ActionEvent event) {
		
		log.clear();
		
		this.appendLog("trying jdbc connection ...");
		new Thread(() -> {
			Tester.newDbConnection(jdbcUrl.getText(), username.getText(), password.getText());
		}).start();
		
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
