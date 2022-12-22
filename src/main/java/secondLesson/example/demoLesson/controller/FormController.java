package secondLesson.example.demoLesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import secondLesson.example.demoLesson.model.FormLogin;

@Controller
@RequestMapping("fm")
// http://localhost:8081/fm
public class FormController {
  @GetMapping
   public String pageHandle(){
    return "form2";
  }

  @PostMapping("process")  //i can use this url inside form2.html file, because i show that what is the action
  @ResponseBody

  public String formProcess(FormLogin formLogin){
    //System.out.println(formLogin);
    return String.format("Got the form, %s",formLogin);
  }
}
