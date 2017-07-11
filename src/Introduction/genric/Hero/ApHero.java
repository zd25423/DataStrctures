package Introduction.genric.Hero;

import javax.print.DocFlavor;

/**
 * Created by zdknight on 2017/7/11.
 */
public class ApHero extends Hero {
    private static String skill;
    private String name;
    public ApHero(){
    }
    public ApHero(String name){
        this.name = name;
    }


    public void setSkill() {
        this.skill = "魔法攻击";
    }

    public String toString(){
        return "英雄姓名: "+name+"|攻击方式技能: "+skill;
    }


}
