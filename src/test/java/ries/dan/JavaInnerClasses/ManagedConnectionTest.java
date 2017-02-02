package ries.dan.JavaInnerClasses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danries on 2/2/17.
 */
public class ManagedConnectionTest {

    ConnectionManager connectionManager = new ConnectionManager();

    ConnectionManager.ManagedConnection managedConnection = connectionManager.new ManagedConnection("HTTP","127.0.0.1",8000);


    @Test
    public void getIP(){
        String expected = "127.0.0.1";
        String actual = managedConnection.getIP();
        assertEquals("We expect to get the ip address of an connection",expected,actual);
    }

    @Test
    public void getPort(){
        int expected = 8000;
        int actual = managedConnection.getPort();
        assertEquals("We expect to get the port of a connection back",expected,actual);
    }

    @Test
    public void getProtocol(){
        String expected = "HTTP";
        String actual = managedConnection.getProtocol();
        assertEquals("We expect to get the protocol of an connection back",expected,actual);
    }

    @Test
    public void connect(){
        String expected = "Connected to 127.0.0.1:8000 via HTTP";
        String actual = managedConnection.connect();
        assertEquals("We expect to get the correct information back for the connection",expected,actual);
    }



}