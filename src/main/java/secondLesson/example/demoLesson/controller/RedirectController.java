package secondLesson.example.demoLesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("redirect")
public class RedirectController {
  // http://localhost:8082/redirect/1
  @GetMapping("1")
  public String handle() {
    //full url for external resource
    return "redirect:https://google.com";
  }

  // http://localhost:8082/redirect/2
  @GetMapping("2")
  public String handle2() {
    return "redirect:/fm";
  }
  // http://localhost:8082/redirect/3
  @GetMapping("3")
  public RedirectView handle3() {
    //full url for external resource
    return new RedirectView("https://google.com");
  }

  // http://localhost:8082/redirect/4
  @GetMapping("4")
  public RedirectView handle4() {
    return new RedirectView("/fm");
  }

}
