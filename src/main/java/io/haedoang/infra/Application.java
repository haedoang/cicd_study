package io.haedoang.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class Application {
    private Environment env;

    public Application(Environment env) {
        this.env = env;
    }

    @GetMapping("api/v1/profiles")
    public String getProfiles() {
        return "this Profiles are " + Arrays.toString(env.getActiveProfiles());
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
