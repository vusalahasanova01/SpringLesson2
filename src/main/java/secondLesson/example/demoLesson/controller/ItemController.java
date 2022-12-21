package secondLesson.example.demoLesson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import secondLesson.example.demoLesson.model.Line;
@RestController
@RequestMapping("product")
public class ItemController {
//bu methodu pagecontrollerin icinde de yazsaq ve url eyni olsa ishlmeyecek cunki hansinin run edilmesini spring anlamir,
// ona gore urlleri ferqli yaziriq
  @GetMapping("item2")
  public ResponseEntity<Line> handle_entity2() {    //I write ResponseBody manually
    return ResponseEntity.ok(
        new Line("Mackbook", 2500.68));
  }
}
