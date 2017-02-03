package ries.dan.JavaInnerClasses;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by danries on 2/2/17.
 */
public class ConnectionManager {

    int connectionLimit = 3;

    ArrayList<ManagedConnection> connections = new ArrayList<ManagedConnection>();

    public Connection getConnection(String iPaddress, int port){
        ManagedConnection managedConnection = new ManagedConnection(null,null,0);
        if (connections.size() < connectionLimit){
            managedConnection = new ManagedConnection("HTTP",iPaddress,port);
        }
        else
        {
            System.out.println("ERR:2132141 - Too many connections");
            managedConnection = null;
        }

        return managedConnection;

    }

    public Connection getConnection(String ipAddress, String protocol, int port){
        ManagedConnection managedConnection = new ManagedConnection(null,null,0);
        if (connections.size() < connectionLimit){
            managedConnection = new ManagedConnection(protocol,ipAddress,port);
        }
        return managedConnection;
    }

    private class ManagedConnection implements Connection{

        public ManagedConnection(String protocol, String iPAddress, int port) {
            this.protocol = protocol;
            this.iPAddress = iPAddress;
            this.port = port;
            status = "OPEN";
        }

        String protocol;
        String iPAddress;
        int port;
        String status;


        public String getIP() {
            return this.iPAddress;
        }

        public int getPort() {
            return this.port;
        }

        public String getProtocol() {
            return this.protocol;
        }

        public String connect() {
            if (this.status.equals("CLOSED")){
                System.out.println(this.status + "   " + this.port + "  " + this.iPAddress + "    " + this.protocol);
                return null;
            }
            return "Connected to " + this.iPAddress + ":" + this.port + " via " + this.protocol;

        }

        public void close(){
            this.status = "CLOSED";
            this.protocol = "CLOSED";
            this.iPAddress = "000.000.000.000";
            this.port = (int)Math.ceil(Math.random() * 100);
        }
    }
}
