package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class DateBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override public void start(Stage stage) {
        stage.setTitle("Date Picker");
        Scene scene = new Scene(new Group(), 300, 150);
        
        final ComboBox month = new ComboBox();
        month.getItems().addAll(
            "1, January",
            "2, February",
            "3, March",
            "4, April",
            "5, May",
            "6, June",
            "7, July",
            "8, August",
            "9, September",
            "10, October",
            "11, November",
            "12, December"
        );
        
        
        final ComboBox day = new ComboBox();
        day.getItems().addAll(
        		"1",
        		"2",
        		"3",
        		"4",
        		"5",
        		"6",
        		"7",
        		"8",
        		"9",
        		"10",
        		"11",
        		"12",
        		"13",
        		"14",
        		"15",
        		"16",
        		"17",
        		"18",
        		"19",
        		"20",
        		"21",
        		"22",
        		"23",
        		"24",
        		"25",
        		"26",
        		"27",
        		"28",
        		"29",
        		"30",
        		"31"
        		);
        
        final ComboBox year = new ComboBox();
        year.getItems().addAll(
            "2010",
            "2011",
            "2012",
            "2013",
            "2014",
            "2015",
            "2016",
            "2017",
            "2018",
            "2019",
            "2020"
        );   
        month.setValue("April");
        day.setValue("25");
        year.setValue("2015");
        
        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(new Label("Month: "), 0, 0);
        grid.add(month, 1, 0);
        grid.add(new Label("Day: "), 0, 1);
        grid.add(day, 1, 1);
        grid.add(new Label("Year: "), 0, 2);
        grid.add(year, 1, 2);
        
        
        
        Group root = (Group)scene.getRoot();
        root.getChildren().add(grid);
        stage.setScene(scene);
        stage.show();
    }    
}
