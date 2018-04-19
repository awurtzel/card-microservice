package microservice.controllers;

import microservice.beans.Card;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public Card card(@RequestParam(value="name", defaultValue="World") String name) {
        return new Card(0, "SUPER asdf");
    }
}
