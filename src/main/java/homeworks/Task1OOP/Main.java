package homeworks.Task1OOP;
/*
 Определить иерархию конфет и прочих сладостей.
   Создать несколько объектов-конфет.
   Собрать детский подарок с определением его веса.
   Провести сортировку конфет в подарке на основе одного из параметров.
   Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */

import homeworks.Task1OOP.entity.entity.Gift;

public class Main {
    public static void main(String[] args) {
            Gift gift=new Gift();
            gift.createGiftBox();
    }
}

