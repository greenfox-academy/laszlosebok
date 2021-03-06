package com.greenfoxacademy.rest.models;

import java.util.Arrays;

public class OperationArrayResponse {
  
  private int[] result;
  
  public OperationArrayResponse(OperationModel operation) {
    result = calculateDouble(operation);
  }
  
  private int[] calculateDouble(OperationModel operation) {
    int[] numbers = operation.getNumbers();
    
    return Arrays.stream(numbers)
        .map(i -> i * 2)
        .toArray();
  }
  
  public int[] getResult() {
    return result;
  }
  
  public void setResult(int[] result) {
    this.result = result;
  }
}
