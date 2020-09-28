//Trent Moyar 10/5/2017
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   
public abstract class MazeEscaper extends Athlete implements Runnable
{
   public MazeEscaper()
   {
      super(1, 6, Display.SOUTH, 0);
   
   }
   public abstract void walkDownCurrentSegment();
   public abstract void turnToTheNextSegment();
}