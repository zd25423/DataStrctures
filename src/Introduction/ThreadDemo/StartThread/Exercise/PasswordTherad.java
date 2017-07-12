package Introduction.ThreadDemo.StartThread.Exercise;

import javax.print.DocFlavor;
import java.util.List;

/**
 * 采用递归法猜密码
 * Created by zdknight on 2017/7/12.
 */
public class PasswordTherad extends Thread {
    private boolean found = false;
    private String password;
    private List<String> passwords;

    public PasswordTherad(String password,List<String> passwords){
        this.password = password;
        this.passwords = passwords;
    }

    public void run(){
        char[] guessPassword = new char[password.length()];

    }

    public void generatePassword(char[] guessPassword,String password){
        generatePassword(guessPassword,0,password);
    }

    public void generatePassword(char[] guessPassword,int index,String password){
        if (found)
            return;
        for (short i = '0';i<= 'z';i++){
            char c = (char)i;
            if (!Character.isLetterOrDigit(c))
                continue;
            guessPassword[index] = c;
            if (index!=guessPassword.length-1){
                System.out.println("index现在的值是:"+index);
                generatePassword(guessPassword,index+1,password);
            }else{
                String guess = new String(guessPassword);
                //每次穷举产生的密码都放入集合
                passwords.add(guess);
                if (guess.equals(password)){
                    System.out.println("正确的密码是："+guess);
                    found = true;
                    return;
                }
            }
        }
    }
}
