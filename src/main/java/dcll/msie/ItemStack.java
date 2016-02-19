package dcll.msie;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;

/**
 * Created by mars on 19/02/16.
 */
public class ItemStack implements SimpleStack {

    Queue<Item> queue;

    public void ItemStack(){
        queue = new ArrayDeque<Item>();
    }
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int getSize() {
        return queue.size();
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
