package ries.dan.JavaInnerClasses;

import java.io.IOException;

/**
 * Created by danries on 2/2/17.
 */
public interface Connection extends java.io.Closeable {

    String protocol = "";
    String iPAddress = "";
    int port = 0;
    String status = "";

    public String getIP();

    public int getPort();

    public String getProtocol();

    public String connect();

    public void close() throws IOException;
}
