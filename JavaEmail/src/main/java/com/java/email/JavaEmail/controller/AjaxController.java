package com.java.email.JavaEmail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class AjaxController {
  
   @GetMapping("/show")
   public String sendEmailPage() {
      return "sendEmail";
   }
   
}