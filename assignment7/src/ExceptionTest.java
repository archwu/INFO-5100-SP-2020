import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {
  public static void execute(int[] a) {
    System.out.println("executing...");
    try{
      a[4] = 0;
    } catch (IndexOutOfBoundsException e){
      throw new MyIndexOutOfBoundException("Index outta bound："+ e.getMessage() +", lowest is " + Math.min(a.length - 1, 0) + ", highest is " + (a.length - 1));
    }
  }

  public static void executw2(List<Integer> a) {
    try{
      int b = a.get(10);
    } catch (IndexOutOfBoundsException e) {
      throw new MyIndexOutOfBoundException("Index outta bound："+ e.getMessage() +", lowest is " + Math.min(a.size() - 1, 0) + ", highest is " + (a.size() - 1));
    }
  }

  public static void main(String[] args) {
    List<Integer> in = new ArrayList<>();
    in.add(1);
    execute(new int[]{1,2,3,4});
    executw2(in);
  }
}
