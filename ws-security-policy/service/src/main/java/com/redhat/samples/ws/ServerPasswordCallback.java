package com.redhat.samples.ws;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import org.jboss.logging.Logger;

public class ServerPasswordCallback implements CallbackHandler {

    //private static final Logger LOGGER = Logger.getLogger(ServerPasswordCallback.class);
    private static final Logger LOGGER=Logger.getLogger(ServerPasswordCallback.class);
    private static final String USERNAME = "kermit";
    private static final String PASSWORD = "thefrog";

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback callback = (WSPasswordCallback) callbacks[0];
        LOGGER.info(String.format("username = %s", callback.getIdentifier()));
        if (USERNAME.equals(callback.getIdentifier())) {
            callback.setPassword(PASSWORD);
        }
    }

}
