package com.platisima.platisima_registros;

import com.platisima.platisima_registros.main.Main;
import com.platisima.platisima_registros.main.UserMenu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatisimaRegistrosApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(PlatisimaRegistrosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
	}
}
