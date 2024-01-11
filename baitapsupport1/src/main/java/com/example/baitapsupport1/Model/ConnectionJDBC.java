package com.example.baitapsupport1.Model;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class ConnectionJDBC {

    private String hostName = "localhost:3306";
    private String databaseName = "QUANLYSINHVIEN";
    private String username = "root";
    private String password = "18092004";

    private String connectionURL = "jdbc:mysql://" + hostName + "/" + databaseName + "?user=" + username + "&password=" + password;

    public ConnectionJDBC() throws SQLException {
    }

    public Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection(connectionURL,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    private static final String SELECT_ALL_STUDENTS = "select * from Student";



    public List<Student> selectAllUsers() {


        List<Student> students = new ArrayList<>();
        try (Connection connection = getConnection();


             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENTS);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                students.add(new Student(id, name, age, address));
            }
        } catch (SQLException e) {

        }
        return students;
    }


}