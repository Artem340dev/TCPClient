package me.peopleXrCb.tcpclient.objects;

import me.peopleXrCb.tcpclient.threads.ClientWaitMessageThread;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    private Socket socket;

    public Client(String address, int port) throws Exception {
        this.socket = new Socket(address, port);
        new ClientWaitMessageThread().start();
    }

    public Socket getSocket() {
        return socket;
    }

    public void sendMessage(String msg) {
        try {
            DataOutputStream out = (DataOutputStream) socket.getOutputStream();
            out.write(msg.getBytes());
        } catch (Exception e) {
        }
    }
}