package com.giusefederation.proxy;

public class RaiPlayServer implements Server {
	// 39.xxx.xxx.xxx indirizzi ip italiano
	// 41.xxx.xxx.xxx indirizzi ip tedeschi
	@Override
	public Resource getResource(String ipAddress, String resourceName) {
	if(!ipAddress.startsWith("39.")) {
	throw new RuntimeException("Non puoi ottenere la risorsa perche non sei in italial");
	}
	// ricerco la risorsa
	// TODO
	//find della risorca ricercata
	Resource foundResource = new Resource();
	return foundResource;
	}
}
