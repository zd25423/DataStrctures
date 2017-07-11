package Introduction.genric.NumberDemo;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zdknight on 2017/7/11.
 */
public class genricTest {
    public static void main(String[] args) {
        ArrayList<Number> Id = new ArrayList<>();
        Id.add(6);
        Id.add(7.818);
        for (int i=0;i<Id.size();i++){
            System.out.println(Id.get(i));
        }
    }
}
