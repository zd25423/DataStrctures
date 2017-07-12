package Introduction.ThreadDemo.StartThread.Exercise;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zdknight on 2017/7/12.
 */
public class ThreadTest {
    public static boolean found = false;

    public static void main(String[] args) {
        String password = randomString(3);
        System.out.println("密码是:"+password);
        List<String> passwords = new ArrayList<>();

        new PasswordTherad(password,passwords).start();
        new LogThread(passwords).start();
    }

    public static String randomString(int length){
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            //System.out.println((int)(Math.random()*pool.length()));
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}
