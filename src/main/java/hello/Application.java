package greetings;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /**
     * identifier for command line port configuration option
     */
    private static final String PORT_OPTION = "port";

    /**
     * Processes command line arguments and launches the Spring application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String serverPort = null;

        /*
         * Check for port option command line arg. - option format is <option>=<value> -
         * only checking for port option - not handling invalid arg cases for brevity.
         */
        for (String arg : args) {
            String[] tokens = arg.split("=");
            if (tokens.length == 2 && tokens[0].equals(PORT_OPTION)) {
                serverPort = tokens[1];
            }
        }

        SpringApplication application = new SpringApplication(Application.class);
        if (serverPort != null && !serverPort.isEmpty()) {
            application.setDefaultProperties(Collections.singletonMap("server.port", serverPort));
        }
        application.run(args);
    }
}
