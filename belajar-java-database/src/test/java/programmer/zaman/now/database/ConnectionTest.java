package programmer.zaman.now.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    @BeforeAll
    static void beforeAll() {
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    void testConnection() {

//        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database";
//        String username = "root";
//        String password = "Mysql23";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/belajar_java_database", "root", "Mysql123");
            System.out.println("Sukses konek ke database");
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }

    }

    @Test
    void testConnectionClose() {

        // cara 1
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/belajar_java_database", "root", "Mysql123");
//            System.out.println("Sukses konek ke database");
//
//            connection.close();
//        } catch (SQLException exception) {
//            Assertions.fail(exception);
//        }

        // cara 2 - try with resource
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/belajar_java_database", "root", "Mysql123")) {

            System.out.println("Sukses konek ke database");

        } catch (SQLException exception) {
            Assertions.fail(exception);
        }


    }
}
