package Introduction.ThreadDemo.StartThread.Exercise;

import java.util.List;

/**
 * Created by zdknight on 2017/7/12.
 */
public class LogThread extends Thread {
    private boolean found = false;
    private List<String> passwords;

    public LogThread(List<String> passwords){
        this.passwords = passwords;
        this.setDaemon(true);
        //将记录日志线程设置为守护线程
    }

    public void run(){
        while (true){
            while (passwords.isEmpty()){
                try{
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            String password = passwords.remove(0);
            System.out.println("穷举法本次生成的密码为:"+password);
        }
    }
}
