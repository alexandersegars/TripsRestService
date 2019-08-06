package greetings;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RestController
public class GreetingController {

    @Autowired
    private RequestMappingHandlerMapping mapping;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "") final String firstName,
            @RequestParam(value = "lastName", defaultValue = "") final String lastName) {
        return new Greeting(firstName, lastName);
    }

    // Note - I didn't figure out how to do endpoint "/"
    @RequestMapping("/endpoints")
    public Endpoints endpoints() {
        return new Endpoints(mapping);
    }

}
