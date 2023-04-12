package org.example.com;

import org.example.Net.NetManager;
import org.example.Server.GameServer;

import java.io.IOException;

public class StartServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        GameServer server=new GameServer();
        NetManager manager=new NetManager(server);
    }
}
