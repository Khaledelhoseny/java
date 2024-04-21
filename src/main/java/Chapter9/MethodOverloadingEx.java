package Chapter9;

public class MethodOverloadingEx {

    public int add(int num1 , int num2){
        return num1+num2 ;
    }
    public int add(int num1 , int num2 , int num3){
        return num1+num2+num3 ;
    }

    public static void main(String[] args) {
        MethodOverloadingEx obj = new MethodOverloadingEx() ;
        System.out.println(obj.add(4, 6));
        System.out.println(obj.add(4, 6, 7));

    }

}
