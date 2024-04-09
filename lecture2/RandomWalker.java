public class RandomWalker {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    int s = 0;
    while (Math.abs(x) + Math.abs(y) != r) {
      // has not stopped...
      System.out.println("("+x+", "+y+")");
      double rand = Math.random();
      // walk randomly
      if (rand >= 0 && rand < 0.25) {x++;}
      else if (rand >= 0.25 && rand < 0.50) {x--;}
      else if (rand >= 0.50 && rand < 0.75) {y++;}
      else if (rand >= 0.75 && rand < 1)    {y--;}
      s++;
    }
    System.out.println("steps = "+s);
  }
}
