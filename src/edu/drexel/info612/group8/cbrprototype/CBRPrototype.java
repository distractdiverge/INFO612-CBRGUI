package edu.drexel.info612.group8.cbrprototype;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.collections.FXCollections;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;

public class CBRPrototype extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("INFO612 - Group 8 - CBR Prototype");

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));

		Text scenetitle = new Text("Enter Problem Description");
		scenetitle.setFont(Font.font("Arial",FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		// Change Frequency
		Label changeFrequencyLabel = new Label("Content Change Frequency (# of updates per hour):");
		grid.add(changeFrequencyLabel, 0, 1);

		TextField changeFrequencyField = new TextField();
		grid.add(changeFrequencyField, 1, 1);

		// Database
		Label databaseLabel = new Label("Database:");
		grid.add(databaseLabel, 0, 2);

		ChoiceBox databaseField = new ChoiceBox(FXCollections.observableArrayList(
			"Any",
			"Microsoft SQL Server",
			"Oracle SQL Server",
			"IBM SQL Server",
			"MySQL",
			"PostgreSQL",
			"SQLite",
			"CouchDB",
			"MongoDB",
			"Cache",
			"VelocityDB"
			));
		grid.add(databaseField, 1, 2);

		// Estimated Max Concurrent Traffic
		Label maxConcurrentTrafficLabel = new Label("Estimated Max Concurrent Traffic (# of concurrent users):");
		grid.add(maxConcurrentTrafficLabel, 0, 3);

		TextField maxConcurrentTrafficField = new TextField();
		grid.add(maxConcurrentTrafficField, 1, 3);

		// Concurrent Traffic Confidence
		Label concurrentTrafficConfidenceLabel = new Label("Max Concurrent Traffic Estimation Confidence (1-100%):");
		grid.add(concurrentTrafficConfidenceLabel, 0, 4);

		TextField concurrentTrafficConfidenceField = new TextField();
		grid.add(concurrentTrafficConfidenceField, 1, 4);

		// Expected Initial Budget
		Label initialBudgetLabel = new Label("Expected Initial Budget ($):");
		grid.add(initialBudgetLabel, 0, 5);

		TextField initialBudgetField = new TextField();
		grid.add(initialBudgetField, 1, 5);

		// Expected Maintenence Staff
		Label maintenenceStaffLabel = new Label("Expected Maintence Staff (# of persons):");
		grid.add(maintenenceStaffLabel, 0, 6);

		TextField maintenenceStaffField = new TextField();
		grid.add(maintenenceStaffField, 1, 6);

		// Expected Monthly Maintenence Budget
		Label maintenenceBudgetLabel = new Label("Expected Monthly Maintenence Budget ($):");
		grid.add(maintenenceBudgetLabel, 0, 7);

		TextField maintenenceBudgetField = new TextField();
		grid.add(maintenenceBudgetField, 1, 7);

		// Estimated Max User Base
		Label maxUserBaseLabel = new Label("Estimated Max User Base:");
		grid.add(maxUserBaseLabel, 0, 8);

		TextField maxUserBaseField = new TextField();
		grid.add(maxUserBaseField, 1, 8);

		// Max User Base Confidence
		Label maxUserBaseConfidenceLabel = new Label("Max User Base Estimation Confidence (1-100%):");
		grid.add(maxUserBaseConfidenceLabel, 0, 9);

		TextField maxUserBaseConfidenceField = new TextField();
		grid.add(maxUserBaseConfidenceField, 1, 9);

		// Estimated Max Traffic
		Label maxTrafficLabel = new Label("Estimated Max Traffic (# of page views per hour):");
		grid.add(maxTrafficLabel, 0, 10);

		TextField maxTrafficField = new TextField();
		grid.add(maxTrafficField, 1, 10);

		// Max Traffic Confidence
		Label maxTrafficConfidenceLabel = new Label("Max Traffic Estimation Confidence (1-100%):");
		grid.add(maxTrafficConfidenceLabel, 0, 11);

		TextField maxTrafficConfidenceField = new TextField();
		grid.add(maxTrafficConfidenceField, 1, 11);

		// Min Browser
		Label minBrowserLabel = new Label("Minimum Browser Support:");
		grid.add(minBrowserLabel, 0, 12);

		TextField minBrowserField = new TextField();
		grid.add(minBrowserField, 1, 12);

		// Mobile Support
		Label mobileSupportLabel = new Label("Mobile Support:");
		grid.add(mobileSupportLabel, 0, 13);

		TextField mobileSupportField = new TextField();
		grid.add(mobileSupportField, 1, 13);

		// Number of Videos
		Label numberOfVideosLabel = new Label("Number of Videos:");
		grid.add(numberOfVideosLabel, 0, 14);

		TextField numberOfVideosField = new TextField();
		grid.add(numberOfVideosField, 1, 14);

		// Programing Language Requirement
		Label programmingLanguageLabel = new Label("Programming Lanugage (server-side):");
		grid.add(programmingLanguageLabel, 0, 15);

		TextField programmingLanguageField = new TextField();
		grid.add(programmingLanguageField, 1, 15);

		// Server OS Requirement
		Label serverOSLabel = new Label("Server OS:");
		grid.add(serverOSLabel, 0, 16);

		TextField serverOSField = new TextField();
		grid.add(serverOSField, 1, 16);

		// Video Type Requirement
		Label videoTypeLabel = new Label("Type of Videos:");
		grid.add(videoTypeLabel, 0, 17);

		TextField videoTypeField = new TextField();
		grid.add(videoTypeField, 1, 17);

		// Web Server Requirement
		Label webServerLabel = new Label("Web Server:");
		grid.add(webServerLabel, 0, 18);

		TextField webServerField = new TextField();
		grid.add(webServerField, 1, 18);

		// --
		
		Scene scene = new Scene(grid, 800, 600);
		primaryStage.setScene(scene);

		primaryStage.show();

		try {
			loadCBR();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void loadCBR() throws Exception
	{
		final String PRJ_PATH = "myCBRProj/info-612-cbr-prototype.prj";

		Project myproject = new Project(PRJ_PATH);

		Concept problem = myproject.getConceptByID("Requirements");
	}
}