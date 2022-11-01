package cloud.forum.webapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {

    @Value("${helloworld.message:Property not set from the config server.... awks!}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}