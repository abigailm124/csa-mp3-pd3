public class Feeder {
private int currentFood;

public Feeder(int num) {
  currentFood = num;
}

public void simulateOneDay(int numBirds) {
  if (Math.random() > 0.05) {
      int amount = (int) (Math.random() * 41) + 10;  
      currentFood -= (numBirds * amount);
      if (currentFood < 0) {
          currentFood = 0;
      }
  } else {
      currentFood = 0;
  }
}

public int simulateManyDays(int num, int numDays) {
  int count = 0;
  for (int i = 0; i < numDays; i++) {
      simulateOneDay(num);
      if (currentFood > 0) {
          count++;
      }
  }
  return count;
}
}
