package bsr.front.singletonInstances;

/**
 * Created by Asia on 31.12.2016.
 */
public abstract class Config {
    public static final int REST_PORT = 8080;
    public static final int SOAP_PORT = 8079;
    public static final String SERVER_ADDR = "localhost";
    public static final String USER_SERVICE_URL = "http://" + SERVER_ADDR + ":" + SOAP_PORT + "/users?wsdl";
    public static final String ACCOUNT_SERVICE_URL = "http://" + SERVER_ADDR + ":"  + SOAP_PORT + "/accounts?wsdl";
    public static final String OPERATIONS_SERVICE_URL = "http://" + SERVER_ADDR + ":"  + SOAP_PORT + "/bankOperations?wsdl";
}
