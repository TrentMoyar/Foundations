//Trent Moyar 9-26-17

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab10
{
   public static void followWallsRight(Athlete arg)
   {
      while(!arg.nextToABeeper())
      {
         if(arg.rightIsClear())
         {
            arg.turnRight();
            arg.move();
         }
         else if(arg.frontIsClear())
         {
            arg.move();
         }
         else if(arg.leftIsClear())
         {
            arg.turnLeft();
            arg.move();
         }
         else
         {
            arg.turnAround();
         }
            
      }
   }
   
   public static void followWallsLeft(Athlete arg)
   {
      while(!arg.nextToABeeper())
      {
         if(arg.leftIsClear())
         {
            arg.turnLeft();
            arg.move();
         }
         else if(arg.frontIsClear())
            arg.move();
         else if(arg.rightIsClear())
         {
            arg.turnRight();
            arg.move();
         }
         else
            arg.turnAround();
      }
   }
   
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete bob = new Athlete();
      
      
      if(Math.random() < 0.5)
         followWallsLeft(bob);
      
      else
         followWallsRight(bob);
      
   }
}
      
