package com.giusefederation.proxy;



public class ProxyServer implements Server {
	
	private Server targetServer;
	private String maskIp;

	public ProxyServer(Server targetServer, String maskIp) {
		this.targetServer = targetServer;
		this.maskIp = maskIp;
	}

	@Override
	public Resource getResource(String ipAddress, String resourceName) {
	// operazione accessoria 1
	// operazione accessoria 2
	Resource requiredResource = targetServer.getResource(maskIp, resourceName);
	// operazione accessoria 3
	// operazione accessoria 4 I
	return requiredResource;
	}
}
