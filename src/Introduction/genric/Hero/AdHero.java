package Introduction.genric.Hero;

import javax.print.DocFlavor;

/**
 * Created by zdknight on 2017/7/11.
 */
public class AdHero extends Hero {
    private static String skill;
    private String name;
    public AdHero(){
    }
    public AdHero(String name){
        this.name = name;
    }

    public static void setSkill() {
        AdHero.skill ="物理攻击" ;
    }
    public String toString(){
        return "英雄姓名: "+name+"|攻击方式技能: "+skill;
    }
}
