package com.playwesca.multiplayer.api.cachesvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CacheSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheSvcApplication.class, args);
	}

}
