package Introduction.ThreadDemo.Hero;

/**
 * Created by zdknight on 2017/7/12.
 */
public class Hero {
    public String name;
    public float hp;
    public int damage;

    public void attackHero(Hero h){
        //把暂停时间去掉，多条线程各自会尽力去占有CPU资源
        //线程的优先级效果才可以看得出来
//        try {
//            //表示攻击间隔，每次暂停1000毫秒
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if (h.isDead()){
            System.out.println(h.name+"死亡");
        }
    }

    public boolean isDead(){
        return 0>=hp? true:false;
    }
}
