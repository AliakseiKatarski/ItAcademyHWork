package homeworks.Task1OOP.entity.entity;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GiftTest {

    @org.junit.jupiter.api.Test
    void getTotalWeight() {
        Gift gift=new Gift();
        Candy candy=new Candy("Jupiter",12,44);
        Lollipop lollipop=new Lollipop("Earth",44,12);
        gift.putSweets(candy);
        gift.putSweets(lollipop);
        Assertions.assertEquals(56,gift.getTotalWeight());
    }

    @org.junit.jupiter.api.Test
    void findBySugarAmount() {
        Gift gift=new Gift();
        Candy candy=new Candy("Jupiter",12,44);
        Lollipop lollipop=new Lollipop("Earth",44,12);
        gift.putSweets(candy);
        gift.putSweets(lollipop);
        List<Sweets> testList=new ArrayList<>();
        testList.add(candy);
        Assertions.assertEquals(testList,gift.findBySugarAmount(13,45));
    }
}