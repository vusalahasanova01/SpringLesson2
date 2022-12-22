package secondLesson.example.demoLesson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import secondLesson.example.demoLesson.model.Line;

@RestController
public class OtherController {
  // http://localhost:8082/item
  @ResponseBody
  @GetMapping("item")
  public Line handle_entity() {
    return new Line("Mackbook", 2500.67);
  }

  @GetMapping("item2")
  public ResponseEntity<Line> handle_entity2() {    //I write ResponseBody manually
    return ResponseEntity.ok(
        new Line("Mackbook", 2500.67));
  }
}
