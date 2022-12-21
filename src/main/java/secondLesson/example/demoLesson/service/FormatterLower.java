package secondLesson.example.demoLesson.service;

import org.springframework.stereotype.Service;

@Service
public class FormatterLower implements Formatter{
  @Override
  public String format(String origin) {
    return origin.toLowerCase();
  }
}
