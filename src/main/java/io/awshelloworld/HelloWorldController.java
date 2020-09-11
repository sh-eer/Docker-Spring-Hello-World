package io.reflectoring.awshelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.text.SimpleDateFormat;

@RestController
public class HelloWorldController {

  @GetMapping("/hello")
  public String helloWorld(){
    Date date = new Date(); // This object contains the current date value
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String message = "Hello World \n" + (formatter.format(date));
    return message;
  }

}
