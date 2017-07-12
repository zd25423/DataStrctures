package Introduction.ThreadDemo.StartThread.Exercise;

/**
 *
 * Created by zdknight on 2017/7/12.
 */
public class GuessCode {
    public static void main(String[] args) {
        String code = randomString(3);
        System.out.println("生成的密码："+code);

        //使用FOR循环穷举密码
        char[] guessPassword = new char[3];
        for (short i ='0';i <= 'z';i++){
            for (short j = '0';j<='z';j++){
                for (short k = '0';k<='z';k++){
                    if (!isLetterOrDigit(i,j,k)){
                        //如果是特殊字符直接跳出本次循环
                        //System.out.println("生成了特殊字符"+(char)k);
                        continue;
                    }
                    guessPassword[0]=(char)i;
                    guessPassword[1]=(char)j;
                    guessPassword[2]=(char)k;
                    String guess = new String(guessPassword);
                    if (guess.equals(code)){
                        System.out.println("正确密码是："+guess);
                        break;
                    }
                }
            }
        }

        //使用递归穷举密码
        char[] guessPassword2 = new char[code.length()];
        generatePassword(guessPassword2,code);
    }
    public static boolean found = false;
    private static boolean isLetterOrDigit(short i,short j,short k){
        return Character.isLetterOrDigit(i)&&Character.isLetterOrDigit(j)&&Character.isLetterOrDigit(k);
    }

    public static void generatePassword(char[] guessPassword,String password){
        generatePassword(guessPassword,0,password);
    }
    public static void generatePassword(char[] guessPassword,int index,String password){
        if (found)
            return;
        for (short i ='0';i<='z';i++){
            char c = (char)i;
            if (!Character.isLetterOrDigit(c))
                continue;
            guessPassword[index] = c;
            if (index!=guessPassword.length-1){
                System.out.println("Index的值:"+index);
                generatePassword(guessPassword,index+1,password);
            }else {
                String guess = new String(guessPassword);
                //System.out.println("穷举的密码:"+guess);
                if (guess.equals(password)){
                    System.out.println("正确密码是"+guess);
                    found = true;
                    return;
                }
            }
        }
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
