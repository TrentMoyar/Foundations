//Trent Moyar 10-3-17
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class SquareDancer extends Dancer
{
   public SquareDancer()
   {
      super(1,1,Display.EAST, 0);
   }
   public SquareDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void danceStep()
   {
      for(int k = 1;k <= 4; k++)
      {
         move();
         move();
         turnLeft();
      }
   }
}