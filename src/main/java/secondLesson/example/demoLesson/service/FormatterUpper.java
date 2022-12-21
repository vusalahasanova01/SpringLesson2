package secondLesson.example.demoLesson.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary //WAY #2
public class FormatterUpper implements Formatter {
  @Override
  public String format(String origin) {
    return origin.toUpperCase();
  }
}
