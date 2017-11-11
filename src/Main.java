public class Main {

  public static void  main(String[] arg){

//      short number = 31543;
//      int second = 1370000545;
//      long third = 2100000000;
//      float num4 = 141435645213512453215746846251321321355.45f;
//      double num5 = 3251644324513513548138464135743487496841.e-35;
//      String text = "hello";
//      boolean xz = true; //по умолчанию false
//      int sum = number + second;
//      if (third >= number && sum < third || num5 < num4){
//          System.out.println("trueqwe");
//      }else{
//          System.out.println("falseqwe" );
//      }
//      System.out.println("сумма = " + sum);
//      System.out.println("number = "+ number + text);
//      number = 34;
//
//      System.out.print("number = " + number);
      int s1 = 10;
      int s2 = 12;
      switch (s1){
          case 10:{
              System.out.println("10");
              break;
          }
          case 6:{
              System.out.println("6");
              break;
          }
          case 5:{
              System.out.println("5");
              break;
          }
          default:{
              System.out.println("no match found");
          }
      }
      String text2 = "sdjfkhsd";
      int size = text2.length();
      System.out.println(text2+" длинна текста " + size + "символов");
      String text3 = text2.substring(0,3);
      System.out.println(text3);

  }

}
