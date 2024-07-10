import javafx.scene.image.ImageView;

import java.io.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AboutUs {

    public Scene scene;
    Button back1;
    
    public void goToAboutUs(Stage stage)throws Exception {
           try {
            // Create a VBox to hold the content
            StackPane root = new StackPane(); // 20 pixels spacing between node
      
            
            // Load the image
            FileInputStream ip = new FileInputStream("Images\\common page.PNG");
            Image img = new Image(ip);
            ImageView iw = new ImageView(img);

            // Create a background
            BackgroundImage bg = new BackgroundImage(
                img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, new BackgroundSize(100, 100, true, true, true, true)
            );
            Background background = new Background(bg);
            root.setBackground(background);

            FileInputStream input = new FileInputStream("Images\\finalLogo.png");
            Image image = new Image(input);
            ImagePattern image_pattern = new ImagePattern(image);
            Rectangle rect = new Rectangle(100, 100, 420, 120);
            rect.setArcWidth(20);
            rect.setArcHeight(20);
            rect.setFill(image_pattern);
            StackPane.setAlignment(rect, javafx.geometry.Pos.TOP_LEFT);
            root.getChildren().add(rect);

            //Image image = new Image(ip1);
            // ImageView imageview = new ImageView(image);
       
            FileInputStream ip2 = new FileInputStream("Images\\sir.jpg");
            Image image1 = new Image(ip2);
            ImageView imageview1 = new ImageView(image1);
            StackPane.setAlignment(imageview1, javafx.geometry.Pos.TOP_LEFT);
            StackPane.setMargin(imageview1, new Insets(100,400,900,900));
            root.getChildren().add(imageview1);
        
            HBox groupHBox = new HBox();
            Label groupLabel = new Label("Group Member:");
            StackPane.setMargin(groupLabel, new Insets(0,850,350,40));
            groupLabel.setStyle("-fx-font-size: 50px;");
            groupLabel.setFont(Font.font("Calibri",FontWeight.BOLD,20));
            groupLabel.setTextFill(Color.web("#ffffff"));
            Label groupMembersLabel = new Label("\n1. Shubham Dukare \n2. Prathmesh Pawar \n3. Monali Jadhav \n4. Snehal Kangude \n5. Shreyash Panpat");
            StackPane.setMargin(groupMembersLabel, new Insets(0,950,150,40));
       
            groupMembersLabel.setTextFill(Color.web("#ffffff"));
            groupMembersLabel.setFont(Font.font("Arial", 20));
            groupHBox.getChildren().addAll(groupLabel, groupMembersLabel);
            root.getChildren().addAll(groupLabel, groupMembersLabel);


        // Create HBoxes to organize elements horizontally
        
        HBox specialThanksHBox = new HBox();
        // Special Thanks
        Label specialThanksLabel = new Label("Special Thanks!");
        StackPane.setMargin(specialThanksLabel, new Insets(100,900,0,40));
        specialThanksLabel.setFont(Font.font("Calibri", FontWeight.BOLD, 40));
        specialThanksLabel.setTextFill(Color.web("#ffffff"));
        Label specialThanksLabel2 = new Label("Special Thanks to Mr.Shashi Sir for their dedication,guidance, and unwavering support.\nYour passion for teaching and commitment to our growth have made a profound impact on our \neducational journey.Your wisdom and expertise have been a source of inspiration,and we are \ntruly grateful for the knowledge and life lessons you've shared with us. Your influence will be \ncontinue to shape our future endeavors, and we express our heartful appreciation for your \ninvaluable contributions to our development.");
        StackPane.setMargin(specialThanksLabel2, new Insets(400,350,0,40));
        specialThanksLabel2.setStyle("-fx-font-size: 20px;");
        specialThanksLabel2.setTextFill(Color.web("#ffffff"));

        //Back button
        HBox footer = new HBox();
        footer.setMinHeight(20);
        back1 = new Button("BACK");
        back1.setMaxWidth(80);
        back1.setMinHeight(25);
        back1.setMaxHeight(20);
        back1.setMinWidth(50);

        footer.setStyle("-fx-alignment: bottom-right;");             
        // Position the About Us button to the bottom right
        footer.getChildren().addAll(back1);
        Insets footerpadding = new Insets(10, 20, 10, 20); 
            
        // Example padding values
        footer.setPadding(footerpadding);
        // footer.setAlignment(Pos.BOTTOM_RIGHT);
        

        specialThanksHBox.getChildren().addAll(specialThanksLabel, specialThanksLabel2,footer);
        root.getChildren().addAll(specialThanksLabel, specialThanksLabel2,footer);

        Scene scene = new Scene(root, 1280, 645); // Adjust the width and height as needed
        stage.setScene(scene);
        
  
        stage.setTitle("About Us");
        
       
        stage.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        back1.setOnAction(e -> {
            try {
                stage.close(); // Close the current stage
                App app = new App();
                app.start(new Stage()); // Open a new mainAPP2 stage
            } catch (Exception e1) {
                e1.getMessage();
            }
        });
        
    }

    
}