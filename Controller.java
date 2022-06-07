import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private AnchorPane myPane;

    @FXML
    private ColorPicker warna;
    
    //Table
    @FXML
    private TableView<App> tableView;

    //Columns
    @FXML
    private TableColumn<App, String> event;

    @FXML
    private TableColumn<App, Integer> time;

    @FXML
    private TableColumn<App, String> location;

    //Text input
    @FXML
    private TextField nameEvent;

    @FXML
    private TextField txtLocation;

    @FXML
    private DatePicker inputTime;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        event.setCellValueFactory(new PropertyValueFactory<App, String>("name"));
        time.setCellValueFactory(new PropertyValueFactory<App, Integer>("age"));
        location.setCellValueFactory(new PropertyValueFactory<App, String>("loc"));
    }

    //Submit button
    @FXML
    void submit(ActionEvent event) {
        App schedule = new App(nameEvent.getText(), inputTime.getValue(), txtLocation.getText());
        ObservableList<App> schedules = tableView.getItems();
        schedules.add(schedule);
        tableView.setItems(schedules);
    }

    //Remove button
    @FXML
    void removeCustomer(ActionEvent event) {
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }

    @FXML
    void gantiColor(ActionEvent event) {
        Color myColor = warna.getValue();
        myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
    }
}