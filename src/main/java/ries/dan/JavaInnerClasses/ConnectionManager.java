package ries.dan.JavaInnerClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by danries on 2/2/17.
 */
public class ConnectionManager {

    ArrayList<ManagedConnection> connections = new ArrayList<ManagedConnection>();

    public ManagedConnection getConnection(String iPaddress, int port){
        return null;
    }

    public ManagedConnection getConnection(String ipAddress, String protocol){
        return null;
    }

    public class ManagedConnection implements Connection{

        public ManagedConnection(String protocol, String iPAddress, int port) {
            this.protocol = protocol;
            this.iPAddress = iPAddress;
            this.port = port;
        }

        String protocol;
        String iPAddress;
        int port;

        public String getIP() {
            return null;
        }

        public int getPort() {
            return 0;
        }

        public String getProtocol() {
            return null;
        }

        public String connect() {
            return null;
        }

        public void close(){

        }
    }
}
