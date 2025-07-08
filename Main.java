import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {


    var pets = List.of("Dog", "Cat", "Bird");

    //pets.forEach( (p) -> { System.out.println(p); } );

    //pets.forEach(System.out::println);

    pets.forEach(x -> {
      System.out.println("Pet name:" + x);
      System.out.println("Pet number:" + pets.indexOf(x));
    });


    Predicate<String> filterPets = x -> x.startsWith("D");

    pets.stream().filter(t -> filterPets.test(t)).forEach(System.out::println);

    // ArrayList<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(5);
    // numbers.add(9);
    // numbers.add(8);
    // numbers.add(1);
    // numbers.forEach( (n) -> { System.out.println(n); } );
    
  }
}