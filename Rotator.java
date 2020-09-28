// Trent Moyar 10/17/2017
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Rotator extends PixelArt {
   private int[] prgm = new int[9];
   public Rotator() {
      super();
   }
   public void doRow() {
      int a[] = new int [8];
      int b[] = new int [8];
      int c[] = new int [8];
      int d[] = new int [8];
      int e[] = new int [8];
      int f[] = new int [8];
      int g[] = new int [8];
      int h[] = new int [8];
      int j[] = new int [8];
      
      for(int k = 0; k < 8; k++)
      {
         a[k] = 0;
         b[k] = 0;
         c[k] = 0;
         d[k] = 0;
         e[k] = 0;
         f[k] = 0;
         g[k] = 0;
         h[k] = 0;
         j[k] = 0;
      }
      for(int q = 0; q < 8; q++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            a[q]++;
   
         
            
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
      for(int b1 = 0; b1 < 8; b1++)
      {

            if(nextToABeeper())
               pickBeeper();
            b[b1]++;

         
            
         move();
      }
      turnAround();
      for(int z1 = 0; z1 < 8; z1++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int c1 = 0; c1 < 8; c1++)
      {
       
            if(nextToABeeper())
               pickBeeper();
            c[c1]++;
       
         
            
         move();
      }
      turnAround();
      for(int z2 = 0; z2 < 8; z2++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int d1 = 0; d1 < 8; d1++)
      {
         
            if(nextToABeeper())
               pickBeeper();
            d[d1]++;
        
         
            
         move();
      }
      turnAround();
      for(int z3 = 0; z3 < 8; z3++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int e1 = 0; e1 < 8; e1++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            e[e1]++;
        
         
            
         move();
      }
      turnAround();
      for(int z4 = 0; z4 < 8; z4++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int f1 = 0; f1 < 8; f1++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            f[f1]++;
       
         
            
         move();
      }
      turnAround();
      for(int z5 = 0; z5 < 8; z5++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int g1 = 0; g1 < 8; g1++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            g[g1]++;
      
         
            
         move();
      }
      turnAround();
      for(int z6 = 0; z6 < 8; z6++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int h1 = 0; h1 < 8; h1++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            h[h1]++;
       
         
            
         move();
      }
      turnAround();
      for(int z7 = 0; z7 < 8; z7++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      //Putting down the beepers
      goTo(6,13);
      while(!facingSouth())
         turnLeft();
      
      for(int z11 = 0; z11 < 8; z11++)
      {
         if (a[z11] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z10 = 0; z10 < 8; z10++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
      for(int z12 = 0; z12 < 8; z12++)
      {
         if (b[z12] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z2 = 0; z2 < 8; z2++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
      for(int z13 = 0; z13 < 8; z13++)
      {
         if (c[z13] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z3 = 0; z3 < 8; z3++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
      for(int z14 = 0; z14 < 8; z14++)
      {
         if (d[z14] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z4 = 0; z4 < 8; z4++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
      for(int z15 = 0; z15 < 8; z15++)
      {
         if (e[z15] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z5 = 0; z5 < 8; z5++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
      for(int z16 = 0; z16 < 8; z16++)
      {
         if (f[z16] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z6 = 0; z6 < 8; z6++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
      for(int z17 = 0; z17 < 8; z17++)
      {
         if (g[z17] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z7 = 0; z7 < 8; z7++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
      for(int z18 = 0; z18 < 8; z18++)
      {
         if (h[z18] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z8 = 0; z8 < 8; z8++)
      {
         move();
      }
      turnRight();
      move();
      turnRight();
   }
   public void doColumn() {
      int a[] = new int [8];
      int b[] = new int [8];
      int c[] = new int [8];
      int d[] = new int [8];
      int e[] = new int [8];
      int f[] = new int [8];
      int g[] = new int [8];
      int h[] = new int [8];
      int j[] = new int [8];
      
      for(int k = 0; k < 8; k++)
      {
         a[k] = 0;
         b[k] = 0;
         c[k] = 0;
         d[k] = 0;
         e[k] = 0;
         f[k] = 0;
         g[k] = 0;
         h[k] = 0;
         j[k] = 0;
      }
      for(int q = 0; q < 8; q++)
      {
         if(!nextToABeeper())
         {
            if(nextToABeeper())
               pickBeeper();
            a[q]++;
         }
         
            
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
      for(int b1 = 0; b1 < 8; b1++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            b[b1]++;
        
         
            
         move();
      }
      turnAround();
      for(int z1 = 0; z1 < 8; z1++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int c1 = 0; c1 < 8; c1++)
      {
         
            if(nextToABeeper())
               pickBeeper();
            c[c1]++;
         
         
            
         move();
      }
      turnAround();
      for(int z2 = 0; z2 < 8; z2++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int d1 = 0; d1 < 8; d1++)
      {
         
            if(nextToABeeper())
               pickBeeper();
            d[d1]++;
        
         
            
         move();
      }
      turnAround();
      for(int z3 = 0; z3 < 8; z3++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int e1 = 0; e1 < 8; e1++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            e[e1]++;
        
         
            
         move();
      }
      turnAround();
      for(int z4 = 0; z4 < 8; z4++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int f1 = 0; f1 < 8; f1++)
      {
         
            if(nextToABeeper())
               pickBeeper();
            f[f1]++;
       
         
            
         move();
      }
      turnAround();
      for(int z5 = 0; z5 < 8; z5++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int g1 = 0; g1 < 8; g1++)
      {
         
            if(nextToABeeper())
               pickBeeper();
            g[g1]++;
        
         
            
         move();
      }
      turnAround();
      for(int z6 = 0; z6 < 8; z6++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int h1 = 0; h1 < 8; h1++)
      {
        
            if(nextToABeeper())
               pickBeeper();
            h[h1]++;
        
         
            
         move();
      }
      turnAround();
      for(int z7 = 0; z7 < 8; z7++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      //Putting down the beepers
      goTo(6,6);
      while(!facingEast())
         turnLeft();
      
      for(int z11 = 0; z11 < 8; z11++)
      {
         if (a[z11] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z10 = 0; z10 < 8; z10++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int z12 = 0; z12 < 8; z12++)
      {
         if (b[z12] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z2 = 0; z2 < 8; z2++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int z13 = 0; z13 < 8; z13++)
      {
         if (c[z13] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z3 = 0; z3 < 8; z3++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int z14 = 0; z14 < 8; z14++)
      {
         if (d[z14] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z4 = 0; z4 < 8; z4++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int z15 = 0; z15 < 8; z15++)
      {
         if (e[z15] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z5 = 0; z5 < 8; z5++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int z16 = 0; z16 < 8; z16++)
      {
         if (f[z16] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z6 = 0; z6 < 8; z6++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int z17 = 0; z17 < 8; z17++)
      {
         if (g[z17] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z7 = 0; z7 < 8; z7++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
      for(int z18 = 0; z18 < 8; z18++)
      {
         if (h[z18] == 1)
            putBeeper();
         move();
      }
      turnAround();
      for(int z8 = 0; z8 < 8; z8++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
   }
   public void doQuad() {
      int x = 1;
   }
   public void doSquare() {
      int y = 2;
   }
}
