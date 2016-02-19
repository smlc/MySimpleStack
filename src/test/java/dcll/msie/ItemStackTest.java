package dcll.msie;

import org.junit.Test;

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

    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testPop() throws Exception {

    }
}