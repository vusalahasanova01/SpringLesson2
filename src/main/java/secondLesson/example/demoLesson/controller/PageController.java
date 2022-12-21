package secondLesson.example.demoLesson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import secondLesson.example.demoLesson.model.Line;
/*
 @RestController = @Controller + @ResponseBody
 */
@Controller  //method return type is template
@RestController // method type  is an entity to be serialized
@RequestMapping("admin")
public class PageController {
  // http://localhost:8082/page

  @GetMapping("page")
  public String pageHandle(Model model) {
    return "page01";
  }

  // http://localhost:8082/item
  @ResponseBody
  @GetMapping("item")
  public Line handle_entity(){
    return new Line("Mackbook",2500.67);
  }

  @GetMapping("item2")
  public ResponseEntity <Line> handle_entity2(){    //I write ResponseBody manually
    return ResponseEntity.ok(
    new Line("Mackbook",2500.67));
  }

}
