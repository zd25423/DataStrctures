package Introduction.genric.StackDemo;

import Introduction.genric.Hero.Hero;
import Introduction.genric.item.Item;

import java.util.LinkedList;

/**
 * Created by zdknight on 2017/7/11.
 */
public class ItemStack {
    LinkedList<Item> itemsStack = new LinkedList<>();

    public void push(Item h){
        itemsStack.add(h);
    }

    public Item pull(){
        return itemsStack.removeLast();
    }

    public Item peek(){
        return itemsStack .getLast();
    }

    public static void main(String[] args) {
        ItemStack itemStack = new ItemStack();
        for (int i =0;i<5;i++){
            Item I = new Item("物品"+i+"号",60);
            System.out.println("压入Item:"+I);
            itemStack.push(I);
        }
        for (int i=0;i<5;i++){
            Item I = itemStack.pull();
            System.out.println("弹出Item:"+I);
        }
    }
}
