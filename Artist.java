// Trent Moyar 10/17/2017
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Artist extends PixelArt {
   private int[] prgm = new int[9];
   public Artist() {
      super();
   }
   public void doRow() {
      while(!facingEast())
         turnLeft();
      for(int i=0; i<8; i++)
      {
         for(int z = 0; z < 8; z++)
         {
            if(!nextToABeeper())
               putBeeper();
            else
               pickBeeper();
            move();
         
         }
         turnAround();
         for(int z = 0; z < 8; z++)
         {
            move();
         }
         turnLeft();
         move();
         turnLeft();
      }
   }
      
      
   
   public void doColumn() {
      for(int i=0; i<8; i++)
      {
         for(int q = 0; q < 8; q++)
         {
            if(!nextToABeeper())
               putBeeper();
            else
               pickBeeper();
            move();
         }
         turnAround();
         for(int z = 0; z < 8; z++)
         {
            move();
         }
         turnLeft();
         move();
         turnLeft();
      }
   }

   public void doQuad() {
      for(int i=0; i<4; i++)
      {
         for(int a = 1; a <= 4; a++)
         {
            move();
            if(!nextToABeeper())
               putBeeper();
            else
               pickBeeper();
         }
         turnRight();
         for(int s = 1; s <= 3; s++)
         {
            move();
            if(!nextToABeeper())
               putBeeper();
            else
               pickBeeper();
         }
      }
   }
   public void doSquare() {
      for (int g = 0; g < 8; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
      turnRight();
      for (int g = 0; g < 7; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
      turnRight();
      for (int g = 0; g < 7; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
   
      turnRight();
      for (int g = 0; g < 5; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
      turnRight();
      for (int g = 0; g < 5; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
      turnRight();
      for (int g = 0; g < 3; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
      turnRight();
      for (int g = 0; g < 3; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
      turnRight();
      for (int g = 0; g < 1; g++)
      {
         move();
         if(!nextToABeeper())
            putBeeper();
         else
            pickBeeper();
      }
   }
}
