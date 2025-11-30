import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many products the store has ");
        int size= sc.nextInt();
        Product[] products=new Product[size];
        for(int i=0;i<size;i++){
            System.out.println("Product's name:");
            String name=sc.nextLine();
            System.out.println("Product's stock:");
            int stock=sc.nextInt();
            products[i]= new Product(name,stock);//her index iin yeni bir product objesi
        }
        while (true){
            System.out.println("Enter product name to buy or'Q'to quit");
            String choice=sc.nextLine();
            if (choice.equalsIgnoreCase("Q")){
                break;
            }
            boolean found= false;
            for(int i=0;i< products.length;i++){
                Product p=products[i];
                p.buyOne();
                found=true;
                break;
            }
            if(!found){
                System.out.println("No such product!");
            }
        }
        System.out.println("Final product information");
        for(int i=0;i< products.length;i++){
            products[i].printInfo();

        }

    }
}