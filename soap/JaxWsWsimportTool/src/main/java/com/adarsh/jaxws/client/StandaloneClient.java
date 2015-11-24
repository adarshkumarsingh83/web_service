package com.adarsh.jaxws.client;


import com.adarsh.jaxws.ws.ServerInfo;
import com.adarsh.jaxws.ws.ServerInfoService;

public class StandaloneClient {

    public static void main(String[] args) throws Exception {
        ServerInfoService sis = new ServerInfoService();
        ServerInfo si = sis.getServerInfoPort();

        System.out.println(si.getIpAddress());
    }
}