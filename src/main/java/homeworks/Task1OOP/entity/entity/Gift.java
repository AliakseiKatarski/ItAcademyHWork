package homeworks.Task1OOP.entity.entity;

import java.util.*;

public class Gift {
    private List<Sweets> gift=new ArrayList<>();

    public Gift() {
    }

    public void createGiftBox(){
        ChocolateBar bar=new ChocolateBar("Alenka",1,1);
        Lollipop lollipop=new Lollipop("Kinder",13,54);
        Candy candy=new Candy("Sparta",5,22);
        gift.add(bar);
        gift.add(lollipop);
        gift.add(candy);
    }
    public void putSweets(Sweets sweets){
        gift.add(sweets);
    }

    public int getTotalWeight(){
        int weight=0;
        for(Sweets sw:gift){
            weight+=sw.getWeight();
        }
        return weight;
    }
    public List<Sweets> findBySugarAmount(int from,int to){
        List<Sweets> findSugarAmount=new ArrayList<>();
        for(Sweets sweets:gift){
            if(sweets.getSugarAmount()>=from && sweets.getSugarAmount()<=to)
            {
                findSugarAmount.add(sweets);
            }
        }
        return findSugarAmount;
    }
    public void sortByWeight(){
        gift.sort(Comparator.comparingInt(Sweets::getWeight));
        System.out.println(gift);
    }

    @Override
    public String toString() {
        return "Gift{" +
                "gift=" + gift +
                '}';
    }
}






