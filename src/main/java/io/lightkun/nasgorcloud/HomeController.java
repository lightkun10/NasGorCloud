package io.lightkun.nasgorcloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * A controller class that handles requests for the homepage
 */
@Controller
public class HomeController {

    @GetMapping("/")    // Handle request for the root path
    public String home() {
        return "home";  // Returns the view name
    }

}
