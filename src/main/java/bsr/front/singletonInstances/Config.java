package bsr.front.singletonInstances;

/**
 * Created by Asia on 31.12.2016.
 */

/**
 * Configuration for app with ports for server and addresses to wsdls
 */
public abstract class Config {
    public static final int SOAP_PORT = 8080;
    public static final String SERVER_ADDR = "localhost";
    public static final String USER_SERVICE_URL = "http://" + SERVER_ADDR + ":" + SOAP_PORT + "/users?wsdl";
    public static final String ACCOUNT_SERVICE_URL = "http://" + SERVER_ADDR + ":"  + SOAP_PORT + "/internalAccounts?wsdl";
}
