package Introduction.genric.WildcardDemo;

import Introduction.genric.Hero.AdHero;
import Introduction.genric.Hero.ApHero;
import Introduction.genric.Hero.Hero;

import java.util.ArrayList;

/**
 * Created by zdknight on 2017/7/11.
 */
public class TraversalDemo {
    public static void iterate(ArrayList<? extends Hero> list){
        for (Hero hero :list){
            System.out.println(hero.getName());
        }

    }
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        hs.add(new Hero("李白","青莲剑歌",640));
        ArrayList<ApHero> aphs = new ArrayList<>();
        ArrayList<AdHero> adhs = new ArrayList<>();
        iterate(hs);
        iterate(aphs);
        iterate(adhs);

    }
}
