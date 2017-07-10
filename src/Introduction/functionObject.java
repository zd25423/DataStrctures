package Introduction;

import java.util.Comparator;

/**
 * Created by zdknight on 2017/7/10.
 */
public class functionObject {
    public static void main(String[] args) {
        String [] arr = {"ZEBRA","alliagator"};
        System.out.println(cmp.findMax(arr,new CaseInsensitiveCompare()));
    }
}
class CaseInsensitiveCompare implements Comparator<String>{
    public int compare(String lhs,String rhs){
        return lhs.compareToIgnoreCase(rhs);
    }


}
class cmp{
    public static <AnyType> AnyType findMax(AnyType [] arr, Comparator<? super AnyType> cmp ){
        int maxIndex = 0;
        for (int i =1;i<arr.length;i++){
            if (cmp.compare(arr[i],arr[maxIndex])>0){
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }
}