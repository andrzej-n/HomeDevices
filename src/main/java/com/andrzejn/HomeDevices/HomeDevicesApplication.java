package com.andrzejn.HomeDevices;

import java.awt.Toolkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeDevicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeDevicesApplication.class, args);
		Toolkit.getDefaultToolkit().beep();
	}
}
