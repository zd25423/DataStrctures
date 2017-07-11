package Introduction.genric.StackDemo;

import Introduction.genric.Hero.Hero;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by zdknight on 2017/7/11.
 */
public class HeroStack {
    LinkedList<Hero> heros = new LinkedList<>();

    public void push(Hero h){
        heros.add(h);
    }

    public Hero pull(){
        return heros.removeLast();
    }

    public Hero peek(){
        return heros.getLast();
    }

    public static void main(String[] args) {
        HeroStack heroStack = new HeroStack();
        for (int i =0;i<5;i++){
            Hero h = new Hero("虚拟英雄%"+i+"号","技能无",600);
            System.out.println("压入hero:"+h);
            heroStack.push(h);
        }
        for (int i=0;i<5;i++){
            Hero h = heroStack.pull();
            System.out.println("弹出Hero"+h);
        }
    }
}
