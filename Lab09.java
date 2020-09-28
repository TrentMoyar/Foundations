//Trent Moyar 9-21-17

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete joe = new Athlete(1, 1, Display.EAST, 0);
      
      for(int k = 1; k <= 6; k++)
         joe.move();
      
      for(int z = 1; z <= 7; z++)
      {
         while(joe.nextToABeeper())
            joe.pickBeeper();
         joe.move();
         
         while(joe.hasBeepers())
            joe.putBeeper();
         
         joe.turnAround();
         joe.move();
         
         if(joe.frontIsClear())
         {
            joe.move();
            joe.turnAround();
         }
      }
   }
}
      
