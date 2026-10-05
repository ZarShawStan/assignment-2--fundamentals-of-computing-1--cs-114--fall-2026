public class Program1_CountFlips {
  public static void main(String[] args) {
    int flipCount = 0;
    int headsCount = 0;
    int tailsCount = 0;

    while (flipCount < 100) {
      Coin newCoin = new Coin();
      newCoin.flip();

      if (newCoin.isHeads()) {
        ++headsCount;
      } else {
        ++tailsCount;
      }
      ++flipCount;
    }

    System.out.println("Heads: " + headsCount);
    System.out.println("Tails: " + tailsCount);
  }
}

class Coin {
 private final int HEADS = 0;

  public Coin() {
    flip();
  }
  private int face;
  public void flip() {
    face = (int) (Math.random() * 2);
  }

  public boolean isHeads() {
    return (face == HEADS);
  }

  public String toString() {
    String faceName;

    if (face == HEADS) {
      faceName = "Heads";
    } else {
      faceName = "Tails";
    }

    return faceName;
  }
  
}
