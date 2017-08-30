# A-new
import java.util.Scanner;
public class SanJiaoXing {
  public static void main(String[] args ){
      Scanner input = new Scanner(System.in);

      System.out.println("请输入第一条边:");
      int a = input.nextInt();

      System.out.println("请输入第二条边:");
      int b = input.nextInt();

      System.out.println("请输入第三条边:");
      int c = input.nextInt();

      if((a+b)<=c||(a+c)<=b||(b+c)<=a)
      {
          System.out.println("不是三角形");
      }else if(a==b&&b==c){
          System.out.println("等边三角形");
      }else if(a!=b&&b!=c&&c!=a)
      {
          System.out.println("普通三角形");
      }else {
          System.out.println("等腰三角形");
      }
  }
}
