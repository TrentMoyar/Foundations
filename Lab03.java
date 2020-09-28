//Trent Moyar 9-5-17
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(8);
      
      Climber bob = new Climber(8);
      Climber alex = new Climber(8);
      
      bob.putBeeper();
      bob.turnRight();
      alex.turnRight();
      bob.move();
      alex.move();
      bob.climbUpRight();
      alex.climbUpRight();
      bob.climbUpRight();
      alex.climbUpRight();
      bob.climbUpRight();
      alex.climbUpRight();
      bob.climbDownRight();
      alex.climbDownRight();
      bob.climbDownRight();
      alex.climbDownRight();
      bob.pickBeeper();
      bob.turnAround();
      alex.turnAround();
      bob.climbUpLeft();
      alex.climbUpLeft();
      bob.climbUpLeft();
      alex.climbUpLeft();
      bob.climbDownLeft();
      alex.climbDownLeft();
      bob.climbDownLeft();
      alex.climbDownLeft();
      bob.climbDownLeft();
      alex.climbDownLeft();
      bob.move();
      alex.move();
      alex.pickBeeper();
   }
}
