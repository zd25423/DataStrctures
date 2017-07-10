package Introduction.genric.Hero;

import Introduction.genric.LoL;
import javafx.scene.control.Skin;

/**
 * Created by zdknight on 2017/7/10.
 */
public class Hero implements LoL{
    private String name;
    private String skill;
    private int hp;

    public Hero(){

    }
    public Hero(String name,String skill,int hp){
        this.name=name;
        this.skill=skill;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String toString(){
        return "英雄姓名: "+name+"|招牌技能: "+skill+"|初始血量: "+hp;
}
}
