public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    int dayOfChristmas = 1;

    //while (dayOfChristmas < 12){
    for (int i = 0; i < dayOfChristmas; i++){
      if (dayOfChristmas == 12) {
        break;
      }
      switch (dayOfChristmas) {
        case 1:
          System.out.print("On the 1st day of Christmas my true love gave to me\nA partridge in a pear tree.\n");
        case 2:
          System.out.print("On the 2nd day of Christmas my true love gave to me \nTwo turtle doves\n");
        case 3:
          System.out.print("On the 3rd day of Christmas my true love gave to me \nThree french hens\n");
        case 4:
          System.out.print("On the 4th day of Christmas my true love gave to me \nFour calling birds\n");
        case 5:
          System.out.print("On the 5th day of Christmas my true love gave to me \nFive golden rings\n");
        case 6:
          System.out.print("On the 6th day of Christmas my true love gave to me \nSix geese a-laying\n");
        case 7:
          System.out.print("On the 7th day of Christmas my true love gave to me \nSeven swans a-swimming\n");
        case 8:
            System.out.print("On the 8th day of Christmas my true love gave to me \nEight maids a-milking\n");
        case 9:
            System.out.print("On the 9th day of Christmas my true love gave to me \nNine ladies dancing\n");
        case 10:
          System.out.print("On the 10th day of Christmas my true love gave to me \nTen lords a-leaping\n");
        case 11:
          System.out.print("On the 11th day of Christmas my true love gave to me \nEleven pipers piping\n");
        case 12:
          System.out.print("On the 12th day of Christmas my true love gave to me \nTwelve drummers drumming\n");
        //dayOfChristmas +=1;
      }
    }
  }
}

