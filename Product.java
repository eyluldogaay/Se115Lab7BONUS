//BONUS!!!
public class Product {
    private String name;
    private int stock;
    public Product(String name,int stock){
        this.name=name;
        this.stock=stock;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public String getName(){
        return name;
    }
    public int getStock() {
        return stock;
    }
    //buying method
    public void buyOne(){
        if(stock>0){
            stock--;
            System.out.println( "Purchased 1: "+ name +" Remainig stock is: "+ stock);
        }else{
            System.out.println("Out of stock!");
        }
    }
    //print method
    public void printInfo(){
        System.out.println("Product: "+ name + "Stock" + stock);
    }
}
