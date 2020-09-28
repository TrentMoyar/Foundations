// Trent Moyar 8-31-17
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(8,8);
      Display.setSpeed(10);
      
      Athlete max = new Athlete();
      
      max.putAndMove();
      max.turnRight();
      max.putAndMove();
      max.turnRight();
      max.putAndMove();
      max.turnLeft();
      max.putAndMove();
      max.turnLeft();
      max.putAndMove();
      max.turnRight();
      max.putAndMove();
      max.putAndMove();
      max.turnRight();
      max.putAndMove();
      max.turnLeft();
      max.putAndMove();
      max.turnLeft();
      max.putAndMove();
      max.putAndMove();
      max.putAndMove();
      max.putAndMove();
      max.turnRight();
      max.putAndMove();
      max.putAndMove();
   }
}