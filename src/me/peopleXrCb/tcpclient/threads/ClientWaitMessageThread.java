package me.peopleXrCb.tcpclient.threads;

import me.peopleXrCb.tcpclient.Main;
import me.peopleXrCb.tcpclient.objects.Client;

import java.io.DataInputStream;
import java.io.InputStreamReader;

public class ClientWaitMessageThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                Client client = Main.getClient();
                DataInputStream in = new DataInputStream(client.getSocket().getInputStream());

                String text = in.readUTF();
                System.out.println(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}