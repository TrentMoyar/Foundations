//Trent Moyar 9-21-17

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab08
{
   public static void race(Robot arg)
   {
      Racer arg2 = (Racer)arg;
      while(!arg.nextToABeeper())
      {
         if(arg.frontIsClear())
         {
            arg2.move();
         }
         else
         {
            arg2.jumpRight();
         }
      }
   }
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      String type = JOptionPane.showInputDialog("What type of racer?");
   
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(18, 16);
      Display.setSpeed(10);
   
      if(type.equals("Racer"))
      {
         race( new Racer(1) );
      }
      else if(type.equals("SteepleChaseRacer"))
      {
         race( new SteepleChaseRacer(1) );
      }
      else if(type.equals("BoxTopRacer"))
      {
         race( new BoxTopRacer(1) );
      }
      else
      {
         System.out.println("Invalid robot type.");
      }
   }
}