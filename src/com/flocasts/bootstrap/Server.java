package com.flocasts.bootstrap;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: jorubio
 * Date: 2/11/14
 * Time: 12:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class Server {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
