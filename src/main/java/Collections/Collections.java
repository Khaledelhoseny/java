package Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        setDemo();
//        mapDemo();
    }

    public static void setDemo(){
        Set <String> fruit = new HashSet() ;
        fruit.add("Apple") ;
        fruit.add("Lemon") ;
        fruit.add("Banana") ;
        fruit.add("Orange") ;
        fruit.add("Lemon") ;
        //////////////////////////////////////////////////////////
        var i = fruit.iterator() ;
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //////////////////////////////////////////////////////////
//        for (String item: fruit){
//            System.out.println(item);
//        }
        //////////////////////////////////////////////////////////
//        fruit.forEach(x -> System.out.println(x));
        //////////////////////////////////////////////////////////

    }

    public static void mapDemo(){
        Map <String , Integer> fruitCalories = new HashMap() ;
        fruitCalories.put("apple" ,95) ;
        fruitCalories.put("lemon" ,20) ;
        fruitCalories.put("banana" ,105) ;
        fruitCalories.put("orange" ,45) ;
        fruitCalories.put("orange" ,17) ;

        //Enhanced For Loop
        for(var item:fruitCalories.entrySet()){
            System.out.println(item.getValue());
        }

    }
}
