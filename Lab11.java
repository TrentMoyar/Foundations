//Trent Moyar 9-26-17
import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Lab11
{
   public static void main(String[] args)
   {
   
      Display.setSize(42, 37);
      Display.setSpeed(10);
   
      new One(1,9).display();
      new Five(7,9).display();
      new Three(13,9).display();
      new Three(19,9).display();
      new One(25,9).display();
      new Two(31,9).display();
      new Two(37,9).display();
   }
}