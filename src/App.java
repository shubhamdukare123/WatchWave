import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.stage.Stage; 
import javafx.scene.canvas.*;
import javafx.event.EventHandler;
import javafx.scene.canvas.*; 
import javafx.scene.web.*; 
import javafx.scene.layout.*; 
import javafx.scene.image.*;
import javafx.scene.input.MouseButton;
import java.io.*; 
import javafx.geometry.*; 
import javafx.scene.Group; 
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.TextFlow;
import javafx.scene.text.FontWeight;

public class App extends Application { 

    SecondPage sp = new SecondPage();
    Stage s;
    Button aboutUsButton;
    AboutUs about = new AboutUs();
 	Button button;
	public void start(Stage s) throws Exception { 

        this.s =s;
        try {
        
            //Logo on left side
		    s.setTitle("C2W_THEATRE"); 

            //Image read
		    FileInputStream input = new FileInputStream("Images\\finalLogo.png"); 
            
		    // create a image 
		    Image image = new Image(input); 

		    // create ImagePattern 
	        ImagePattern image_pattern = new ImagePattern(image); 
            // create a Rectangle 
		    Rectangle rect = new Rectangle(100, 100, 450,120); 
            rect.setArcWidth(20);
            rect.setArcHeight(20);
		    // set fill for rectangle 
		    rect.setFill(image_pattern); 

            //Text 
            Text text = new Text("WELCOME!");
            text.setFont(Font.font("Times new roman", FontWeight.BOLD, 50));
            text.setFill(Color.WHITESMOKE);
           
            //Button 
            button = new Button("GET STARTED");
            button.setFont(Font.font("Arial",30)); 
            button.setMaxWidth(80);
            button.setMinHeight(30);
            button.setMaxHeight(50);
            button.setMinWidth(50);
            button.setAlignment(Pos.CENTER);
            
            HBox footer = new HBox();
            footer.setMinHeight(120);
            aboutUsButton = new Button("About Us");
            aboutUsButton.setMaxWidth(80);
            aboutUsButton.setMinHeight(30);
            aboutUsButton.setMaxHeight(40);
            aboutUsButton.setMinWidth(50);

            footer.setStyle("-fx-alignment: bottom-right;"); 
            
            // Position the About Us button to the bottom right
            footer.getChildren().addAll(aboutUsButton);
            Insets footerpadding = new Insets(10, 20, 10, 20); 
            
            // Example padding values
            footer.setPadding(footerpadding);
            // button.setMinHeight(40);
            button.setMinSize(300,30);
			// add the label, text field and button 
			VBox vbox = new VBox(rect,text, button,footer); 
            vbox.setPadding(new Insets(20, 0, 0, 30));

            vbox.setSpacing(90);
            
            //For Background Image
            FileInputStream ip = new FileInputStream("Images\\main page.JPG");
            Image img = new Image(ip);
            ImageView iw = new ImageView(img);
           
            BackgroundImage bg = new BackgroundImage(img,
             BackgroundRepeat.NO_REPEAT,
             BackgroundRepeat.NO_REPEAT, 
             BackgroundPosition.CENTER, 
            new BackgroundSize(100,100,true,true,true,true));
            Background background = new Background(bg);
            vbox.setBackground(background);  
            
            
            Label l = new Label("button not selected"); 
  
            // action event 
            EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
                public void handle(ActionEvent e) { 
                    l.setText("   button   selected    "); 
                } 
            }; 

            // when button is pressed 
            aboutUsButton.setOnAction(event);  
            
            //For display
		    Scene sc = new Scene(vbox, 1280, 645);     
		    s.setScene(sc);
		    s.show(); 
        }
        catch (Exception e) { 
			System.out.println(e.getMessage()); 
		}
        // button.setOnAction(e-> {
        //     try {
        //         sp.goToSecondPage(s);
        //     } catch (Exception e1) {
        //         e1.printStackTrace();
        //     }
        // });

        aboutUsButton.setOnAction(e-> {
            try {
                about.goToAboutUs(s);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });

        button.setOnAction(e -> {
            try {
                SecondPage secondPage = new SecondPage();
                secondPage.goToSecondPage(new Stage());
                s.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    
	} 

	public static void main(String args[]) 
	{ 
		// launch the application 
		launch(args); 
	} 
} 
