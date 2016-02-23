package dcll.msie;

import org.junit.Test;
import dcll.msie.Item;

import static org.junit.Assert.*;

/**
 * Created by mars on 19/02/16.
 */
public class ItemStackTest {


    @Test
    public void testIsEmpty() throws Exception {
        //Given
        ItemStack item = new ItemStack();

        //When et Then
        assertTrue(item.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        //Given
        ItemStack item = new ItemStack();

        //When et Then
        assertEquals(0,item.getSize());
    }

    @Test
    public void testPush() throws Exception {
        //Given
        ItemStack itemStatck = new ItemStack();
        Item item = new Item("monItem",1);
        //When
        itemStatck.push(item);

        //Then
        assertEquals(1,itemStatck.getSize());
    }

    @Test
    public void testPeek() throws Exception {
        //Given
        ItemStack itemStatck = new ItemStack();
        Item item = new Item("monItem",1);

        //When
        itemStatck.push(item);
        item = itemStatck.peek();

        //Then
        assertEquals(1,itemStatck.getSize());
    }

    @Test
    public void testPop() throws Exception {
        //Given
        ItemStack itemStatck = new ItemStack();


        //When
        assertEquals(null,itemStatck.pop());

    }
}