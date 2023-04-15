package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



/**
 *
 * @author Yahya
 */
public class LoginPage  extends Stage {
        private TextField name ;
        private PasswordField pass;
        private Label lname , ppass ;
        private Button login ;
        private Scene scene;
        private Label l ;
 
          ImageView imageView;
         Image image ;
    public LoginPage() {
         image = new Image("file:C:\\Users\\TAIBA\\Documents\\NetBeansProjects\\mavenproject33\\src\\main\\java\\imgs\\unnamed.jpg");
       imageView = new ImageView(image);
imageView.setFitWidth(150);
imageView.setFitHeight(150);

       name = new TextField();
       name.setStyle("-fx-border-color:blue");
       
       pass = new PasswordField();
       pass.setStyle("-fx-border-color:blue");
       lname = new Label("User Name");
       lname.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
       ppass = new Label("Password");
       ppass.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
       login = new Button("Login");
       login.setPadding(new Insets(15));
       login.setStyle("-fx-background-color:blue;-fx-text-fill:white;");
       lname.getStyleClass().add("Labele");
       login.setOnAction(e->{
             if(name.getText().equals("user") && pass.getText().equals("userpass")){
                ViewManager.closeLoginPage();
                ViewManager.openCurrencyConverstionPage();
             }else {
                  lname.setText("User Name \n data is invalid ");
             }
       });
       VBox vx = new VBox(10,imageView,lname , name , ppass , pass , login );
       vx.setAlignment(Pos.CENTER);
       vx.setPadding(new Insets(70));
         vx.getStylesheets().add("style.css");

         scene = new Scene(vx, 340, 540);
      //  scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
scene.getStylesheets().add("style.css");
        this.setScene(scene);
        this.setTitle("Login Page");
        this.setResizable(false);
        this.show();
  
    }
    }


