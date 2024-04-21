package Collections;
import java.util.HashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        mapDemo();
    }

    public static void mapDemo(){
        Map <String , Integer> fruitCalories = new HashMap() ;
        fruitCalories.put("apple" ,95) ;
        fruitCalories.put("lemon" ,20) ;
        fruitCalories.put("banana" ,105) ;
        fruitCalories.put("orange" ,45) ;
        fruitCalories.put("orange" ,17) ;

        //Emhanced For Loop
        for(var item:fruitCalories.entrySet()){
            System.out.println(item.getValue());
        }

    }
}
