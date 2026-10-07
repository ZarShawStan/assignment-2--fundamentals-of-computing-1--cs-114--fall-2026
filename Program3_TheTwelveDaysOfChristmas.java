public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    int dayOfChristmas = 0;
    String daySuffix = "";

    while (dayOfChristmas <= 12){
      dayOfChristmas++;
      if (dayOfChristmas > 12) {
          break;
        }
           
      switch(dayOfChristmas) {
        case 1:
        case 2:
          daySuffix = "st";
          break;
        case 3: 
          daySuffix = "rd";
          break;
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
          daySuffix = "th";
          break;
      }

      System.out.print("On the "+ dayOfChristmas + daySuffix + " day of Christmas my true love gave to me\n");
      
      switch(dayOfChristmas) {
        case 12:
          System.out.print("Twelve drummers drumming,\n");
        case 11:
          System.out.print("Eleven pipers piping,\n");
        case 10:
          System.out.print("Ten lords a-leaping,\n");
        case 9:
          System.out.print("Nine ladies dancing,\n");
        case 8:
          System.out.print("Eight maids a-milking,\n");
        case 7:
          System.out.print("Seven swans a-swimming,\n");
        case 6:
          System.out.print("Six geese a-laying,\n");
        case 5:
            System.out.print("Five golden rings,\n");
        case 4:
            System.out.print("Four calling birds,\n");
        case 3:
          System.out.print("Three french hens,\n");
        case 2:
          System.out.print("Two turtle doves, and\n");
        case 1:
          System.out.print("A partridge in a pear tree.\n\n");
        
      }
    } 
  }
}



