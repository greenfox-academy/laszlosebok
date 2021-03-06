package com.greenfoxacademy.dependency.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService implements ColorGenerator {
  
  private ArrayList<String> colors;
  private Random random;
  
  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }
  
  @Override
  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }
}