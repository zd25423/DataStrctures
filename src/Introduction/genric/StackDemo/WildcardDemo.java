package Introduction.genric.StackDemo;

import Introduction.genric.Hero.AdHero;
import Introduction.genric.Hero.ApHero;
import Introduction.genric.Hero.Hero;

import java.util.ArrayList;

/**
 * Created by zdknight on 2017/7/11.
 */
public class WildcardDemo {
    public static void main(String[] args) {
        ArrayList<ApHero> apHeroList = new ArrayList<>();
        apHeroList.add(new ApHero());

        ArrayList<? extends Hero> heroList = new ArrayList<>();
        //? extends Hero 表示这是一个Hero泛型的子类泛型

        //heroList 的泛型可以使Hero
        //heroList 的泛型可以使APHero
        //heroList 的泛型可以使ADHero

        //可以确凿的是，从heroList取出来的对象，一定是可以转型成Hero的
        //Hero h = heroList.get(0);

        //但是不能往里面放东西
        //heroList.add(new Hero());

        ArrayList<? super Hero> SheroList = new ArrayList<>();
        //? super Hero 表示 heroList的泛型是Hero或者其父类泛型

        //heroList 的泛型可以是Hero
        //heroList 的泛型可以是Object

        //所以就可以插入Hero
        SheroList.add(new Hero("卡尔","天火",70));
        //也可以插入Hero的子类
        SheroList.add(new AdHero("火枪"));
        SheroList.add(new ApHero("天怒法师"));

        //但是，不能从里面取数据出来,因为其泛型可能是Object,而Object是强转Hero会失败
        //Hero s= SheroList.get(0);

    }

}
