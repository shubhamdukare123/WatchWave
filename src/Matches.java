
import java.io.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Matches  {
    Button back;
    public void goToMatches(Stage s)throws IOException,Exception{

            BorderPane root = new BorderPane();
            // HBox hBox1 =  new HBox();
            HBox hBox2 =  new HBox();
            HBox hBox3 =  new HBox();
            HBox hBox4 =  new HBox();
            HBox hBox5 =  new HBox();
            VBox vBox = new VBox();


            //Images Input Action
            InputStream bgInput = new FileInputStream("Images\\main1.jpeg");
            InputStream p1Input = new FileInputStream("Images\\Matches\\p1.jpeg");
            InputStream p2Input = new FileInputStream("Images\\Matches\\\\p2.jpeg");
            InputStream p3Input = new FileInputStream("Images\\Matches\\virat.jpg");
            InputStream p4Input = new FileInputStream("Images\\Matches\\2.jpg");
            InputStream p5Input = new FileInputStream("Images\\Matches\\5.jpg");


           //Images Input Thriller
            InputStream p1TInput = new FileInputStream("Images\\Matches\\match1.JPG");
            InputStream p2TInput = new FileInputStream("Images\\Matches\\match2.JPG");
            InputStream p3TInput = new FileInputStream("Images\\Matches\\match3.JPG");
            InputStream p4TInput = new FileInputStream("Images\\Matches\\match4.JPG");
            InputStream p5TInput = new FileInputStream("Images\\Matches\\match5.JPG");


            //Image Object Background
            Image bgImage = new Image(bgInput);


            //Images Objects Action
            Image p1Image = new Image(p1Input);
            Image p2Image = new Image(p2Input);
            Image p3Image = new Image(p3Input);
            Image p4Image = new Image(p4Input);
            Image p5Image = new Image(p5Input);



            //Images Objects Thriller
            Image p1TImage = new Image(p1TInput);
            Image p2TImage = new Image(p2TInput);
            Image p3TImage = new Image(p3TInput);
            Image p4TImage = new Image(p4TInput);
            Image p5TImage = new Image(p5TInput);


            //ImageView Objects
            ImageView p1IView = new ImageView(p1Image);
            ImageView p2IView = new ImageView(p2Image);
            ImageView p3IView = new ImageView(p3Image);
            ImageView p4IView = new ImageView(p4Image);
            ImageView p5IView = new ImageView(p5Image);


            //ImageView Objects Thriller
            ImageView p1TIView = new ImageView(p1TImage);
            ImageView p2TIView = new ImageView(p2TImage);
            ImageView p3TIView = new ImageView(p3TImage);
            ImageView p4TIView = new ImageView(p4TImage);
            ImageView p5TIView = new ImageView(p5TImage);


            //ImageView Resizig Width
            p1IView.setFitWidth(220);
            p2IView.setFitWidth(220);
            p3IView.setFitWidth(220);
            p4IView.setFitWidth(220);
            p5IView.setFitWidth(220);

            //ImageView Resizig Width
            p1IView.setFitHeight(140);
            p2IView.setFitHeight(140);
            p3IView.setFitHeight(140);
            p4IView.setFitHeight(140);
            p5IView.setFitHeight(140);

            //image
            p1TIView.setFitWidth(220);
            p2TIView.setFitWidth(220);
            p3TIView.setFitWidth(220);
            p4TIView.setFitWidth(220);
            p5TIView.setFitWidth(220);

            //Image2
            p1TIView.setFitHeight(140);
            p2TIView.setFitHeight(140);
            p3TIView.setFitHeight(140);
            p4TIView.setFitHeight(140);
            p5TIView.setFitHeight(140);

            //bg Image
            BackgroundImage bgImageObj = new BackgroundImage(bgImage,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
            );
            Background bg = new Background(bgImageObj);
            //
            root.setBackground(bg);
             //Logo
            FileInputStream input = new FileInputStream("Images\\finalLogo.png");
            Image image = new Image(input);
            ImagePattern image_pattern = new ImagePattern(image);
            Rectangle rect = new Rectangle(0, 0, 400, 110);
            rect.setArcWidth(20);
            rect.setArcHeight(20);
            rect.setFill(image_pattern);

            ///movies text
            Text moviesTxt = new Text("Matches");
            moviesTxt.setFont(Font.font( "Calibri", FontWeight.BOLD,FontPosture.ITALIC, 50));
            moviesTxt.setFill(Color.YELLOWGREEN);
            HBox hBox1 =new HBox(moviesTxt,rect);
            hBox1.setSpacing(60);
            hBox1.setPadding(new Insets(0, 10, 0, 25));
            //hbox1 add
            // hBox1.getChildren().addAll(moviesTxt);
            hBox1.setAlignment(Pos.TOP_LEFT);
            // hBox1.setMargin(moviesTxt, new Insets(0, 1200, 20, 100));

            //Adventure txt
            Text adventureTxt = new Text("World Cup");
            adventureTxt.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.ITALIC, 30));
            adventureTxt.setFill(Color.ORANGE);

            // Button btn = new Button("Shubham");
            
            //hBox2 add 
            hBox2.getChildren().addAll(adventureTxt);
            hBox2.setAlignment(Pos.BOTTOM_LEFT);
            hBox2.setMargin(adventureTxt, new Insets(0, 0, 20, 20));
            
            
            //hBox3 Images
            hBox3.getChildren().addAll(p1IView,p2IView,p3IView,p4IView, p5IView);   
            hBox3.setMargin(p1IView, new Insets(0, 0, 20, 20));
            hBox3.setSpacing(35);
            
            
            //hBox4
            //Thriller
            Text thrillerTxt = new Text("Semi-finals");
            thrillerTxt.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.ITALIC, 30));
            thrillerTxt.setFill(Color.ORANGE);
            
            //hBox4 add 
            hBox4.getChildren().addAll(thrillerTxt);
            hBox4.setAlignment(Pos.BOTTOM_LEFT);
            hBox4.setMargin(thrillerTxt, new Insets(0, 0, 20, 20));
            
            //hBox5 Images
            hBox5.getChildren().addAll(p1TIView,p2TIView,p3TIView,p4TIView,p5TIView);   
            hBox5.setMargin(p1TIView, new Insets(0, 0, 20, 20));
            hBox5.setSpacing(35);
            
            
             //Footer >>> Back
             HBox footer = new HBox();
             footer.setMinHeight(20);
             back = new Button("BACK");
             back.setMaxWidth(80);
             back.setMinHeight(25);
             back.setMaxHeight(20);
             back.setMinWidth(50);
 
             footer.setStyle("-fx-alignment: bottom-center;"); 
             
             // Position the About Us button to the bottom right
             footer.getChildren().addAll(back);
             Insets footerpadding = new Insets(0, 20, 10, 20); 
             
             // Example padding values
             footer.setPadding(footerpadding);

            
            //  vBox add
            vBox.getChildren().addAll(rect,hBox1,hBox2,hBox3,hBox4,hBox5,footer);
            vBox.setSpacing(5);
            //BorderPane
            root.setTop(vBox);
            
            
           // btn.setOnAction(e -> switchScenes(s));
           back.setOnAction(e -> {
            try {
                SecondPage secondPage = new SecondPage();
                secondPage.goToSecondPage(new Stage());
                s.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
            
            Scene scene = new Scene(root,1280,645);
            s.setTitle("Theater");
            s.setScene(scene);
            s.show();
            
    }
    
}

