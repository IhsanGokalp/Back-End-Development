package cs.kg.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerAbi {

    @RequestMapping(value = "/{user}",method = RequestMethod.GET)

    public String index(@PathVariable("user") String user, @RequestParam("name") String name) {
        return "Greetings from " + user + " and name: " +  name;
    }
}
