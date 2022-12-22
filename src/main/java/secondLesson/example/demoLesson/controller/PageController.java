package secondLesson.example.demoLesson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import secondLesson.example.demoLesson.model.Header;
import secondLesson.example.demoLesson.model.Line;

import java.util.Arrays;

/*
 @RestController = @Controller + @ResponseBody
 */
@Controller  //method return type is template
// @RestController // method type  is an entity to be serialized
@RequestMapping("admin")
public class PageController {
  // http://localhost:8082/admin/page               //entry point

  @GetMapping("page")
  public String pageHandle(Model model) {
    model.addAttribute("header",
        new Header("Product name","Product price"));

    model.addAttribute("lines", Arrays.asList(
        new Line("Mackbook",1500.00),
        new Line("Lenova",1300.00),
        new Line("Iphone 11",800.00)
    ));
//    model.addAttribute("Line",);


    return "page01";   // template name Template + Model = Html
  }


}
