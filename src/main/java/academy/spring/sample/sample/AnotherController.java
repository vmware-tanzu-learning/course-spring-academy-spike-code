package academy.spring.sample.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class AnotherController {
    @GetMapping
    String anotherGetEndpoint() {
        return "Another get endpoint";
    }
}
