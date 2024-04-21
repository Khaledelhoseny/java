package Inetrfaces;

public class Book implements Product  {
    private double price ;
    private String name ;
    private String color ;



//Price
    @Override
    public double getPrice(){
        return  price ;
    }
    @Override
    public void setPrice( double price ){
        this.price = price ;
    }
//Name
    @Override
    public String getName(){
        return name ;
    }
    @Override
    public void setName( String name ){
        this.name = name ;
    }
//Color
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }


}
