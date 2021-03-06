public class Fox {
  
  private String name;
  private String type;
  private String color;
  
  Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }
  
  public String getType() {
    return type;
  }
  
  public String getColor() {
    return color;
  }
  
  @Override
  public String toString() {
    return "[" + name + ", " + type + ", " + color + "]";
  }
}
