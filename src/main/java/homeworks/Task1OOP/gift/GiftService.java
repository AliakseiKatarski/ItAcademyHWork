package homeworks.Task1OOP.gift;

import homeworks.Task1OOP.entity.entity.Sweets;
import java.util.ArrayList;
import java.util.List;

public class GiftService {

    public GiftService() {
    }

    public List<Sweets> findBySugarAmount(int from, int to, List<Sweets> sw){
        List<Sweets> findSugarAmount=new ArrayList<>();
        for(Sweets sweets:sw){
            if(sweets.getSugarAmount()>=from && sweets.getSugarAmount()<=to)
            {
                findSugarAmount.add(sweets);
            }
        }
        return findSugarAmount;
    }

    public int getTotalWeight(List<Sweets> sweets){
        int weight=0;
        for(Sweets sw:sweets){
            weight+=sw.getWeight();
        }
        return weight;
    }

    public void putSweets(List<Sweets> sweetsList,Sweets sweets){
        sweetsList.add(sweets);
    }

    public void deleteSweets(List<Sweets> sweetsList,Sweets sweets){
        sweetsList.remove(sweets);
    }
}
