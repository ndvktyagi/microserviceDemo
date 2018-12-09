package com.hcl.zipkinLoggingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinLoggingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinLoggingServerApplication.class, args);
	}
}
