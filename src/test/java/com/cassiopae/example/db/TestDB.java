package com.cassiopae.example.db;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cassiopae.example.Config;

public class TestDB {

    private static Connection connection;

    @BeforeClass
    public static void beforeAllTestsWeLoadTheDriver() throws ClassNotFoundException, SQLException {
        Class.forName(Config.getJdbcDriverClassName());
        connection = DriverManager.getConnection(Config.getJdbcURL(), Config.getJdbcUser(), Config.getJdbcUserPassword());
    }

    @Before
    public void beforeEachTestsWeCreateSQLTablesAndFillThem() throws SQLException {
        createTables();
        importData();
    }

    @After
    public void afterEachTestsWeDropTables() throws SQLException {
        dropTables();
    }
    
    @AfterClass
    public static void afterAllTests() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Test
    public void testRecordAvailable() throws SQLException{
        PreparedStatement fourties = connection.prepareStatement("SELECT NAME FROM TEST WHERE AGE>=? and AGE < ?");
        fourties.setInt(1, 40);
        fourties.setInt(2, 50);
        fourties.setFetchSize(500);//this is a good optimization param to set while reading, it fetches 500 record in one tcp trip to the db and store in memory
        ResultSet rs = fourties.executeQuery();
        int count = 0;
        while(rs.next()){
            System.out.println(rs.getString(1) + " is his fourties ...");
            count++;
        }
        assertEquals("expect to have 3 guys in their fourties",count,3);
    }
    
    private static void createTables() throws SQLException {
        executeSQLStatement("CREATE TABLE test (id INTEGER, name char(50), last_name char(50), age INTEGER)");
    }

    private static void importData() throws SQLException {
        executeSQLStatement("INSERT INTO test (id,name,last_name,age) values (1,'franck','garcia',40)");
        executeSQLStatement("INSERT INTO test (id,name,last_name,age) values (2,'zinedine','zidane',40)");
        executeSQLStatement("INSERT INTO test (id,name,last_name,age) values (3,'marcel','desailly',44)");
        executeSQLStatement("INSERT INTO test (id,name,last_name,age) values (4,'eric','garcia',55)");
    }

    private static void dropTables() throws SQLException {
        executeSQLStatement("DROP TABLE test");
    }

    private static void executeSQLStatement(String statementString) throws SQLException{
        Statement sst = connection.createStatement();
        sst.executeUpdate(statementString);
        sst.close();
    }
    
}
