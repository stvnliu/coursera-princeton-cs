public class RandomWalkers {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int t = 0;
    for (int n = 0; n < trials; n++) {
      int x = 0;
      int y = 0;
      int s = 0;
      while (Math.abs(x) + Math.abs(y) != r) {
        // has not stopped...
        double rand = Math.random();
        // walk randomly
        if (rand >= 0 && rand < 0.25) {x++;}
        else if (rand >= 0.25 && rand < 0.50) {x--;}
        else if (rand >= 0.50 && rand < 0.75) {y++;}
        else if (rand >= 0.75 && rand < 1)    {y--;}
        s++;
      }
      t = t + s;
    }
    System.out.println("average number of steps = " + t / (double)trials);
  }
}
