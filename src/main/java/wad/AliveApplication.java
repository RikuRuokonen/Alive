package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/RikuRuokonen/Alive";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/RikuRuokonen/Alives";
    }
    
    //hello

    public static String herokuUrl() {
        return "https://shrouded-coast-59053.herokuapp.com/";
    }
}
