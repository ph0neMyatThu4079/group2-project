package com.napier.proj;

import com.napier.proj.config.DatabaseConfig;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {


        DatabaseConfig.openConnection();
        Connection conn = DatabaseConfig.getConnection();

        System.out.println("Now, it's time to start project");

        DatabaseConfig.closeConnection();
    }
}
