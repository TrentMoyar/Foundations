// Trent Moyar 10-17-2017
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public abstract class PixelArt extends Athlete
{
   public int prgm[] = new int[9];
   public PixelArt()
   {
      super(4,4,Display.EAST, Display.INFINITY);
   }
   public void goTo(int posX, int posY)
   {
      while(!facingEast())
         turnLeft();
      while(getX() < posX)
         move();
      while(!facingWest())
         turnLeft();
      while(getX() > posX)
         move();
      while(!facingSouth())
         turnLeft();
      while(getY() > posY)
         move();
      while(!facingNorth())
         turnLeft();
      while(getY() < posY)
         move();
   }
   public int[] readPrgm() {
      for(int i=0; i < 9; i++)
      {
         prgm[i] = 0;
      }
      for(int i=0; i<9; i++) {
         move();
         if(!nextToABeeper()) prgm[i] = 0;
         while(nextToABeeper()) {
            pickBeeper();
            prgm[i]++;
         }
      }
      return prgm;
   }
   public abstract void doRow();
   public abstract void doColumn();
   public abstract void doSquare();
   public abstract void doQuad();
}