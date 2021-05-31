package com.jamesmcgarr.serverimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerimageApplication {

	@GetMapping("test")
	public String get() {
//		try {
//			Thread.sleep(1*1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return "test";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServerimageApplication.class, args);
	}

}
