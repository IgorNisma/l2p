package l2r.sndbx.Igor;

import java.sql.SQLOutput;

public class MyFirstProgram {

   public static void main(String[] args) {
      hello("world");
      hello("user");
      hello("Igor");

      Square s = new Square(5);
       System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4,6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
   }

   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
   }


}