package via.doc.containersexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainersExampleApplication {

    @RequestMapping("/")
    public String index()
    {
        return "<body><h1>Containerization and Orchestration</h1>" +
                "<h2>Dockerizing Spring Boot Backend Application </h2>" +
                "<p>With docker, we can containerize SEP4 backend and frontend apps. </p></body>";
    }
    public static void main(String[] args) {
        SpringApplication.run(ContainersExampleApplication.class, args);
    }

}
