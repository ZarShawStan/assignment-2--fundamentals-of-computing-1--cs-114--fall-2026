import java.util.Scanner;

public class Program2_PrintVowelsAndNonVowels {
  static int vowelACount = 0;
  static int vowelECount = 0;
  static int vowelICount = 0;
  static int vowelOCount = 0;
  static int vowelUCount = 0;
  static int nonVowelCount = 0;
  static int nonPrintableCount = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string of letters: ");
    String userString = sc.nextLine();
    sc.close();

    for (int i = 0; i < userString.length(); i++) {
      char charInString = Character.toLowerCase(userString.charAt(i));

      if (charInString == 'a') {
        vowelACount++;
      } else if (charInString == 'e') {
        vowelECount++;
      } else if (charInString == 'i') {
        vowelICount++;
      } else if (charInString == 'o') {
        vowelOCount++;
      } else if (charInString == 'u') {
        vowelUCount++;
      } else if (Character.isLetter(charInString)) {
        nonVowelCount++;
      } else if (charInString < 0x20 || charInString == 0x7F){
        nonPrintableCount++;
      }
    }

    System.out.println("a: " + vowelACount);
    System.out.println("e: " + vowelECount);
    System.out.println("i: " + vowelICount);
    System.out.println("o: " + vowelOCount);
    System.out.println("u: " + vowelUCount);
    System.out.println("non-vowels: " + nonVowelCount);
    System.out.println("non-printable: " + nonPrintableCount);
  }
}
