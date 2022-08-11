package homeworks.Task1OOP.gift;

import homeworks.Task1OOP.entity.entity.Sweets;

import java.util.*;

public class Gift {
    private List<Sweets> gift=new ArrayList<>();

    public Gift() {
    }

    public List<Sweets> getGift() {
        return gift;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "gift=" + gift +
                '}';
    }
}






