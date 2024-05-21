public class Main {
  public static void main(String[] args) {
    System.out.println("FRQ1!");

    Feeder f1 = new Feeder(2400);
    int test = f1.simulateManyDays(10, 4);
    System.out.println(test);

    Feeder f2 = new Feeder(250);
    int test1 = f2.simulateManyDays(10, 5);
    System.out.println(test1);

    Feeder f3 = new Feeder(0);
    int test2 = f3.simulateManyDays(5, 10);
    System.out.println(test2);
  }
}
