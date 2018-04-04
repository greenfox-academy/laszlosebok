package com.greenfoxacademy.bankofsimba.model;

//Add this BankAccount to the model
//Create a thymeleaf template where you show the fields of the BankAccount

public class BankAccount {
  
  private String name;
  private int balance;
  private String animalType;
  
  private BankAccount(){
  }
  
  public BankAccount(String name, int balance, String animalType) {
    this();
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
  
  public String getName() {
    return name;
  }
  
  public int getBalance() {
    return balance;
  }
  
  public String getAnimalType() {
    return animalType;
  }
}
