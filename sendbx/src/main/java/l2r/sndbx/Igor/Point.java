package l2r.sndbx.Igor;

public class Point {
   public int x;
   public int y;
   public Point (int x, int y) {
      this.x=x;
      this.y=y;
   }
   public int distance(Point second) {
      return (int) Math.sqrt(Math.pow((this.x - second.x), 2) + Math.pow((this.y - second.y), 2));
   }
}
