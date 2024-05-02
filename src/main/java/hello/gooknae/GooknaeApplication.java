package hello.gooknae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GooknaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GooknaeApplication.class, args);
		System.out.println("hi");
		System.out.println("wow");
	}
}
