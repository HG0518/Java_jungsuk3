import java.util.*;

public class Exercise07_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Product{
    int price;

    Product(int price){
        this.price=price;
    }
}

class Buyer{
    int money=1000;
    Product[] cart = new Product[3];
    int i=0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("돈이 부족하여 "+ p +"을/를 살 수 없습니다.");
            return;
        }
        money-=p.price;
        add(p);
    }


    private void add(Product p){
        if(i==cart.length) cart=Arrays.copyOf(cart,2*i);
        cart[i++]=p;
    }

    void summary(){
        System.out.print("구입한 물건:");
        int index=0;
        while(index<cart.length&&cart[index]!=null){
            System.out.print(cart[index++]+",");
        }
        System.out.println();
        System.out.println("사용한 금액:"+(1000-money));
        System.out.println("남은 금액:"+money);
    }

}

class Tv extends Product{
    Tv(){super(100);}

    public String toString() {return "Tv";}
}

class Computer extends Product{
    Computer(){super(200);}

    public String toString() {return "Computer";}
}

class Audio extends Product{
    Audio(){super(50);}

    public String toString() {return "Audio";}
}


