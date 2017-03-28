package com.example;

import java.net.InetSocketAddress;
import java.net.Socket;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

public class SocketHealthIndicator extends AbstractHealthIndicator {
	private String host;
	private int port;
	private int timeout = 5000;

	@Override
	protected void doHealthCheck(Health.Builder health) throws Exception {
		Socket socket = new Socket();
		try {
			socket.connect(new InetSocketAddress(host, port), timeout);
			health.up();
		} finally {
			socket.close();
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
}
