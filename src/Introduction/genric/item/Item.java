package Introduction.genric.item;

import Introduction.genric.LoL;

/**
 * Created by zdknight on 2017/7/10.
 */
public class Item implements LoL {
    private String name;
    private int CoolDone;

    public Item(){

    }

    public Item(String name,int CoolDone){
        this.name=name;
        this.CoolDone = CoolDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoolDone() {
        return CoolDone;
    }

    public void setCoolDone(int coolDone) {
        CoolDone = coolDone;
    }
    public String toString(){
        return "物品名称: "+name+"|物品冷却: "+CoolDone;
    }
}
