package studenthccs.com.CloudWebApplication;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@CrossOrigin(origins = "*")  // allows AngularJS to access this API
public class WelcomeController {

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to DigitalCloudMade Spring Boot REST API!";
    }
}*/


import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // allow AngularJS to access it
public class WelcomeController {

    @GetMapping("/welcome")
    public Map<String, String> getWelcome() {
        return Map.of(
            "title", "Welcome to Digital Cloud Learner!",
            "message", "Start your learning journey today and transform your future",
            "info1", "50,000+ students worldwide",
            "info2", "⭐ 4.9/5 rating"
        );
    }

    @GetMapping("/welcome/{name}")
    public Map<String, String> getPersonalizedWelcome(@PathVariable String name) {
        return Map.of(
            "title", "Welcome, " + name + "!",
            "message", "Your learning adventure starts now at Digital Cloud Learner 🚀",
            "info1", "50,000+ students worldwide",
            "info2", "⭐ 4.9/5 rating"
        );
    }

    @GetMapping("/stats")
    public Map<String, Object> getStats() {
        return Map.of(
            "students", 50000,
            "courses", 500,
            "instructors", 200,
            "successRate", 95
        );
    }
}

