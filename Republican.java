//Trent Moyar 10/5/2017
import edu.fcps.karel2.Robot;

public class Republican extends MazeEscaper
{
   public void walkDownCurrentSegment()
   {
      if(!rightIsClear()&&frontIsClear())
         move();
      else if(!rightIsClear()&&!frontIsClear())
      {
         turnLeft();
      }
   }
   
   public void turnToTheNextSegment()
   {
      if(rightIsClear())
      {
         turnRight();
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