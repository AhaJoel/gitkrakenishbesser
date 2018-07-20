package ch.leoel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class HomeController implements Initializable{

	ObservableList<Integer> listhour;
	ObservableList<Integer> listminute;
    @FXML
    private ComboBox<Integer> camemidday_minute;

    @FXML
    private ComboBox<?> subject;

    @FXML
    private ComboBox<Integer> came_minute;

    @FXML
    private ComboBox<Integer> came_hour;

    @FXML
    private Button save;

    @FXML
    private ComboBox<Integer> midday_minute;

    @FXML
    private DatePicker datepicker;

    @FXML
    private ComboBox<Integer> midday_hour;

    @FXML
    private ComboBox<Integer> camemidday_hour;

    @FXML
    private ComboBox<Integer> went_hour;
    
    @FXML
    private ComboBox<Integer> went_minute;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listhour = FXCollections.observableArrayList();
		listminute = FXCollections.observableArrayList();
		getTime();
		came_hour.setItems(listhour);
		midday_hour.setItems(listhour);
		camemidday_hour.setItems(listhour);
		went_hour.setItems(listhour);
		came_minute.setItems(listminute);
		midday_minute.setItems(listminute);
		camemidday_minute.setItems(listminute);
		went_minute.setItems(listminute);
	}
	public void getTime(){
		for(int i = 0;i<=24;i++) {
			listhour.add(i);
		}
		for(int i = 0; i<=60; i++) {
			listminute.add(i);
		} 
	}
}
