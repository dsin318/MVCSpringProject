package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
       // SpringApplication.run(SpringmvcApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SpringmvcApplication.class, args);

    }
}
