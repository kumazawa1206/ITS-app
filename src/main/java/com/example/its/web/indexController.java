package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

  @GetMapping("/")
  @ResponseBody //戻り値のStringをResponseする。
  public String index() {
    return "<h1>Hello,World!</h1>";
  }

}
