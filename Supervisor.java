// Trent Moyar 10/17/2017
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Supervisor {
   
   public int findType() 
   {
      Athlete finder = new Athlete(4, 4, Display.EAST, 0);
      
      while(finder.nextToABeeper()) finder.pickBeeper();
      
      int type = finder.getBeepers();
      
      finder.explode();
      
      return type;
      
   }
}
