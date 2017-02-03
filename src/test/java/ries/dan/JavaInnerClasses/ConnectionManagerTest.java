package ries.dan.JavaInnerClasses;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by danries on 2/2/17.
 */
public class ConnectionManagerTest {


    ConnectionManager connectionManager = new ConnectionManager();
    ArrayList<Connection> connections = new ArrayList<Connection>();


    @Test
    public void getConnectionStringIntTest(){
        connections.add(connectionManager.getConnection("127.3.21.55",22));
        int expected = 1;
        int actual = connections.size();
        assertEquals("We expect to get back the connection back base on ipaddress and port",expected,actual);
    }

    @Test
    public void getConnectionStringStringTest(){
        connections.add(connectionManager.getConnection("127.0.0.1","HTTP",8000));
        int expected = 1;
        int actual = connections.size();
        assertEquals("We expect to get the connection back that was assinged",expected,actual);
    }

    @Test
    public void getIPTest(){
        Connection connection = connectionManager.getConnection("128.0.9.10","HTTP",223);
        String expected = "128.0.9.10";
        String actual = connection.getIP();
        assertEquals("We expect to get back the IP address",expected,actual);
    }

    @Test
    public void getPortTest(){
        Connection connection = connectionManager.getConnection("144.28.34.123",998);
        int expected = 998;
        int actual = connection.getPort();
        assertEquals("We expect to get back the port",expected,actual);
    }

    @Test
    public void getProtocolTest(){
        Connection connection = connectionManager.getConnection("223.23.14.365",76549);
        String expected = "HTTP";
        String actual = connection.getProtocol();
        assertEquals("We expect to get the protocol back",expected,actual);
    }

    @Test
    public void connectTest(){
        Connection connection = connectionManager.getConnection("423.56.34.322",234);
        String expected = "Connected to 423.56.34.322:234 via HTTP";
        String actual = connection.connect();
        assertEquals("We expect to get that we are connected",expected,actual);
    }

    @Test
    public void closeTest() throws IOException {
        Connection connection = connectionManager.getConnection("127.0.0.1",678);
        connection.close();
        String expected  = "CLOSED";
        String actual = connection.getProtocol();
        assertEquals("We expect to get the connection status back ",expected,actual);
    }

}