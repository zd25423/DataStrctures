package Introduction.ThreadDemo.StartThread;

import Introduction.ThreadDemo.Hero.Hero;

/**
 *创建多线程的三种方式
 * 1. 继承Thread类
 * 2. 实现Runnable接口
 * 3. 匿名类的方式
 * 注： 启动线程是start()方法，run()并不能启动一个新的线程
 * Created by zdknight on 2017/7/12.
 */
public class TestThread {
    public static void main(String[] args) {
        Hero coco = new Hero();
        coco.name = "昆卡";
        coco.hp = 650;
        coco.damage = 98;

        Hero Tidal_hunter = new Hero();
        Tidal_hunter.name = "潮汐猎人";
        Tidal_hunter.hp = 700;
        Tidal_hunter.damage = 80;

        Hero qop = new Hero();
        qop.name = "痛苦女王";
        qop.hp = 600;
        qop.damage = 92;

        Hero es = new Hero();
        es.name = "撼地神牛";
        es.hp = 560;
        es.damage = 70;

        /**
         * 没有多线程版本
         */
//        while (!Tidal_hunter.isDead()){
//            coco.attackHero(Tidal_hunter);
//        }
//
//        while (!es.isDead()){
//            qop.attackHero(es);
//        }

        /**
         * 继承Thread类
         */
//        KillThread killThread = new KillThread(coco,Tidal_hunter);
//        killThread.start();
//        KillThread killThread1 = new KillThread(qop,es);
//        killThread1.start();

        /**
         * 创建类Battle，实现Runnable接口
         */
        //启动的时候，首先创建一个Battle对象，然后再根据该battle对象创建一个线程对象，并启动
//        Battle battle1 = new Battle(coco,Tidal_hunter);
//        new Thread(battle1).start();
//
//        Battle battle2 = new Battle(qop,es);
//        new Thread(battle2).start();

        /**
         * 使用匿名类，继承Thread,重写run方法，直接在run方法中写业务代码
         * 匿名类的一个好处是可以很方便的访问外部的局部变量。
         * 前提是外部的局部变量需要被声明为final。(JDK7以后就不需要了)
         */

        //匿名类
        Thread t1 = new Thread(){
            public void run(){
                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                //但是在JDK7以后，就不是必须加final的了
                while (!Tidal_hunter.isDead()){
                    coco.attackHero(Tidal_hunter);
                }
            }
        };

        t1.start();

        ////代码执行到这里，一直是main线程在运行
        try {
            //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread t2 = new Thread(){
            public void run(){
                while (!es.isDead()){
                    qop.attackHero(es);
                }
            }
        };
        //会观察到昆卡杀了女王以后，才运行T2线程
        t2.start();
    }
}
