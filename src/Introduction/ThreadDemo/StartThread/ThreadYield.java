package Introduction.ThreadDemo.StartThread;

import Introduction.ThreadDemo.Hero.Hero;

/**
 * Created by zdknight on 2017/7/12.
 */
public class ThreadYield {
    public static void main(String[] args) {
        Hero coco = new Hero();
        coco.name = "昆卡";
        coco.hp = 65000;
        coco.damage = 1;

        Hero Tidal_hunter = new Hero();
        Tidal_hunter.name = "潮汐猎人";
        Tidal_hunter.hp = 70000;
        Tidal_hunter.damage = 1;

        Hero qop = new Hero();
        qop.name = "痛苦女王";
        qop.hp = 60000;
        qop.damage = 1;

        Hero es = new Hero();
        es.name = "撼地神牛";
        es.hp = 56000;
        es.damage = 1;

        Thread t1 = new Thread(){
            public void run(){
                while (!Tidal_hunter.isDead()){
                    coco.attackHero(Tidal_hunter);
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                while (!es.isDead()){
                    //临时暂停，可以使得T1占据更多资源
                    Thread.yield();
                    qop.attackHero(es);
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
