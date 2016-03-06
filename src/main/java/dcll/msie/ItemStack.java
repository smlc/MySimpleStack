package dcll.msie;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;

/**
 * Created by mars on 19/02/16.
 */
public class ItemStack implements SimpleStack {

    Queue<Item> queue;

    public  ItemStack(){
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
        queue.add(item);
    }

    /**
     * @return
     * @throws EmptyStackException
     */
    @Override
    public Item peek() throws EmptyStackException {

        return queue.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return queue.poll();
    }
}
