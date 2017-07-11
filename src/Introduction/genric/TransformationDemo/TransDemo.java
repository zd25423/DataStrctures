package Introduction.genric.TransformationDemo;

import Introduction.genric.Hero.AdHero;
import Introduction.genric.Hero.Hero;

import java.util.ArrayList;

/**
 * Created by zdknight on 2017/7/11.
 */
public class TransDemo {
    public static void main(String[] args) {
        //子类转成父类 肯定成功
        Hero h = new Hero();
        AdHero ad = new AdHero();
        h = ad;

        //子类泛型无法转换为父类泛型
        ArrayList<AdHero> adHeroArrayList = new ArrayList<>();
        ArrayList<Hero> heroArrayList = new ArrayList<>();
        //adHeroArrayList = heroArrayList;

        //父类泛型也不能转换成子类泛型
        //heroArrayList = adHeroArrayList;

        //想要转换只能使用extends 和 super 关键字,详见通配符(WildCard)演示


    }
}
