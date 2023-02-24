package com.giusefederation.proxy;

public class App {

	public static void main(String[] args) {
		Server raiPlayServer = new ProxyServer(new RaiPlayServer(), "39.123.123.123");
		Resource sanrem02023ep1 = raiPlayServer.getResource("41.123.123.123", "SFnrem02023ep1");
		
		
		
	}

}
