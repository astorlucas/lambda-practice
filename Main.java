import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {


    var pets = List.of("dog", "cat", "bird");

    //pets.forEach( (p) -> { System.out.println(p); } );

    //pets.forEach(System.out::println);

    pets.forEach(x -> {
      System.out.println("Pet name:" + x);
      System.out.println("Pet number:" + pets.indexOf(x));
    });


    // ArrayList<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(5);
    // numbers.add(9);
    // numbers.add(8);
    // numbers.add(1);
    // numbers.forEach( (n) -> { System.out.println(n); } );
    
  }
}