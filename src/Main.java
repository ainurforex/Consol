public class Main {
    public static void main(String[] args) {
     ConsolDraw c=new ConsolDraw(150,100);
     double yi=1;

     c.border();

            for (int xi = 1; xi <3000 ; xi++) {
            yi=(Math.sin(xi));
            int x=(int)xi/20;
            int y=(int)(yi*100)+50;
               c.drawChar(x+1,y,1);

            }

        c.show();


    }
}