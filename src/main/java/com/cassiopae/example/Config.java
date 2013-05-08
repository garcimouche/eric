package com.cassiopae.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;


/**
 * This class provides various configuration parameters to the whole application.
 * It loads a simple config.properties file that has to be present in the root of the execution directory. 
 * 
 * @author franck
 * @since May 8, 2013
 */
public final class Config {
    
    private static final Logger logger = Logger.getLogger(Config.class);
    
    private static final String CONFIG_FILE_PATH_NAME = "config.properties";
    
    private static final Properties properties;

    /**
     * This is the key parameter for the jdbc class name
     */
    public static final String PARAM_NAME_JDBC_DRIVER_CLASS = "jdbc.class.name";

    /**
     * This is the key parameter for the jdbc url
     */
    public static final String PARAM_NAME_JDBC_URL = "jdbc.url";
    
    /**
     * This is the key parameter for the jdbc user
     */
    public static final String PARAM_NAME_JDBC_USER = "jdbc.user";

    /**
     * This is the key parameter for the jdbc user's password
     */
    public static final String PARAM_NAME_JDBC_USER_PASSWORD = "jdbc.user.password";
    
    static {
        properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(CONFIG_FILE_PATH_NAME);
            properties.load(fileInputStream);
        }
        catch (FileNotFoundException e) {
            logger.error("the file " + CONFIG_FILE_PATH_NAME + " cannot be found", e);
        }
        catch (IOException e) {
            logger.error("the file " + CONFIG_FILE_PATH_NAME + " raised an IOException", e);
        }
        finally{
            if(fileInputStream!=null)
                try {
                    fileInputStream.close();
                }
                catch (IOException e) {
                    logger.warn("the file " + CONFIG_FILE_PATH_NAME + " raised an IOException on closing", e);
                }
        }
    }
    
    /**
     * @return the jdbc driver class to use 
     */
    public static String getJdbcDriverClassName(){
        String property = properties.getProperty(PARAM_NAME_JDBC_DRIVER_CLASS);
        if(property == null){
            logPropertyNotFound(PARAM_NAME_JDBC_DRIVER_CLASS);
        }
        return property;
    }

    /**
     * @return the jdbc url to connect to the DB 
     */
    public static String getJdbcURL(){
        String property = properties.getProperty(PARAM_NAME_JDBC_URL);
        if(property == null){
            logPropertyNotFound(PARAM_NAME_JDBC_URL);
        }
        return property;
    }
    
    /**
     * @return the user to use when connecting to the DB 
     */
    public static String getJdbcUser(){
        String property = properties.getProperty(PARAM_NAME_JDBC_USER);
        if(property == null){
            logPropertyNotFound(PARAM_NAME_JDBC_USER);
        }
        return property;
    }

    /**
     * @return the password associated with the user 
     */
    public static String getJdbcUserPassword(){
        String property = properties.getProperty(PARAM_NAME_JDBC_USER_PASSWORD);
        if(property == null){
            logPropertyNotFound(PARAM_NAME_JDBC_USER_PASSWORD);
        }
        return property;
    }
    
    private static void logPropertyNotFound(String propertyName) {
        logger.warn("property "+propertyName + " cannot be found in file" + CONFIG_FILE_PATH_NAME);
    }
    
    
    
}
