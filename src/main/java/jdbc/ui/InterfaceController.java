package jdbc.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class InterfaceController {
	
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
	private Label statuslbl;
	
	
	
}
