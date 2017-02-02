package ries.dan.JavaInnerClasses;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by danries on 2/2/17.
 */
public class ConnectionManagerTest {


    ConnectionManager connectionManager = new ConnectionManager();
    ConnectionManager.ManagedConnection managedConnection = connectionManager.new ManagedConnection("HTTP","127.0.0.1",8000);

    ArrayList<Connection> connections = new ArrayList<Connection>();

    @Before public void initialize(){
        connections.add(managedConnection);
    }


    @Test
    public void getConnectionStringIntTest(){

        Connection expected = managedConnection;
        Connection actual = connectionManager.getConnection("127.0.0.1",8000);
        assertEquals("We expect to get back the connection back base on ipaddress and port",expected,actual);
    }

    @Test
    public void getConnectionStringStringTest(){
        Connection expected = managedConnection;
        Connection actual = connectionManager.getConnection("127.0.0.1","HTTP");
        assertEquals("We expect to get the connection back that was assinged",expected,actual);
    }

}