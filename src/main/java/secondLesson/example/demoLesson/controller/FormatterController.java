package secondLesson.example.demoLesson.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import secondLesson.example.demoLesson.model.Line;
import secondLesson.example.demoLesson.service.Formatter;

@RestController
@RequestMapping("fmt")
public class FormatterController {
  private final Formatter f;  //WAY #3
  public FormatterController(@Qualifier("formatterLower") Formatter f){  //we write class name with lower case
    // beacuse, class name situated bean with lower case
    this.f = f;
  }

  @GetMapping("{name}")   //Way 1. Using @Service annotation, create object of class which we want to use
  // 2. Use @Primary 3.Use @Qualifier and write object of class inside
  public Line handle( @PathVariable String name) {
    name = f.format(name);
    return new Line(name, 13.45);

  }
}
