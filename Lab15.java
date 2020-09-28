//Trent Moyar 10-3-2017
import edu.fcps.karel2.Display;

public class Lab15
{
   public static void main(String[] args)
   {
      Display.setSize(20, 20);
      Display.setSpeed(6);
   
      SquareDancer weismuller = new SquareDancer(1,1,Display.EAST,0);
      WaltzDancer fraser = new WaltzDancer(8,6,Display.NORTH,0);
      LineDancer spitz = new LineDancer(1,15,Display.EAST,0);
      
      Thread t1 = new Thread( weismuller );
      Thread t2 = new Thread( fraser );
      Thread t3 = new Thread( spitz );
      
      t1.start();
      t2.start();
      t3.start();
   }
}