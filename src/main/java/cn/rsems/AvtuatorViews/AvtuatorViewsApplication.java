package cn.rsems.AvtuatorViews;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AvtuatorViewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvtuatorViewsApplication.class, args);
	}
}
