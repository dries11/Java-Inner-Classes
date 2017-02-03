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

    ArrayList<Connection> connections = new ArrayList<Connection>();


    @Test
    public void getConnectionStringIntTest(){
        connections.add(connectionManager.getConnection("127.0.0.1",8000));
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

}