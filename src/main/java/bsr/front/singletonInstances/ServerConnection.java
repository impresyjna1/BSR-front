package bsr.front.singletonInstances;

import bsr.server.UserService;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Asia on 31.12.2016.
 */
public class ServerConnection {
    private static ServerConnection ourInstance = new ServerConnection();
    private int sessionId;
    private UserService userService;
    public static ServerConnection getInstance() {
        return ourInstance;
    }

    private ServerConnection() {
    }

    public void init() throws MalformedURLException {
        URL url = new URL(Config.USER_SERVICE_URL);
        QName qName = new QName("http://server.bsr/", "UserServiceService");
        Service service = Service.create(url, qName);
        userService = service.getPort(UserService.class);

//        url = new URL(ConstantsUtil.BANK_ACCOUNT_SERVICE_WSDL_URL);
//        qName = new QName("http://services.bank.bsr.put.poznan.pl/", "BankAccountServiceService");
//        service = Service.create(url, qName);
//        bankAccountService = service.getPort(BankAccountService.class);
//
//        url = new URL(ConstantsUtil.BANK_OPERATIONS_SERVICE_WSDL_URL);
//        qName = new QName("http://services.bank.bsr.put.poznan.pl/", "BankOperationServiceService");
//        service = Service.create(url, qName);
//        bankOperationService = service.getPort(BankOperationService.class);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;

        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Session-Id", Collections.singletonList(Integer.toString(sessionId)));

        Map<String, Object> requestContext = ((BindingProvider)userService).getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

    }
}
