package Introduction.genric.StackDemo;

import Introduction.genric.Hero.Hero;
import Introduction.genric.item.Item;

import java.util.LinkedList;

/**
 * Created by zdknight on 2017/7/11.
 */
public class MyStack<T> {
    LinkedList<T> values = new LinkedList<>();
    public void push(T t){
        values.add(t);
    }

    public T pull(){
        return values.removeLast();
    }

    public T peek(){
        return values.getLast();
    }

    public static void main(String[] args) {
        //声明此Stack时，使用泛型<Hero>就表示该Stack只能存放Hero
        MyStack<Hero> heroMyStack = new MyStack<>();
        heroMyStack.push(new Hero("水人","波浪",460));
        System.out.println(heroMyStack.peek());

        MyStack<Item> itemMyStack = new MyStack<>();
        itemMyStack.push(new Item("回城卷轴",35));
        System.out.println(itemMyStack.peek());
    }
}
