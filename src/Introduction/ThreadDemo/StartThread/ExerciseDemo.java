package Introduction.ThreadDemo.StartThread;

import Introduction.ThreadDemo.Hero.SkillHero;

/**
 * 英雄有可以放一个技能叫做: 波动拳-a du gen。
 * 每隔一秒钟，可以发一次，但是只能连续发3次。
 * 发完3次之后，需要充能5秒钟，充满，再继续发
 * Created by zdknight on 2017/7/12.
 */
public class ExerciseDemo {
    public static void main(String[] args) {
        SkillHero skillHero = new SkillHero();
        skillHero.a_du_gen();
    }
}
