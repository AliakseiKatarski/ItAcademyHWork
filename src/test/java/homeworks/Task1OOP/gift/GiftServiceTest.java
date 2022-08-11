package homeworks.Task1OOP.gift;

import homeworks.Task1OOP.entity.entity.Candy;
import homeworks.Task1OOP.entity.entity.ChocolateBar;
import homeworks.Task1OOP.entity.entity.Lollipop;
import homeworks.Task1OOP.entity.entity.Sweets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GiftServiceTest {

    @Test
    void findBySugarAmount() {
        Gift gift=new Gift();
        GiftService giftService=new GiftService();
        Candy candy=new Candy("Spartak",23,44);
        Lollipop lollipop=new Lollipop("Alenka",444,56);
        ChocolateBar bar=new ChocolateBar("Snickers",12,13);
        giftService.putSweets(gift.getGift(),candy);
        giftService.putSweets(gift.getGift(),lollipop);
        giftService.putSweets(gift.getGift(),bar);
        List<Sweets> expList=new ArrayList<>();
        expList.add(lollipop);
        assertEquals(expList,giftService.findBySugarAmount(45,90,gift.getGift()));
    }

    @Test
    void getTotalWeight() {
        Gift gift=new Gift();
        GiftService giftService=new GiftService();
        Candy candy=new Candy("Spartak",23,44);
        Lollipop lollipop=new Lollipop("Alenka",444,56);
        ChocolateBar bar=new ChocolateBar("Snickers",12,13);
        giftService.putSweets(gift.getGift(),candy);
        giftService.putSweets(gift.getGift(),lollipop);
        giftService.putSweets(gift.getGift(),bar);
        int totalWeightExp=479;
        assertEquals(totalWeightExp,giftService.getTotalWeight(gift.getGift()));
    }
}