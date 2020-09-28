//Trent Moyar 9-7-17
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04
{
   public static void takeTheField(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(8);
      
      Athlete ath1 = new Athlete();
      Athlete ath2 = new Athlete();
      Athlete ath3 = new Athlete();
      Athlete ath4 = new Athlete();
      Athlete ath5 = new Athlete();
      Athlete ath6 = new Athlete();
      
      Athlete coach = new Athlete(2, 6, Display.EAST, 1);
      
      takeTheField(ath1);
      takeTheField(ath2);
      takeTheField(ath3);
      takeTheField(ath4);
      takeTheField(ath5);
      takeTheField(ath6);
      
      ath1.move();
      ath1.move();
      ath1.move();
      ath1.turnLeft();
      ath1.move();
      ath1.move();
      ath1.turnAround();
      
      ath2.move();
      ath2.move();
      ath2.move();
      ath2.move();
      ath2.move();
      ath2.turnLeft();
      ath2.move();
      ath2.turnAround();
      
      ath3.move();
      ath3.move();
      ath3.move();
      ath3.move();
      ath3.turnRight();
      
      ath4.move();
      ath4.move();
      ath4.move();
      ath4.turnRight();
      
      ath5.move();
      ath5.move();
      ath5.turnRight();
      
      ath6.move();
      ath6.turnLeft();
      ath6.move();
      ath6.turnAround();
   }
}