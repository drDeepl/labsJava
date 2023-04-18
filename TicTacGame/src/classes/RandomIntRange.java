package classes;

import java.util.Random;
public class RandomIntRange {
  private int minimum;
  private int maximum;
    
  public RandomIntRange(int minimum, int maximum){
      this.minimum = minimum;
      this.maximum = maximum;
      
  }
    public int getRandomInt(){
      Random rn = new Random();
      int n = maximum - minimum + 1;
      int i = rn.nextInt() % n;
      return Math.abs(minimum + i);
  }
}
