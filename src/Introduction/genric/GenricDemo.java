package Introduction.genric;

import Introduction.genric.Hero.Hero;
import Introduction.genric.item.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zdknight on 2017/7/10.
 */
public class GenricDemo {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setName("海军上将，昆卡");
        h1.setSkill("幽灵船");
        h1.setHp(560);
        Item I1 = new Item();
        I1.setName("隐刀");
        I1.setCoolDone(35);

        /**
         * 直接将类型定义为该接口
         */
        List<LoL> genricHero_Item = new ArrayList<>();
        genricHero_Item.add(h1);
        genricHero_Item.add(I1);

        List<Hero> hero = new ArrayList<>();
        for (int i=0;i<5;i++){
            hero.add(new Hero("潮汐猎人"+i,"毁灭",600));
        }
        System.out.println(hero.size());



        /**
         * 使用for循环遍历
         */
        System.out.println("--使用for循环遍历List--");
        for (int i =0; i<hero.size();i++){
            Hero h = hero.get(i);
            System.out.println(h);
        }

        System.out.println("--使用迭代器遍历List--");
        /**
         * 使用迭代器遍历
         */
        Iterator<Hero> it = hero.iterator();
        while (it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
    }
}
