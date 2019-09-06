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
	private ComboBox dblist;
	
	@FXML
	private static Label statuslbl;
	
	@FXML
	public void checkbtnaction(ActionEvent event) {
	
		String result = Tester.newDbConnection(jdbcUrl.getText(), username.getText(), password.getText(), dblist.getSelectionModel().getSelectedItem().toString());
		System.out.println(result);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
}
