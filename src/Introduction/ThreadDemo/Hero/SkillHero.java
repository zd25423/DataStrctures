package Introduction.ThreadDemo.Hero;

/**
 * Created by zdknight on 2017/7/12.
 */
public class SkillHero {
    public int skillTime=3;
    public int Energy;

    public void a_du_gen(){
        while (true){
            for (int i =0;i<skillTime;i++){
                System.out.println("波动拳第"+(i+1)+"次释放");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            System.out.println("开始5秒充能");
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
