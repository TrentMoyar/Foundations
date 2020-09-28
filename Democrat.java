//Trent Moyar 10/5/2017
import edu.fcps.karel2.Robot;

public class Democrat extends MazeEscaper
{
   public void walkDownCurrentSegment()
   {
      if(!leftIsClear()&&frontIsClear())
         move();
      else if(!leftIsClear()&&!frontIsClear())
      {
         turnRight();
      }
   }
   
   public void turnToTheNextSegment()
   {
      if(leftIsClear())
      {
         turnLeft();
         move();
      }
   }
   public void run()
   {
      walkDownCurrentSegment(); //you are not at the end at the start
      while(!nextToABeeper())
      {
         turnToTheNextSegment();
         walkDownCurrentSegment();
      }
   }
}