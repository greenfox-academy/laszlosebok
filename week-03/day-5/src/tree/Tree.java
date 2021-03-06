package tree;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  private static final int LINE_LENGTH_DIFF = 10;
  private static final int ANGLE_DIFF = 20;
  
  private static int WIDTH = 1500;
  private static int HEIGHT = 1500;
  
  private static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/project/fractals/tree.png
    
    int n = 0;
    int lineLength = 80;
    int[] startingCoordinates = {WIDTH/2, HEIGHT, WIDTH/2, HEIGHT};
    int angle = 0;
    drawLines(graphics, startingCoordinates, lineLength, angle, n);
  }
  
  private static void drawLines(Graphics graphics, int[] startingCoordinates, int lineLength, int angle, int n) {
    
    // Don't change this above 10!
    if (n > 8) {
      return;
    }
    
    int[] newCoordinates = calcCoordinates(startingCoordinates, lineLength, angle);
    Line.draw(graphics, newCoordinates);
    
    drawLines(graphics, newCoordinates, lineLength, angle, n+1);
    drawLines(graphics, newCoordinates, lineLength - LINE_LENGTH_DIFF,angle + ANGLE_DIFF, n+1);
    drawLines(graphics, newCoordinates, lineLength - LINE_LENGTH_DIFF,angle - ANGLE_DIFF, n+1);
    
  }
  
  private static int[] calcCoordinates(int[] startingCoordinates, int lineLength, int angle) {
    int[] newCoordinates = new int[4];
    
    newCoordinates[0] = startingCoordinates[2];
    newCoordinates[1] = startingCoordinates[3];
    newCoordinates[2] = ((int) (startingCoordinates[2] + lineLength * Math.sin(Math.toRadians(angle))));
    newCoordinates[3] = ((int) (startingCoordinates[3] - lineLength * Math.cos(Math.toRadians(angle))));
    
    return newCoordinates;
  }
  
  // Don't touch the code below
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}