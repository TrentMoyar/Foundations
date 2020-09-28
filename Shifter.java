//Trent Moyar 10/4/2017
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Shifter extends Robot implements Runnable, Workable
{
   private int myBeepers;
   public Shifter(int y)
   {
      super(1, y, Display.EAST, 0);
   
   }
   public void run()
   {
      
      for(int k = 1;k <= 6; k++)
      {
         moveOneBlock();
      }
      turnLeft();
      turnLeft();
      for(int z = 1; z <= 7; z++)
         workCorner();
   }
   public void workCorner()
   {
      myBeepers = 0;
      while(nextToABeeper())
      {
         pickBeeper();
         myBeepers++;
      }
      turnLeft();
      turnLeft();
      moveOneBlock();
      
         
      if(hasBeepers()){
         for(int k = 1; k <= myBeepers; k++)
            putBeeper();
      }
      turnLeft();
      turnLeft();
      moveOneBlock();
      if(frontIsClear())
         moveOneBlock();
   
   }
   public void moveOneBlock()
   {
      move();
   }
   public void turnToTheRight()
   {
      turnLeft();
      turnLeft();
      turnLeft();
   }
   public void turnToTheNorth()
   {
      while(!facingNorth())
         turnLeft();
      
   }
}