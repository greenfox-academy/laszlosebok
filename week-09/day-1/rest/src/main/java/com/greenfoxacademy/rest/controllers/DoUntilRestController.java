package com.greenfoxacademy.rest.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dountil/")
public class DoUntilRestController {
  
  @PostMapping("{what}")
  public Object dountil(@PathVariable("what") String operation, @RequestBody Until until) {
    
  }
}
