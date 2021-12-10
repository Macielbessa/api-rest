package tarefando.exemplo.apirest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
@GetMapping(path = "/api/status")
        // método
    public String check(){
        return "Online";
    }

}
