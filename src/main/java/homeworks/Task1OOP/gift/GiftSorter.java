package homeworks.Task1OOP.gift;

import homeworks.Task1OOP.entity.entity.Sweets;

import java.util.Comparator;
import java.util.List;

public class GiftSorter {
    public GiftSorter() {
    }
    public void sortByWeight(List<Sweets> sweetsList){
        sweetsList.sort(Comparator.comparingInt(Sweets::getWeight));
        System.out.println(sweetsList);
    }
}
