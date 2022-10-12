package me.peopleXrCb.tcpclient;

import me.peopleXrCb.tcpclient.objects.Client;

import java.util.Scanner;

public class Main {
    private static Client client;

    public static void main(String[] args) throws Exception {
        String address = args[0];
        int port = Integer.parseInt(args[1]);

        client = new Client(address, port);
    }

    public static Client getClient() {
        return client;
    }
}