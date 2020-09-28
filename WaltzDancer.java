//Trent Moyar 10-3-17
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class WaltzDancer extends Dancer
{
   public WaltzDancer()
   {
      super(1,1,Display.EAST, 0);
   }
   public WaltzDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void danceStep()
   {
      move();
      turnLeft();
      move();
      turnRight();
      move();
      turnRight();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnLeft();
   }
}