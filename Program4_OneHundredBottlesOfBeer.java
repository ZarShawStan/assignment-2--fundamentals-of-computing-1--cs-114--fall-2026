import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    int bottlesOfBeer = 100;
    Scanner sc = new Scanner(System.in);
    System.out.print("How many verses of the song 'One Hundred Bottles of Beer' would you like to print? ");
    int versesToPrint = sc.nextInt();
    sc.close();

    while (bottlesOfBeer > 0){
      for (int i = 0; i < versesToPrint; i++ ){
        if (bottlesOfBeer == 0){
          break;
        }
        System.out.print(bottlesOfBeer + " bottles of beer on the wall \n" 
        + bottlesOfBeer + " bottles of beer\n" 
        + "If one of those bottles should happen to fall\n" 
        + (bottlesOfBeer -1) + " bottles of beer on the wall\n\n" );
        bottlesOfBeer -=1;
      }
    }
  }
}
