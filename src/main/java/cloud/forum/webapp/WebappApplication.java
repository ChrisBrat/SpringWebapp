package cloud.forum.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {

		try{
			System.err.println("Application started.... sleeping for 30 seconds");
			Thread.sleep(30000);
		} catch (Throwable t){
			t.printStackTrace();
		}
		System.err.println("Starting spring");

		SpringApplication.run(WebappApplication.class, args);
	}

}
