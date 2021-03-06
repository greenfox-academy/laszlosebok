package gardenapp;

public class Flower extends Plant {
  
  private static final double WATER_ABSORPTION = 0.75;
  
  Flower(String color){
    super(color);
    this.setType("Flower");
  }
  
  public void water(double waterAmount) {
    this.setWaterlevel(this.getWaterlevel() + waterAmount * WATER_ABSORPTION);
  }
}
