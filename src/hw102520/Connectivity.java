package hw102520;

import java.sql.*;
import java.util.ArrayList;

public class Connectivity {

    public static void main(String[] args) throws SQLException {

        String username = "root";
        String password = "root1234";
        String dbname = "peoplentech";
        String query = "select * from players;";
        String url = "jdbc:mysql://localhost:3306/" + dbname + "?serverTimezone=UTC";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int number = resultSet.getInt("number");
            String name = resultSet.getString("name");
            String position = resultSet.getString("position");
            String team = resultSet.getString("team");


            ArrayList<Object> player = new ArrayList<>();
            player.add(number);
            player.add(name);
            player.add(position);
            player.add(team);

            System.out.println(player);
        }
    }
}