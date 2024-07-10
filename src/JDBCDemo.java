

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    
    

    //String movieName; 
    public String getMovieName(String id)throws Exception{
        
        String url = "jdbc:mysql://localhost:3306/watchdata";
        String username = "root";
        String password = "Snehal@9315" ;
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            String query = "select * from moviesinfo where movieName = "+ "'" +id + "'";
            ResultSet resultSet = statement.executeQuery(query);
            String name = "Not found";
            while(resultSet.next()){
             name = resultSet.getString("movieName");
            }
            return name;
    }

    public String getMovieDirector(String id)throws Exception{
        String url = "jdbc:mysql://localhost:3306/watchdata";
        String username = "root";
        String password = "Snehal@9315" ;
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            String query = "select * from moviesinfo where movieName = "+ "'" +id + "'";

            ResultSet resultSet = statement.executeQuery(query);
            String director = "Not found";
            while(resultSet.next()){
             director = resultSet.getString("director");
            }
            return director;
        
}
public String getActorName(String id)throws Exception{
        
        String url = "jdbc:mysql://localhost:3306/watchdata";
        String username = "root";
        String password = "Snehal@9315" ;
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            String query = "select * from moviesinfo where movieName = "+ "'" +id + "'";
            ResultSet resultSet = statement.executeQuery(query);
            String actorName = "Not found";
            while(resultSet.next()){
             actorName = resultSet.getString("actor");
            }
            return actorName;
        
}
public int getIMDB(String id)throws Exception{
        JDBCDemo obj = new JDBCDemo();
        String url = "jdbc:mysql://localhost:3306/watchdata";
        String username = "root";
        String password = "Snehal@9315" ;
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            String query = "select * from moviesinfo where movieName = "+ "'" +id + "'";

            ResultSet resultSet = statement.executeQuery(query);
            int imdb = 0;
            while(resultSet.next()){
             imdb = resultSet.getInt("imdb");
            }
            return imdb;
        }
public String getPoster(String id)throws Exception{
        String url = "jdbc:mysql://localhost:3306/watchdata";
        String username = "root";
        String password = "Snehal@9315" ;
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            String query = "select * from moviesinfo where movieName = "+ "'" +id + "'";

            ResultSet resultSet = statement.executeQuery(query);
            String poster = "Not found";
            while(resultSet.next()){
                poster = resultSet.getString("poster");
            }
            return poster;
        }
    }
        
