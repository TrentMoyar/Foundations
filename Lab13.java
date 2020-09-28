// Trent Moyar 10-17-2017
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab13
{
   public static void execute(PixelArt arg)
   {
      int prog[] = arg.readPrgm();
      for (int k = 0; k < 9; k++)
      {
         switch(prog[k]) {
            case 1:
               arg.goTo(6, 5);
               arg.doSquare();
               break;
            case 2:
               arg.goTo(6, 9);
               arg.doQuad();
               break;
            case 3:
               arg.goTo(6, 13);
               while(!arg.facingEast())
                  arg.turnLeft();
               arg.doRow();
               break;
            case 4:
               arg.goTo(6, 6);
               arg.doColumn();
               break;
         }
      }
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/rotatetest.map");
      Display.setSize(14,14);
      Display.setSpeed(10);
    
      Supervisor joe = new Supervisor();
    
      int type = joe.findType();
    
      if(type == 1)
      {
         Artist bob = new Artist();
         execute(bob);
      }
      else if(type == 2)
      {
         Rotator mary = new Rotator();
         execute(mary);
      }
      else
      {
         Transformer tom = new Transformer();
         execute(tom);
      }
    
    
   }
}